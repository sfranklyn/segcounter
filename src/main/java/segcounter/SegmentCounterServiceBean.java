/*
 * SegmentCounterServiceBean.java
 * 
 * Created on Nov 27, 2008, 4:12:39 PM
 */
package segcounter;

import com.galileoindonesia.schema.pnr.AirSeg;
import com.galileoindonesia.schema.pnr.LNameInfo;
import com.galileoindonesia.schema.pnr.PNRAddr;
import com.galileoindonesia.schema.pnr.PNRBFManagement10;
import com.galileoindonesia.schema.pnr.PNRBFRetrieve;
import com.galileoindonesia.schema.pnr.PNRBFRetrieveMods;
import com4j.COM4J;
import galileoclub.ejb.dao.PccsDaoBean;
import galileoclub.ejb.dao.PnrcountsDaoBean;
import galileoclub.ejb.dao.PnrsDaoBean;
import galileoclub.ejb.dao.PointsDaoBean;
import galileoclub.ejb.datamodel.*;
import galileoclub.ejb.service.ConfigsServiceBean;
import galileoclub.ejb.service.ConfigsServiceRemote;
import galileoclub.jpa.*;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Samuel Franklyn
 */

@Singleton
@Named("SegmentCounter")
public class SegmentCounterServiceBean {

    private static final Logger log = Logger.getLogger(SegmentCounterServiceBean.class.getName());
    private static final Pattern linePattern = Pattern.compile("\\r", Pattern.DOTALL | Pattern.MULTILINE);
    private static final String xmlHeader = "<PNRBFManagement_10>";
    private static final String soapHeader = "<PNRBFManagement_10 " + "xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' " + "xmlns='http://www.galileoindonesia.com/schema/PNR' " + "xsi:schemaLocation='http://www.galileoindonesia.com/schema/PNR " + "PNRBFManagement10.xsd'>";
    private static boolean debug = false;
    private JAXBContext bookingJc = null;
    @Inject
    private ConfigsServiceRemote configsServiceRemote;
    @Inject
    private PnrsDaoBean pnrsDaoRemote;
    @Inject
    private PccsDataModelRemote pccsDataModelRemote;
    @Inject
    private PnrsDataModelRemote pnrsDataModelRemote;
    @Inject
    private PnrcountsDaoBean pnrcountsDaoRemote;
    @Inject
    private PnrcountsDataModelRemote pnrcountsDataModelRemote;
    @Inject
    private PointsDaoBean pointsDaoRemote;
    @Inject
    private PccsDaoBean pccsDaoRemote;

    public void countSegment() {
        try {
            log.log(Level.INFO, "GCLUB0001: Running Segment Counter Job at {0}", Calendar.getInstance().getTime());
            Configs configs = configsServiceRemote.getByKey(ConfigsServiceBean.SEGCOUNT_SIGNON_PASSWORD);
            if (configs == null) {
                String message = "GCLUB0001: SignOn and Password Config not found";
                log.severe(message);
                return;
            }
            String[] signOnPassword = configs.getConfigValue().split("/");
            String signOn = signOnPassword[0];
            String password = signOnPassword[1];

            configs = configsServiceRemote.getByKey(ConfigsServiceBean.SEGCOUNT_HCM);
            if (configs == null) {
                String message = "GCLUB0001: HCM Config not found";
                log.severe(message);
                return;
            }
            String hcm = (String) configs.getConfigValue();

            configs = configsServiceRemote.getByKey(ConfigsServiceBean.DEBUG_MODE);
            if (configs != null) {
                if (((String) configs.getConfigValue()).equalsIgnoreCase("true")) {
                    debug = true;
                    String message = "GCLUB0001: Running on debug mode";
                    log.info(message);
                }
            }

            DateTime yesterday = (new DateTime()).minusDays(1);
            bookingJc = JAXBContext.newInstance("com.galileoindonesia.schema.pnr");
            createSegCountByDate(yesterday, signOn, password, hcm);

            log.log(Level.INFO, "GCLUB0001: Finish Segment Counter Job at {0}", Calendar.getInstance().getTime());
        } catch (Exception ex) {
            String message = "GCLUB0001:" + ex.toString();
            log.log(Level.SEVERE, message, ex);
        }
    }

    @SuppressWarnings("unchecked")
    private void createSegCountByDate(DateTime day,
            String signOn, String password, String hcm) {
        DateTime startTime = new DateTime();
        Suta suta = null;
        Date daySql = new Date(day.getMillis());
        String message;
        AtomicInteger pnrProcessed = new AtomicInteger(0);

        try {
            suta = SutaFactory.createScriptableUniversalTransAgent();
            suta.hcmName(hcm);
            DateTimeFormatter dtfdM = DateTimeFormat.forPattern("ddMMM");
            String dayStr = dtfdM.print(day).toUpperCase();

            DateTime sixMonth = day.plusMonths(6);
            String sixMonthStr = dtfdM.print(sixMonth).toUpperCase();

            Map<String, Object> param = new HashMap<String, Object>();

            int maxRetry = 1;
            pnrsDaoRemote.updateNotActive();
            List pccsList = pccsDataModelRemote.getAll(PccsDataModelBean.SELECT_ALL, null, 0, -1);
            for (int idx = 0; idx < pccsList.size(); idx++) {
                suta.beginSession(Integer.MIN_VALUE);
                String res = terminalSubmit(suta, "SON/" + signOn);
                if (res.contains("PASSWORD")) {
                    res = terminalSubmit(suta, "PASSWORD? " + password);
                }
                if (!res.contains("SIGN-ON COMPLETE")) {
                    int retry = 0;
                    while (!res.contains("SIGN-ON COMPLETE") && retry < maxRetry) {
                        terminalSubmit(suta, "^J");
                        suta.endSession(Integer.MIN_VALUE + 1);
                        suta.beginSession(Integer.MIN_VALUE);
                        res = terminalSubmit(suta, "SON/" + signOn);
                        if (res.contains("PASSWORD")) {
                            res = terminalSubmit(suta, "PASSWORD? " + password);
                        }
                        retry++;
                    }
                    if (!res.contains("SIGN-ON COMPLETE")) {
                        terminalSubmit(suta, "I");
                        terminalSubmit(suta, "SOF");
                        suta.endSession(Integer.MIN_VALUE + 1);
                        message = "GCLUB0001: Sign-on not succesfull." + res;
                        Logger.getLogger(this.getClass().getName()).
                                log(Level.SEVERE, message);
                        return;
                    }
                }

                Pccs pccs = (Pccs) pccsList.get(idx);
                String pcc = pccs.getPccsPcc();
                param.put("pnrsPcc", pcc);
                terminalSubmit(suta, "SEM/" + pcc + "/AG");
                res = terminalSubmit(suta, "LD/ALL/" + dayStr + "*" + sixMonthStr + "-D");
                String[] lines = linePattern.split(res);
                while (lines != null) {
                    for (int idx1 = 0; idx1 < lines.length; idx1++) {
                        if (lines[idx1].matches("^\\s+\\d+[.].*$")) {
                            String recLoc = lines[idx1].substring(24, 30);
                            Pnrs pnrs = new Pnrs();
                            pnrs.setPnrsPcc(pcc);
                            param.put("pnrsRecloc", recLoc);
                            pnrs.setPnrsRecloc(recLoc);
                            String son = lines[idx1].substring(32, 34);
                            pnrs.setPnrsSignon(son);
                            Date created = day.toDate();
                            DateTimeFormatter dtfdMY = DateTimeFormat.forPattern("ddMMMyy");
                            try {
                                created = new Date(dtfdMY.parseDateTime(lines[idx1].substring(41, 48)).toDate().getTime());
                            } catch (Exception ex) {
                            }
                            param.put("pnrsCreated", created);
                            pnrs.setPnrsCreated(created);
                            Date departed = day.toDate();
                            try {
                                departed = new Date(dtfdMY.parseDateTime(lines[idx1].substring(50, 57)).toDate().getTime());
                            } catch (Exception ex) {
                            }
                            pnrs.setPnrsDeparted(departed);
                            List pnrsList = pnrsDataModelRemote.getAll(PnrsDataModelBean.SELECT_BY_KEY, param, 0, 1);
                            if (pnrsList.size() <= 0) {
                                pnrs.setPnrsActive(true);
                                pnrs.setPnrsNew(true);
                                pnrs.setPnrsCount(0);
                                pnrs.setPnrsNameCount(0);
                                pnrs.setPnrsWaitcount(0);
                                pnrsDaoRemote.insert(pnrs);
                            } else {
                                Pnrs pnrsUpdate = (Pnrs) pnrsList.get(0);
                                pnrsUpdate.setPnrsActive(true);
                                pnrsUpdate.setPnrsDeparted(departed);
                                pnrsDaoRemote.update(pnrsUpdate);
                            }
                        }
                    }
                    String lastPcc = lines[lines.length - 1];
                    if (lastPcc.contains(")]")) {
                        res = terminalSubmit(suta, "MD");
                        lines = linePattern.split(res);
                    } else {
                        lines = null;
                    }
                }
                terminalSubmit(suta, "I");
                terminalSubmit(suta, "SOF");
                suta.endSession(Integer.MIN_VALUE + 1);
            }

            param = new HashMap<String, Object>();
            param.put("pnrsDeparted", daySql);
            List pnrsList = pnrsDataModelRemote.getAll(PnrsDataModelBean.SELECT_BY_ACTIVE, param, 0, -1);
            ExecutorService es1 = Executors.newFixedThreadPool(5);
            final int subListSize = 100;
            for (int idx = 0; idx < pnrsList.size(); idx = idx + subListSize) {
                List pnrsSubList;
                if ((idx + subListSize) < pnrsList.size()) {
                    pnrsSubList = pnrsList.subList(idx, idx + subListSize);
                } else {
                    pnrsSubList = pnrsList.subList(idx, pnrsList.size());
                }
                CountSegment countSegment = new CountSegment(pnrsSubList, signOn, hcm, pnrProcessed);
                es1.submit(countSegment);
                log.log(Level.INFO, "GCLUB0001: Submitting PNR {0} to {1} to counting segment job", new Object[]{idx + 1, idx + pnrsSubList.size()});
            }
            es1.shutdown();
            while (!es1.isTerminated()) {
                TimeUnit.MINUTES.sleep(1);
                log.log(Level.INFO, "GCLUB0001: Processed {0} of {1} pnrs", new Object[]{pnrProcessed.get(), pnrsList.size()});
            }
            pnrsDaoRemote.deleteNotActive();

            DateTime endTime = new DateTime();
            Duration duration = new Duration(startTime, endTime);
            Period period = duration.toPeriod();
            log.log(Level.INFO, "GCLUB0001: Finish Counting Segment job at {0}", endTime.toString());
            message = "GCLUB0001: Counting Segment Job runs in " + period.getHours() + " hours " + period.getMinutes() + " minutes";
            log.info(message);
        } catch (Exception ex) {
            message = "GCLUB0001:" + ex.toString();
            log.log(Level.SEVERE, message, ex);
        } finally {
            if (suta != null) {
                try {
                    terminalSubmit(suta, "I");
                    terminalSubmit(suta, "SOF");
                    suta.endSession(Integer.MIN_VALUE + 1);
                    suta.dispose();
                    COM4J.cleanUp();
                } catch (Exception ex) {
                    message = "GCLUB0001:" + ex.toString();
                    log.log(Level.SEVERE, message, ex);
                }
            }
        }
    }

    class CountSegment implements Runnable {

        private List<Map> pnrsSubList;
        private String signOn;
        private String hcm;
        private AtomicInteger pnrProcessed;

        public CountSegment(List<Map> pnrsSubList, String signOn, String hcm,
                AtomicInteger pnrProcessed) {
            this.pnrsSubList = pnrsSubList;
            this.signOn = signOn;
            this.hcm = hcm;
            this.pnrProcessed = pnrProcessed;
        }

        @Override
        @SuppressWarnings("unchecked")
        public void run() {
            Suta suta = null;
            String result;
            String message;
            try {
                Marshaller bookingMarshaller = bookingJc.createMarshaller();
                Unmarshaller bookingUnmarshaller = bookingJc.createUnmarshaller();
                suta = SutaFactory.createScriptableUniversalTransAgent();
                suta.hcmName(hcm);
                PNRBFManagement10 request = new PNRBFManagement10();
                PNRBFRetrieveMods pnrBFRetrieveMods = new PNRBFRetrieveMods();
                request.getInsertSegAfterModsOrSegCancelModsOrPNRBFSecondaryBldChgMods().add(pnrBFRetrieveMods);
                PNRAddr pnrAddr = new PNRAddr();
                pnrBFRetrieveMods.getPNRAddrOrTargetCRSInfo().add(pnrAddr);
                pnrAddr.setFileAddr("");
                pnrAddr.setCodeCheck("");
                Pnrcounts pnrcounts = new Pnrcounts();
                for (int idx = 0; idx < pnrsSubList.size(); idx++) {
                    Pnrs pnrs = (Pnrs) pnrsSubList.get(idx);
                    String pcc = pnrs.getPnrsPcc();
                    String recLoc = pnrs.getPnrsRecloc();
                    pnrAddr.setRecLoc(recLoc);
                    ByteArrayOutputStream jaxbBaos = new ByteArrayOutputStream();
                    bookingMarshaller.marshal(request, jaxbBaos);
                    String jaxbInput = jaxbBaos.toString();
                    result = suta.syncSubmit(XsIdentity.identity(signOn, pcc), jaxbInput, XsFilter.ALL);
                    result = result.replace('\u001c', '.');
                    String jaxbReply = result.replace(xmlHeader, soapHeader);
                    PNRBFManagement10 reply = (PNRBFManagement10) bookingUnmarshaller.unmarshal(new StreamSource(new StringReader(jaxbReply)));
                    Pccs pccs = pccsDaoRemote.findByPccsPcc(pcc);
                    PNRBFRetrieve pnrBFRetrieve = getPNRBFRetrieve(reply);
                    int airSegCount = 0;
                    int waitSegCount = 0;
                    int nameCount = 0;
                    if ((pnrBFRetrieve != null) && (pnrBFRetrieve.getControlOrLNameInfoOrFNameInfo() != null)) {
                        if (pnrBFRetrieve.getControlOrLNameInfoOrFNameInfo().size() > 0) {
                            for (Object obj : pnrBFRetrieve.getControlOrLNameInfoOrFNameInfo()) {
                                if (obj.getClass().getSimpleName().equals("LNameInfo")) {
                                    LNameInfo lNameInfo = (LNameInfo) obj;
                                    if (!lNameInfo.getNameType().equals("I")) {
                                        int numPsgrs = Integer.valueOf(lNameInfo.getNumPsgrs()).intValue();
                                        nameCount = nameCount + numPsgrs;
                                    }
                                }
                                if (obj.getClass().getSimpleName().equals("AirSeg")) {
                                    AirSeg airSeg = (AirSeg) obj;
                                    if (airSeg.getStatus().equals("HK") || airSeg.getStatus().equals("RR") || airSeg.getStatus().equals("KL") || airSeg.getStatus().equals("KK") || airSeg.getStatus().equals("TK")) {
                                        airSegCount++;
                                    }
                                    if (airSeg.getStatus().equals("HL")) {
                                        waitSegCount++;
                                    }
                                }
                            }
                        }
                    }

                    int segCountNewCount = airSegCount * nameCount;
                    int nameCountNewCount = nameCount;
                    if (airSegCount <= 0) {
                        nameCountNewCount = 0;
                    }
                    int waitSegCountNewCount = waitSegCount * nameCount;
                    int segCountOldCount = pnrs.getPnrsCount();
                    int nameCountOldCount = pnrs.getPnrsNameCount();
                    int waitSegCountOldCount = pnrs.getPnrsWaitcount();
                    boolean segCountNew = pnrs.getPnrsNew();
                    DateTime countDate = new DateTime();
                    DateTimeFormatter dtfYM = DateTimeFormat.forPattern("yyyyMM");
                    String dayYM = dtfYM.print(countDate.minusDays(1));
                    DateTimeFormatter dtfYMD = DateTimeFormat.forPattern("yyyyMMdd");
                    String dayYMD = dtfYMD.print(countDate.minusDays(1));

                    if (segCountNew) {
                        if ((segCountNewCount > 0) || (waitSegCountNewCount > 0) || nameCount > 0) {
                            Date pnrsCreated = new Date(pnrs.getPnrsCreated().getTime());
                            String createdYM = dtfYM.print(pnrsCreated.getTime());
                            if (createdYM.equals(dayYM)) {
                                pnrcounts.setPnrcountsCountdate(countDate.toDate());
                                pnrcounts.setPnrcountsRecloc(recLoc);
                                pnrcounts.setPnrcountsPcc(pcc);
                                pnrcounts.setPnrcountsSignon(pnrs.getPnrsSignon());
                                pnrcounts.setPnrcountsCount(segCountNewCount);
                                pnrcounts.setPnrcountsNameCount(nameCountNewCount);
                                pnrcounts.setPnrcountsWaitcount(waitSegCountNewCount);
                                pnrcounts.setPnrcountsYearmonth(dayYM);
                                pnrcounts.setPnrcountsCreated(pnrsCreated);
                                pnrcounts.setPnrcountsDeparted(pnrs.getPnrsDeparted());
                                pnrcounts.setPnrcountsYearmonthday(dayYMD);
                                pnrcountsDaoRemote.insert(pnrcounts);
                                pnrs.setPnrsNew(false);
                            } else {
                                if (debug) {
                                    message = "GCLUB0001:---" + recLoc + "," + segCountNewCount + "," + waitSegCountNewCount + "," + nameCount
                                            + "," + dayYM + "," + createdYM;
                                    log.log(Level.WARNING, message);
                                }
                            }
                        } else {
                            if (debug) {
                                message = "GCLUB0001:***" + recLoc + "," + segCountNewCount + "," + waitSegCountNewCount + "," + nameCount
                                        + "," + dayYM;
                                log.log(Level.WARNING, message);
                            }
                        }
                    } else {
                        if ((segCountNewCount != segCountOldCount) || (waitSegCountNewCount != waitSegCountOldCount)) {
                            pnrcounts.setPnrcountsCountdate(countDate.toDate());
                            pnrcounts.setPnrcountsRecloc(recLoc);
                            pnrcounts.setPnrcountsPcc(pcc);
                            pnrcounts.setPnrcountsSignon(pnrs.getPnrsSignon());
                            pnrcounts.setPnrcountsCount(segCountNewCount - segCountOldCount);
                            pnrcounts.setPnrcountsNameCount(nameCountNewCount - nameCountOldCount);
                            pnrcounts.setPnrcountsWaitcount(waitSegCountNewCount - waitSegCountOldCount);
                            pnrcounts.setPnrcountsYearmonth(dayYM);
                            pnrcounts.setPnrcountsCreated(pnrs.getPnrsCreated());
                            pnrcounts.setPnrcountsDeparted(pnrs.getPnrsDeparted());
                            pnrcounts.setPnrcountsYearmonthday(dayYMD);
                            pnrcountsDaoRemote.insert(pnrcounts);
                            pnrs.setPnrsNew(false);
                        } else {
                            if (debug) {
                                message = "GCLUB0001:*-*" + recLoc + "," + segCountNewCount + "," + waitSegCountNewCount + "," + nameCount
                                        + "," + dayYM;
                                log.log(Level.WARNING, message);
                            }
                        }
                    }

                    //pnrs.setPnrsNew(false);
                    pnrs.setPnrsCount(segCountNewCount);
                    pnrs.setPnrsNameCount(nameCountNewCount);
                    pnrs.setPnrsWaitcount(waitSegCountNewCount);
                    pnrsDaoRemote.update(pnrs);
                    pnrProcessed.getAndIncrement();
                }
            } catch (Exception ex) {
                message = "GCLUB0001:" + ex.toString();
                log.log(Level.SEVERE, message, ex);
            } finally {
                if (suta != null) {
                    try {
                        suta.dispose();
                        COM4J.cleanUp();
                    } catch (Exception ex) {
                        message = "GCLUB0001:" + ex.toString();
                        log.log(Level.SEVERE, message, ex);
                    }
                }
            }
        }
    }

    private String terminalSubmit(Suta suta, String req) {
        log.log(Level.INFO, "GCLUB0001: {0}", req);
        String res = suta.terminalSubmit(req);
        if (res == null) {
            res = "";
        }
        int waitSecond = 0;
        int maxWaitMinutes = 10;
        while (res.equals("")) {
            try {
                TimeUnit.MINUTES.sleep(1);
                waitSecond++;
                if (waitSecond > maxWaitMinutes) {
                    log.log(Level.SEVERE, "GCLUB0001:{0}", res);
                    String message = "Terminal did not respond in " + maxWaitMinutes + " minutes";
                    throw new RuntimeException(message);
                }
                res = suta.getTerminalBuffer();
                if (res == null) {
                    res = "";
                }
            } catch (InterruptedException ex) {
                log.log(Level.SEVERE, ex.toString(), ex);
            }
        }
        log.log(Level.INFO, "GCLUB0001: {0}", res);
        return res;
    }

    private PNRBFRetrieve getPNRBFRetrieve(PNRBFManagement10 reply) {
        if (reply.getInsertSegAfterModsOrSegCancelModsOrPNRBFSecondaryBldChgMods().size() > 0) {
            for (Object obj : reply.getInsertSegAfterModsOrSegCancelModsOrPNRBFSecondaryBldChgMods()) {
                if (obj.getClass().getSimpleName().equals("PNRBFRetrieve")) {
                    PNRBFRetrieve pnrBFRetrieve = (PNRBFRetrieve) obj;
                    return pnrBFRetrieve;
                }
            }
        }
        return null;
    }

    public void transferToPoint(String yearMonth) {
        Integer pointYear = Integer.valueOf(yearMonth.substring(0, 4));
        Integer pointMonth = Integer.valueOf(yearMonth.substring(4, 6));
        pointsDaoRemote.deleteYearMonth(pointYear, pointMonth);
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("pnrcountsYearMonth", yearMonth);
        List pnrCountsList = pnrcountsDataModelRemote.getAll(PnrcountsDataModelBean.SELECT_GROUP_BY_PCCSIGNON_BY_YEARMONTH, param, 0, -1);
        transferToPoint1(yearMonth, pnrCountsList);
        pnrCountsList = pnrcountsDataModelRemote.getAll(PnrcountsDataModelBean.SELECT_GROUP_BY_PCCSIGNON_BY_YEARMONTH1, param, 0, -1);
        transferToPoint1(yearMonth, pnrCountsList);
    }

    private void transferToPoint1(String yearMonth, List pnrCountsList) throws NumberFormatException {
        Integer pointYear = Integer.valueOf(yearMonth.substring(0, 4));
        Integer pointMonth = Integer.valueOf(yearMonth.substring(4, 6));
        for (Object obj : pnrCountsList) {
            Object[] objArray = (Object[]) obj;
            String pcc = (String) objArray[0];
            String son = (String) objArray[1];
            String userCode = (String) objArray[2];
            BigDecimal count = (BigDecimal) objArray[3];
            Points points = new Points();
            points.setPointPcc(pcc);
            points.setPointSignon(son);
            points.setPointUserCode(userCode);
            points.setPointCount(count.intValue());
            points.setPointYear(pointYear);
            points.setPointMonth(pointMonth);
            points.setPointDay(1);
            Integer pointValue = (Integer) objArray[4];
            if (pointValue != null) {
                points.setPointValue(pointValue);
            }
            pointsDaoRemote.insert(points);
        }
    }
}
