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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}UniqueKey"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CRTOutput"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ErrMsg"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AgntAlert"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SmartParsedData"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NextGenInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spares1"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FQSOnlyItin"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}HostUse14"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IFQLastF0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IFQLastFQ"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IFQLastD"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IFQLastB"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IFQLastV"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}HostUse20"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd1"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd2"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd3"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd4"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd5"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd6"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd7"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd8"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd9"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd10"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd11"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd12"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd13"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd14"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd15"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AppInd16"/>
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
    "uniqueKey",
    "crtOutput",
    "errMsg",
    "agntAlert",
    "smartParsedData",
    "nextGenInd",
    "spares1",
    "fqsOnlyItin",
    "hostUse14",
    "ifqLastF0",
    "ifqLastFQ",
    "ifqLastD",
    "ifqLastB",
    "ifqLastV",
    "hostUse20",
    "appInd1",
    "appInd2",
    "appInd3",
    "appInd4",
    "appInd5",
    "appInd6",
    "appInd7",
    "appInd8",
    "appInd9",
    "appInd10",
    "appInd11",
    "appInd12",
    "appInd13",
    "appInd14",
    "appInd15",
    "appInd16"
})
@XmlRootElement(name = "RespHeader")
public class RespHeader
    implements Serializable
{

    @XmlElement(name = "UniqueKey", required = true)
    protected String uniqueKey;
    @XmlElement(name = "CRTOutput", required = true)
    protected String crtOutput;
    @XmlElement(name = "ErrMsg", required = true)
    protected ErrMsg errMsg;
    @XmlElement(name = "AgntAlert", required = true)
    protected String agntAlert;
    @XmlElement(name = "SmartParsedData", required = true)
    protected String smartParsedData;
    @XmlElement(name = "NextGenInd", required = true)
    protected String nextGenInd;
    @XmlElement(name = "Spares1", required = true)
    protected String spares1;
    @XmlElement(name = "FQSOnlyItin", required = true)
    protected String fqsOnlyItin;
    @XmlElement(name = "HostUse14", required = true)
    protected String hostUse14;
    @XmlElement(name = "IFQLastF0", required = true)
    protected String ifqLastF0;
    @XmlElement(name = "IFQLastFQ", required = true)
    protected String ifqLastFQ;
    @XmlElement(name = "IFQLastD", required = true)
    protected String ifqLastD;
    @XmlElement(name = "IFQLastB", required = true)
    protected String ifqLastB;
    @XmlElement(name = "IFQLastV", required = true)
    protected String ifqLastV;
    @XmlElement(name = "HostUse20", required = true)
    protected String hostUse20;
    @XmlElement(name = "AppInd1", required = true)
    protected String appInd1;
    @XmlElement(name = "AppInd2", required = true)
    protected String appInd2;
    @XmlElement(name = "AppInd3", required = true)
    protected String appInd3;
    @XmlElement(name = "AppInd4", required = true)
    protected String appInd4;
    @XmlElement(name = "AppInd5", required = true)
    protected String appInd5;
    @XmlElement(name = "AppInd6", required = true)
    protected String appInd6;
    @XmlElement(name = "AppInd7", required = true)
    protected String appInd7;
    @XmlElement(name = "AppInd8", required = true)
    protected String appInd8;
    @XmlElement(name = "AppInd9", required = true)
    protected String appInd9;
    @XmlElement(name = "AppInd10", required = true)
    protected String appInd10;
    @XmlElement(name = "AppInd11", required = true)
    protected String appInd11;
    @XmlElement(name = "AppInd12", required = true)
    protected String appInd12;
    @XmlElement(name = "AppInd13", required = true)
    protected String appInd13;
    @XmlElement(name = "AppInd14", required = true)
    protected String appInd14;
    @XmlElement(name = "AppInd15", required = true)
    protected String appInd15;
    @XmlElement(name = "AppInd16", required = true)
    protected String appInd16;

    /**
     * Gets the value of the uniqueKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     * Sets the value of the uniqueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueKey(String value) {
        this.uniqueKey = value;
    }

    /**
     * Gets the value of the crtOutput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRTOutput() {
        return crtOutput;
    }

    /**
     * Sets the value of the crtOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRTOutput(String value) {
        this.crtOutput = value;
    }

    /**
     * Gets the value of the errMsg property.
     * 
     * @return
     *     possible object is
     *     {@link ErrMsg }
     *     
     */
    public ErrMsg getErrMsg() {
        return errMsg;
    }

    /**
     * Sets the value of the errMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrMsg }
     *     
     */
    public void setErrMsg(ErrMsg value) {
        this.errMsg = value;
    }

    /**
     * Gets the value of the agntAlert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgntAlert() {
        return agntAlert;
    }

    /**
     * Sets the value of the agntAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgntAlert(String value) {
        this.agntAlert = value;
    }

    /**
     * Gets the value of the smartParsedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmartParsedData() {
        return smartParsedData;
    }

    /**
     * Sets the value of the smartParsedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmartParsedData(String value) {
        this.smartParsedData = value;
    }

    /**
     * Gets the value of the nextGenInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextGenInd() {
        return nextGenInd;
    }

    /**
     * Sets the value of the nextGenInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextGenInd(String value) {
        this.nextGenInd = value;
    }

    /**
     * Gets the value of the spares1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpares1() {
        return spares1;
    }

    /**
     * Sets the value of the spares1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpares1(String value) {
        this.spares1 = value;
    }

    /**
     * Gets the value of the fqsOnlyItin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFQSOnlyItin() {
        return fqsOnlyItin;
    }

    /**
     * Sets the value of the fqsOnlyItin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFQSOnlyItin(String value) {
        this.fqsOnlyItin = value;
    }

    /**
     * Gets the value of the hostUse14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostUse14() {
        return hostUse14;
    }

    /**
     * Sets the value of the hostUse14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostUse14(String value) {
        this.hostUse14 = value;
    }

    /**
     * Gets the value of the ifqLastF0 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFQLastF0() {
        return ifqLastF0;
    }

    /**
     * Sets the value of the ifqLastF0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFQLastF0(String value) {
        this.ifqLastF0 = value;
    }

    /**
     * Gets the value of the ifqLastFQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFQLastFQ() {
        return ifqLastFQ;
    }

    /**
     * Sets the value of the ifqLastFQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFQLastFQ(String value) {
        this.ifqLastFQ = value;
    }

    /**
     * Gets the value of the ifqLastD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFQLastD() {
        return ifqLastD;
    }

    /**
     * Sets the value of the ifqLastD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFQLastD(String value) {
        this.ifqLastD = value;
    }

    /**
     * Gets the value of the ifqLastB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFQLastB() {
        return ifqLastB;
    }

    /**
     * Sets the value of the ifqLastB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFQLastB(String value) {
        this.ifqLastB = value;
    }

    /**
     * Gets the value of the ifqLastV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFQLastV() {
        return ifqLastV;
    }

    /**
     * Sets the value of the ifqLastV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFQLastV(String value) {
        this.ifqLastV = value;
    }

    /**
     * Gets the value of the hostUse20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostUse20() {
        return hostUse20;
    }

    /**
     * Sets the value of the hostUse20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostUse20(String value) {
        this.hostUse20 = value;
    }

    /**
     * Gets the value of the appInd1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd1() {
        return appInd1;
    }

    /**
     * Sets the value of the appInd1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd1(String value) {
        this.appInd1 = value;
    }

    /**
     * Gets the value of the appInd2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd2() {
        return appInd2;
    }

    /**
     * Sets the value of the appInd2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd2(String value) {
        this.appInd2 = value;
    }

    /**
     * Gets the value of the appInd3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd3() {
        return appInd3;
    }

    /**
     * Sets the value of the appInd3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd3(String value) {
        this.appInd3 = value;
    }

    /**
     * Gets the value of the appInd4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd4() {
        return appInd4;
    }

    /**
     * Sets the value of the appInd4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd4(String value) {
        this.appInd4 = value;
    }

    /**
     * Gets the value of the appInd5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd5() {
        return appInd5;
    }

    /**
     * Sets the value of the appInd5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd5(String value) {
        this.appInd5 = value;
    }

    /**
     * Gets the value of the appInd6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd6() {
        return appInd6;
    }

    /**
     * Sets the value of the appInd6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd6(String value) {
        this.appInd6 = value;
    }

    /**
     * Gets the value of the appInd7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd7() {
        return appInd7;
    }

    /**
     * Sets the value of the appInd7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd7(String value) {
        this.appInd7 = value;
    }

    /**
     * Gets the value of the appInd8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd8() {
        return appInd8;
    }

    /**
     * Sets the value of the appInd8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd8(String value) {
        this.appInd8 = value;
    }

    /**
     * Gets the value of the appInd9 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd9() {
        return appInd9;
    }

    /**
     * Sets the value of the appInd9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd9(String value) {
        this.appInd9 = value;
    }

    /**
     * Gets the value of the appInd10 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd10() {
        return appInd10;
    }

    /**
     * Sets the value of the appInd10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd10(String value) {
        this.appInd10 = value;
    }

    /**
     * Gets the value of the appInd11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd11() {
        return appInd11;
    }

    /**
     * Sets the value of the appInd11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd11(String value) {
        this.appInd11 = value;
    }

    /**
     * Gets the value of the appInd12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd12() {
        return appInd12;
    }

    /**
     * Sets the value of the appInd12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd12(String value) {
        this.appInd12 = value;
    }

    /**
     * Gets the value of the appInd13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd13() {
        return appInd13;
    }

    /**
     * Sets the value of the appInd13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd13(String value) {
        this.appInd13 = value;
    }

    /**
     * Gets the value of the appInd14 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd14() {
        return appInd14;
    }

    /**
     * Sets the value of the appInd14 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd14(String value) {
        this.appInd14 = value;
    }

    /**
     * Gets the value of the appInd15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd15() {
        return appInd15;
    }

    /**
     * Sets the value of the appInd15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd15(String value) {
        this.appInd15 = value;
    }

    /**
     * Gets the value of the appInd16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppInd16() {
        return appInd16;
    }

    /**
     * Sets the value of the appInd16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppInd16(String value) {
        this.appInd16 = value;
    }

}
