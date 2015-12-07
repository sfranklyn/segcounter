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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SegStatus"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ServiceType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DayChg"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Vnd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartTm"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndTm"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BIC"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TrainNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NumSeats"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SellType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TariffType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ConfNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartPtText"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndPtText"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Text"/>
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
    "segStatus",
    "serviceType",
    "startDt",
    "dayChg",
    "vnd",
    "startTm",
    "endTm",
    "bic",
    "trainNum",
    "numSeats",
    "sellType",
    "tariffType",
    "confNum",
    "startPtText",
    "endPtText",
    "text"
})
@XmlRootElement(name = "TrainSeg")
public class TrainSeg implements Serializable
{

    @XmlElement(name = "SegNum", required = true)
    protected String segNum;
    @XmlElement(name = "SegStatus", required = true)
    protected String segStatus;
    @XmlElement(name = "ServiceType", required = true)
    protected String serviceType;
    @XmlElement(name = "StartDt", required = true)
    protected String startDt;
    @XmlElement(name = "DayChg", required = true)
    protected String dayChg;
    @XmlElement(name = "Vnd", required = true)
    protected String vnd;
    @XmlElement(name = "StartTm", required = true)
    protected String startTm;
    @XmlElement(name = "EndTm", required = true)
    protected String endTm;
    @XmlElement(name = "BIC", required = true)
    protected String bic;
    @XmlElement(name = "TrainNum", required = true)
    protected String trainNum;
    @XmlElement(name = "NumSeats", required = true)
    protected String numSeats;
    @XmlElement(name = "SellType", required = true)
    protected String sellType;
    @XmlElement(name = "TariffType", required = true)
    protected String tariffType;
    @XmlElement(name = "ConfNum", required = true)
    protected String confNum;
    @XmlElement(name = "StartPtText", required = true)
    protected String startPtText;
    @XmlElement(name = "EndPtText", required = true)
    protected String endPtText;
    @XmlElement(name = "Text", required = true)
    protected String text;

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
     * Gets the value of the segStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegStatus() {
        return segStatus;
    }

    /**
     * Sets the value of the segStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegStatus(String value) {
        this.segStatus = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
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
     * Gets the value of the dayChg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayChg() {
        return dayChg;
    }

    /**
     * Sets the value of the dayChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayChg(String value) {
        this.dayChg = value;
    }

    /**
     * Gets the value of the vnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVnd() {
        return vnd;
    }

    /**
     * Sets the value of the vnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVnd(String value) {
        this.vnd = value;
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
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the trainNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNum() {
        return trainNum;
    }

    /**
     * Sets the value of the trainNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNum(String value) {
        this.trainNum = value;
    }

    /**
     * Gets the value of the numSeats property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSeats() {
        return numSeats;
    }

    /**
     * Sets the value of the numSeats property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSeats(String value) {
        this.numSeats = value;
    }

    /**
     * Gets the value of the sellType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellType() {
        return sellType;
    }

    /**
     * Sets the value of the sellType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellType(String value) {
        this.sellType = value;
    }

    /**
     * Gets the value of the tariffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffType() {
        return tariffType;
    }

    /**
     * Sets the value of the tariffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffType(String value) {
        this.tariffType = value;
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
     * Gets the value of the startPtText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPtText() {
        return startPtText;
    }

    /**
     * Sets the value of the startPtText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPtText(String value) {
        this.startPtText = value;
    }

    /**
     * Gets the value of the endPtText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPtText() {
        return endPtText;
    }

    /**
     * Sets the value of the endPtText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPtText(String value) {
        this.endPtText = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}