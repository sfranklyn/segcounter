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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SellStatusInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NumNights"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PrimaryCity"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Chain"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RoomMasterID"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BIC"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}HtlPropName"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NumAdults"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NumRooms"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ConfNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RateGuarInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RateChgInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}MultiDayRateInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Currency"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DecPos"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExtraChargeDecPos"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RateAmt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}MultilevelRate"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DataStoreIndicator"/>
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
    "sellStatusInd",
    "startDt",
    "endDt",
    "numNights",
    "primaryCity",
    "chain",
    "roomMasterID",
    "bic",
    "htlPropName",
    "numAdults",
    "numRooms",
    "confNum",
    "rateGuarInfo",
    "rateChgInd",
    "multiDayRateInd",
    "currency",
    "decPos",
    "extraChargeDecPos",
    "rateAmt",
    "multilevelRate",
    "dataStoreIndicator"
})
@XmlRootElement(name = "HotelSell")
public class HotelSell
    implements Serializable
{

    @XmlElement(name = "SegNum", required = true)
    protected String segNum;
    @XmlElement(name = "SellStatusInd", required = true)
    protected String sellStatusInd;
    @XmlElement(name = "StartDt", required = true)
    protected String startDt;
    @XmlElement(name = "EndDt", required = true)
    protected String endDt;
    @XmlElement(name = "NumNights", required = true)
    protected String numNights;
    @XmlElement(name = "PrimaryCity", required = true)
    protected String primaryCity;
    @XmlElement(name = "Chain", required = true)
    protected String chain;
    @XmlElement(name = "RoomMasterID", required = true)
    protected String roomMasterID;
    @XmlElement(name = "BIC", required = true)
    protected String bic;
    @XmlElement(name = "HtlPropName", required = true)
    protected String htlPropName;
    @XmlElement(name = "NumAdults", required = true)
    protected String numAdults;
    @XmlElement(name = "NumRooms", required = true)
    protected String numRooms;
    @XmlElement(name = "ConfNum", required = true)
    protected String confNum;
    @XmlElement(name = "RateGuarInfo", required = true)
    protected String rateGuarInfo;
    @XmlElement(name = "RateChgInd", required = true)
    protected String rateChgInd;
    @XmlElement(name = "MultiDayRateInd", required = true)
    protected String multiDayRateInd;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "DecPos", required = true)
    protected String decPos;
    @XmlElement(name = "ExtraChargeDecPos", required = true)
    protected String extraChargeDecPos;
    @XmlElement(name = "RateAmt", required = true)
    protected String rateAmt;
    @XmlElement(name = "MultilevelRate", required = true)
    protected String multilevelRate;
    @XmlElement(name = "DataStoreIndicator", required = true)
    protected String dataStoreIndicator;

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
     * Gets the value of the sellStatusInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellStatusInd() {
        return sellStatusInd;
    }

    /**
     * Sets the value of the sellStatusInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellStatusInd(String value) {
        this.sellStatusInd = value;
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
     * Gets the value of the numNights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumNights() {
        return numNights;
    }

    /**
     * Sets the value of the numNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumNights(String value) {
        this.numNights = value;
    }

    /**
     * Gets the value of the primaryCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCity() {
        return primaryCity;
    }

    /**
     * Sets the value of the primaryCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCity(String value) {
        this.primaryCity = value;
    }

    /**
     * Gets the value of the chain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChain() {
        return chain;
    }

    /**
     * Sets the value of the chain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChain(String value) {
        this.chain = value;
    }

    /**
     * Gets the value of the roomMasterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomMasterID() {
        return roomMasterID;
    }

    /**
     * Sets the value of the roomMasterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomMasterID(String value) {
        this.roomMasterID = value;
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
     * Gets the value of the htlPropName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtlPropName() {
        return htlPropName;
    }

    /**
     * Sets the value of the htlPropName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtlPropName(String value) {
        this.htlPropName = value;
    }

    /**
     * Gets the value of the numAdults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumAdults() {
        return numAdults;
    }

    /**
     * Sets the value of the numAdults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumAdults(String value) {
        this.numAdults = value;
    }

    /**
     * Gets the value of the numRooms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRooms() {
        return numRooms;
    }

    /**
     * Sets the value of the numRooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRooms(String value) {
        this.numRooms = value;
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
     * Gets the value of the rateGuarInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateGuarInfo() {
        return rateGuarInfo;
    }

    /**
     * Sets the value of the rateGuarInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateGuarInfo(String value) {
        this.rateGuarInfo = value;
    }

    /**
     * Gets the value of the rateChgInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateChgInd() {
        return rateChgInd;
    }

    /**
     * Sets the value of the rateChgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateChgInd(String value) {
        this.rateChgInd = value;
    }

    /**
     * Gets the value of the multiDayRateInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiDayRateInd() {
        return multiDayRateInd;
    }

    /**
     * Sets the value of the multiDayRateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiDayRateInd(String value) {
        this.multiDayRateInd = value;
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
     * Gets the value of the extraChargeDecPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraChargeDecPos() {
        return extraChargeDecPos;
    }

    /**
     * Sets the value of the extraChargeDecPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraChargeDecPos(String value) {
        this.extraChargeDecPos = value;
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
     * Gets the value of the multilevelRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultilevelRate() {
        return multilevelRate;
    }

    /**
     * Sets the value of the multilevelRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultilevelRate(String value) {
        this.multilevelRate = value;
    }

    /**
     * Gets the value of the dataStoreIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataStoreIndicator() {
        return dataStoreIndicator;
    }

    /**
     * Sets the value of the dataStoreIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataStoreIndicator(String value) {
        this.dataStoreIndicator = value;
    }

}
