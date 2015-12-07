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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ErrText"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirData"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CarFreqCust"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BusinessFOP"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PersonalFOP"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}HtlSellOpts"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}HtlFreqCust"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirFreqCust"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PersonalInfoUpdate"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CarSellOpts"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SSROptions"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Status"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CarVendorInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TextMsg"/>
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
    "errText",
    "airData",
    "carFreqCust",
    "businessFOP",
    "personalFOP",
    "htlSellOpts",
    "htlFreqCust",
    "airFreqCust",
    "personalInfoUpdate",
    "carSellOpts",
    "ssrOptions",
    "status",
    "carVendorInfo",
    "textMsg"
})
@XmlRootElement(name = "TSStatus")
public class TSStatus implements Serializable
{

    @XmlElement(name = "ErrText", required = true)
    protected ErrText errText;
    @XmlElement(name = "AirData", required = true)
    protected AirData airData;
    @XmlElement(name = "CarFreqCust", required = true)
    protected FreqCustAryType carFreqCust;
    @XmlElement(name = "BusinessFOP", required = true)
    protected FOPInfoAryType businessFOP;
    @XmlElement(name = "PersonalFOP", required = true)
    protected FOPInfoAryType personalFOP;
    @XmlElement(name = "HtlSellOpts", required = true)
    protected HtlSellOpts htlSellOpts;
    @XmlElement(name = "HtlFreqCust", required = true)
    protected FreqCustAryType htlFreqCust;
    @XmlElement(name = "AirFreqCust", required = true)
    protected FreqCustAryType airFreqCust;
    @XmlElement(name = "PersonalInfoUpdate", required = true)
    protected PersonalInfoUpdate personalInfoUpdate;
    @XmlElement(name = "CarSellOpts", required = true)
    protected CarSellOpts carSellOpts;
    @XmlElement(name = "SSROptions", required = true)
    protected SSROptions ssrOptions;
    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "CarVendorInfo", required = true)
    protected CarVendorInfo carVendorInfo;
    @XmlElement(name = "TextMsg", required = true)
    protected TextMsg textMsg;

    /**
     * Gets the value of the errText property.
     * 
     * @return
     *     possible object is
     *     {@link ErrText }
     *     
     */
    public ErrText getErrText() {
        return errText;
    }

    /**
     * Sets the value of the errText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrText }
     *     
     */
    public void setErrText(ErrText value) {
        this.errText = value;
    }

    /**
     * Gets the value of the airData property.
     * 
     * @return
     *     possible object is
     *     {@link AirData }
     *     
     */
    public AirData getAirData() {
        return airData;
    }

    /**
     * Sets the value of the airData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirData }
     *     
     */
    public void setAirData(AirData value) {
        this.airData = value;
    }

    /**
     * Gets the value of the carFreqCust property.
     * 
     * @return
     *     possible object is
     *     {@link FreqCustAryType }
     *     
     */
    public FreqCustAryType getCarFreqCust() {
        return carFreqCust;
    }

    /**
     * Sets the value of the carFreqCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreqCustAryType }
     *     
     */
    public void setCarFreqCust(FreqCustAryType value) {
        this.carFreqCust = value;
    }

    /**
     * Gets the value of the businessFOP property.
     * 
     * @return
     *     possible object is
     *     {@link FOPInfoAryType }
     *     
     */
    public FOPInfoAryType getBusinessFOP() {
        return businessFOP;
    }

    /**
     * Sets the value of the businessFOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOPInfoAryType }
     *     
     */
    public void setBusinessFOP(FOPInfoAryType value) {
        this.businessFOP = value;
    }

    /**
     * Gets the value of the personalFOP property.
     * 
     * @return
     *     possible object is
     *     {@link FOPInfoAryType }
     *     
     */
    public FOPInfoAryType getPersonalFOP() {
        return personalFOP;
    }

    /**
     * Sets the value of the personalFOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOPInfoAryType }
     *     
     */
    public void setPersonalFOP(FOPInfoAryType value) {
        this.personalFOP = value;
    }

    /**
     * Gets the value of the htlSellOpts property.
     * 
     * @return
     *     possible object is
     *     {@link HtlSellOpts }
     *     
     */
    public HtlSellOpts getHtlSellOpts() {
        return htlSellOpts;
    }

    /**
     * Sets the value of the htlSellOpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link HtlSellOpts }
     *     
     */
    public void setHtlSellOpts(HtlSellOpts value) {
        this.htlSellOpts = value;
    }

    /**
     * Gets the value of the htlFreqCust property.
     * 
     * @return
     *     possible object is
     *     {@link FreqCustAryType }
     *     
     */
    public FreqCustAryType getHtlFreqCust() {
        return htlFreqCust;
    }

    /**
     * Sets the value of the htlFreqCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreqCustAryType }
     *     
     */
    public void setHtlFreqCust(FreqCustAryType value) {
        this.htlFreqCust = value;
    }

    /**
     * Gets the value of the airFreqCust property.
     * 
     * @return
     *     possible object is
     *     {@link FreqCustAryType }
     *     
     */
    public FreqCustAryType getAirFreqCust() {
        return airFreqCust;
    }

    /**
     * Sets the value of the airFreqCust property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreqCustAryType }
     *     
     */
    public void setAirFreqCust(FreqCustAryType value) {
        this.airFreqCust = value;
    }

    /**
     * Gets the value of the personalInfoUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalInfoUpdate }
     *     
     */
    public PersonalInfoUpdate getPersonalInfoUpdate() {
        return personalInfoUpdate;
    }

    /**
     * Sets the value of the personalInfoUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalInfoUpdate }
     *     
     */
    public void setPersonalInfoUpdate(PersonalInfoUpdate value) {
        this.personalInfoUpdate = value;
    }

    /**
     * Gets the value of the carSellOpts property.
     * 
     * @return
     *     possible object is
     *     {@link CarSellOpts }
     *     
     */
    public CarSellOpts getCarSellOpts() {
        return carSellOpts;
    }

    /**
     * Sets the value of the carSellOpts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarSellOpts }
     *     
     */
    public void setCarSellOpts(CarSellOpts value) {
        this.carSellOpts = value;
    }

    /**
     * Gets the value of the ssrOptions property.
     * 
     * @return
     *     possible object is
     *     {@link SSROptions }
     *     
     */
    public SSROptions getSSROptions() {
        return ssrOptions;
    }

    /**
     * Sets the value of the ssrOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SSROptions }
     *     
     */
    public void setSSROptions(SSROptions value) {
        this.ssrOptions = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the carVendorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CarVendorInfo }
     *     
     */
    public CarVendorInfo getCarVendorInfo() {
        return carVendorInfo;
    }

    /**
     * Sets the value of the carVendorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarVendorInfo }
     *     
     */
    public void setCarVendorInfo(CarVendorInfo value) {
        this.carVendorInfo = value;
    }

    /**
     * Gets the value of the textMsg property.
     * 
     * @return
     *     possible object is
     *     {@link TextMsg }
     *     
     */
    public TextMsg getTextMsg() {
        return textMsg;
    }

    /**
     * Sets the value of the textMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextMsg }
     *     
     */
    public void setTextMsg(TextMsg value) {
        this.textMsg = value;
    }

}
