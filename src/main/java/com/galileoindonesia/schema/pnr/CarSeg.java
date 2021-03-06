//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.03.31 at 11:27:25 AM ICT 
//


package com.galileoindonesia.schema.pnr;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SegNum"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartTm"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartAirV"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartFltNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Airp"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ActualStartPt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LocnCat"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LocnExpansion"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LocnNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndTm"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NumCars"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CarV"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ConfNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RateType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RateCode"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RateCat"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CarType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}YieldMgmtNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Currency"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DecPos"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RateAmt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RateGuarInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}MilesOrKm"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}MileAllow"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}MileRateAmt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExtraDayRateAmt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExtraDayMileAllow"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExtraDayMileRateAmt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExtraHourRateAmt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExtraHourMileAllow"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExtraHourMileRateAmt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TDSValidateInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ApproxTot"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ATExtraMileRate"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ATMilesOrKiloInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ATMileAllow"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ATMonthUnits"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ATWeeklyUnits"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ATWeekendUnits"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ATDailyUnits"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ATExtraHrs"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ATMandatoryChgs"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "segNum",
    "status",
    "startDt",
    "startTm",
    "startAirV",
    "startFltNum",
    "airp",
    "actualStartPt",
    "locnCat",
    "locnExpansion",
    "locnNum",
    "endDt",
    "endTm",
    "numCars",
    "carV",
    "confNum",
    "rateType",
    "rateCode",
    "rateCat",
    "carType",
    "yieldMgmtNum",
    "currency",
    "decPos",
    "rateAmt",
    "rateGuarInd",
    "milesOrKm",
    "mileAllow",
    "mileRateAmt",
    "extraDayRateAmt",
    "extraDayMileAllow",
    "extraDayMileRateAmt",
    "extraHourRateAmt",
    "extraHourMileAllow",
    "extraHourMileRateAmt",
    "tdsValidateInd",
    "approxTot",
    "atExtraMileRate",
    "atMilesOrKiloInd",
    "atMileAllow",
    "atMonthUnits",
    "atWeeklyUnits",
    "atWeekendUnits",
    "atDailyUnits",
    "atExtraHrs",
    "atMandatoryChgs"
})
@XmlRootElement(name = "CarSeg")
public class CarSeg implements Serializable
{

    @XmlElement(name = "SegNum", required = true)
    protected String segNum;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "StartDt", required = true)
    protected String startDt;
    @XmlElement(name = "StartTm", required = true)
    protected String startTm;
    @XmlElement(name = "StartAirV", required = true)
    protected String startAirV;
    @XmlElement(name = "StartFltNum", required = true)
    protected String startFltNum;
    @XmlElement(name = "Airp", required = true)
    protected String airp;
    @XmlElement(name = "ActualStartPt", required = true)
    protected String actualStartPt;
    @XmlElement(name = "LocnCat", required = true)
    protected String locnCat;
    @XmlElement(name = "LocnExpansion", required = true)
    protected String locnExpansion;
    @XmlElement(name = "LocnNum", required = true)
    protected String locnNum;
    @XmlElement(name = "EndDt", required = true)
    protected String endDt;
    @XmlElement(name = "EndTm", required = true)
    protected String endTm;
    @XmlElement(name = "NumCars", required = true)
    protected String numCars;
    @XmlElement(name = "CarV", required = true)
    protected String carV;
    @XmlElement(name = "ConfNum", required = true)
    protected String confNum;
    @XmlElement(name = "RateType", required = true)
    protected String rateType;
    @XmlElement(name = "RateCode", required = true)
    protected String rateCode;
    @XmlElement(name = "RateCat", required = true)
    protected String rateCat;
    @XmlElement(name = "CarType", required = true)
    protected String carType;
    @XmlElement(name = "YieldMgmtNum", required = true)
    protected String yieldMgmtNum;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "DecPos", required = true)
    protected String decPos;
    @XmlElement(name = "RateAmt", required = true)
    protected String rateAmt;
    @XmlElement(name = "RateGuarInd", required = true)
    protected String rateGuarInd;
    @XmlElement(name = "MilesOrKm", required = true)
    protected String milesOrKm;
    @XmlElement(name = "MileAllow", required = true)
    protected String mileAllow;
    @XmlElement(name = "MileRateAmt", required = true)
    protected String mileRateAmt;
    @XmlElement(name = "ExtraDayRateAmt", required = true)
    protected String extraDayRateAmt;
    @XmlElement(name = "ExtraDayMileAllow", required = true)
    protected String extraDayMileAllow;
    @XmlElement(name = "ExtraDayMileRateAmt", required = true)
    protected String extraDayMileRateAmt;
    @XmlElement(name = "ExtraHourRateAmt", required = true)
    protected String extraHourRateAmt;
    @XmlElement(name = "ExtraHourMileAllow", required = true)
    protected String extraHourMileAllow;
    @XmlElement(name = "ExtraHourMileRateAmt", required = true)
    protected String extraHourMileRateAmt;
    @XmlElement(name = "TDSValidateInd", required = true)
    protected String tdsValidateInd;
    @XmlElement(name = "ApproxTot", required = true)
    protected String approxTot;
    @XmlElement(name = "ATExtraMileRate", required = true)
    protected String atExtraMileRate;
    @XmlElement(name = "ATMilesOrKiloInd", required = true)
    protected String atMilesOrKiloInd;
    @XmlElement(name = "ATMileAllow", required = true)
    protected String atMileAllow;
    @XmlElement(name = "ATMonthUnits", required = true)
    protected String atMonthUnits;
    @XmlElement(name = "ATWeeklyUnits", required = true)
    protected String atWeeklyUnits;
    @XmlElement(name = "ATWeekendUnits", required = true)
    protected String atWeekendUnits;
    @XmlElement(name = "ATDailyUnits", required = true)
    protected String atDailyUnits;
    @XmlElement(name = "ATExtraHrs", required = true)
    protected String atExtraHrs;
    @XmlElement(name = "ATMandatoryChgs", required = true)
    protected String atMandatoryChgs;

    /**
     * Gets the value of the segNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegNum() {
        return segNum;
    }

    /**
     * Sets the value of the segNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegNum(String value) {
        this.segNum = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the startTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTm() {
        return startTm;
    }

    /**
     * Sets the value of the startTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTm(String value) {
        this.startTm = value;
    }

    /**
     * Gets the value of the startAirV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAirV() {
        return startAirV;
    }

    /**
     * Sets the value of the startAirV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAirV(String value) {
        this.startAirV = value;
    }

    /**
     * Gets the value of the startFltNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartFltNum() {
        return startFltNum;
    }

    /**
     * Sets the value of the startFltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartFltNum(String value) {
        this.startFltNum = value;
    }

    /**
     * Gets the value of the airp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirp() {
        return airp;
    }

    /**
     * Sets the value of the airp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirp(String value) {
        this.airp = value;
    }

    /**
     * Gets the value of the actualStartPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualStartPt() {
        return actualStartPt;
    }

    /**
     * Sets the value of the actualStartPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualStartPt(String value) {
        this.actualStartPt = value;
    }

    /**
     * Gets the value of the locnCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocnCat() {
        return locnCat;
    }

    /**
     * Sets the value of the locnCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocnCat(String value) {
        this.locnCat = value;
    }

    /**
     * Gets the value of the locnExpansion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocnExpansion() {
        return locnExpansion;
    }

    /**
     * Sets the value of the locnExpansion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocnExpansion(String value) {
        this.locnExpansion = value;
    }

    /**
     * Gets the value of the locnNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocnNum() {
        return locnNum;
    }

    /**
     * Sets the value of the locnNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocnNum(String value) {
        this.locnNum = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDt(String value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the endTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTm() {
        return endTm;
    }

    /**
     * Sets the value of the endTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTm(String value) {
        this.endTm = value;
    }

    /**
     * Gets the value of the numCars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCars() {
        return numCars;
    }

    /**
     * Sets the value of the numCars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCars(String value) {
        this.numCars = value;
    }

    /**
     * Gets the value of the carV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarV() {
        return carV;
    }

    /**
     * Sets the value of the carV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarV(String value) {
        this.carV = value;
    }

    /**
     * Gets the value of the confNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfNum() {
        return confNum;
    }

    /**
     * Sets the value of the confNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfNum(String value) {
        this.confNum = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateType(String value) {
        this.rateType = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the rateCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCat() {
        return rateCat;
    }

    /**
     * Sets the value of the rateCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCat(String value) {
        this.rateCat = value;
    }

    /**
     * Gets the value of the carType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarType() {
        return carType;
    }

    /**
     * Sets the value of the carType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarType(String value) {
        this.carType = value;
    }

    /**
     * Gets the value of the yieldMgmtNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYieldMgmtNum() {
        return yieldMgmtNum;
    }

    /**
     * Sets the value of the yieldMgmtNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYieldMgmtNum(String value) {
        this.yieldMgmtNum = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the decPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecPos() {
        return decPos;
    }

    /**
     * Sets the value of the decPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecPos(String value) {
        this.decPos = value;
    }

    /**
     * Gets the value of the rateAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateAmt() {
        return rateAmt;
    }

    /**
     * Sets the value of the rateAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateAmt(String value) {
        this.rateAmt = value;
    }

    /**
     * Gets the value of the rateGuarInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateGuarInd() {
        return rateGuarInd;
    }

    /**
     * Sets the value of the rateGuarInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateGuarInd(String value) {
        this.rateGuarInd = value;
    }

    /**
     * Gets the value of the milesOrKm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilesOrKm() {
        return milesOrKm;
    }

    /**
     * Sets the value of the milesOrKm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilesOrKm(String value) {
        this.milesOrKm = value;
    }

    /**
     * Gets the value of the mileAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileAllow() {
        return mileAllow;
    }

    /**
     * Sets the value of the mileAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileAllow(String value) {
        this.mileAllow = value;
    }

    /**
     * Gets the value of the mileRateAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileRateAmt() {
        return mileRateAmt;
    }

    /**
     * Sets the value of the mileRateAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileRateAmt(String value) {
        this.mileRateAmt = value;
    }

    /**
     * Gets the value of the extraDayRateAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraDayRateAmt() {
        return extraDayRateAmt;
    }

    /**
     * Sets the value of the extraDayRateAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraDayRateAmt(String value) {
        this.extraDayRateAmt = value;
    }

    /**
     * Gets the value of the extraDayMileAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraDayMileAllow() {
        return extraDayMileAllow;
    }

    /**
     * Sets the value of the extraDayMileAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraDayMileAllow(String value) {
        this.extraDayMileAllow = value;
    }

    /**
     * Gets the value of the extraDayMileRateAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraDayMileRateAmt() {
        return extraDayMileRateAmt;
    }

    /**
     * Sets the value of the extraDayMileRateAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraDayMileRateAmt(String value) {
        this.extraDayMileRateAmt = value;
    }

    /**
     * Gets the value of the extraHourRateAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraHourRateAmt() {
        return extraHourRateAmt;
    }

    /**
     * Sets the value of the extraHourRateAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraHourRateAmt(String value) {
        this.extraHourRateAmt = value;
    }

    /**
     * Gets the value of the extraHourMileAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraHourMileAllow() {
        return extraHourMileAllow;
    }

    /**
     * Sets the value of the extraHourMileAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraHourMileAllow(String value) {
        this.extraHourMileAllow = value;
    }

    /**
     * Gets the value of the extraHourMileRateAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraHourMileRateAmt() {
        return extraHourMileRateAmt;
    }

    /**
     * Sets the value of the extraHourMileRateAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraHourMileRateAmt(String value) {
        this.extraHourMileRateAmt = value;
    }

    /**
     * Gets the value of the tdsValidateInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDSValidateInd() {
        return tdsValidateInd;
    }

    /**
     * Sets the value of the tdsValidateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDSValidateInd(String value) {
        this.tdsValidateInd = value;
    }

    /**
     * Gets the value of the approxTot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproxTot() {
        return approxTot;
    }

    /**
     * Sets the value of the approxTot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproxTot(String value) {
        this.approxTot = value;
    }

    /**
     * Gets the value of the atExtraMileRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATExtraMileRate() {
        return atExtraMileRate;
    }

    /**
     * Sets the value of the atExtraMileRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATExtraMileRate(String value) {
        this.atExtraMileRate = value;
    }

    /**
     * Gets the value of the atMilesOrKiloInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMilesOrKiloInd() {
        return atMilesOrKiloInd;
    }

    /**
     * Sets the value of the atMilesOrKiloInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMilesOrKiloInd(String value) {
        this.atMilesOrKiloInd = value;
    }

    /**
     * Gets the value of the atMileAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMileAllow() {
        return atMileAllow;
    }

    /**
     * Sets the value of the atMileAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMileAllow(String value) {
        this.atMileAllow = value;
    }

    /**
     * Gets the value of the atMonthUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMonthUnits() {
        return atMonthUnits;
    }

    /**
     * Sets the value of the atMonthUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMonthUnits(String value) {
        this.atMonthUnits = value;
    }

    /**
     * Gets the value of the atWeeklyUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATWeeklyUnits() {
        return atWeeklyUnits;
    }

    /**
     * Sets the value of the atWeeklyUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATWeeklyUnits(String value) {
        this.atWeeklyUnits = value;
    }

    /**
     * Gets the value of the atWeekendUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATWeekendUnits() {
        return atWeekendUnits;
    }

    /**
     * Sets the value of the atWeekendUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATWeekendUnits(String value) {
        this.atWeekendUnits = value;
    }

    /**
     * Gets the value of the atDailyUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATDailyUnits() {
        return atDailyUnits;
    }

    /**
     * Sets the value of the atDailyUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATDailyUnits(String value) {
        this.atDailyUnits = value;
    }

    /**
     * Gets the value of the atExtraHrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATExtraHrs() {
        return atExtraHrs;
    }

    /**
     * Sets the value of the atExtraHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATExtraHrs(String value) {
        this.atExtraHrs = value;
    }

    /**
     * Gets the value of the atMandatoryChgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMandatoryChgs() {
        return atMandatoryChgs;
    }

    /**
     * Sets the value of the atMandatoryChgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMandatoryChgs(String value) {
        this.atMandatoryChgs = value;
    }

}
