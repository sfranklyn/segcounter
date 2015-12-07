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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DepReqInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DepNonRefundInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkNonRefundInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirVFeeInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CancellationInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ConfFailInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ChgItinReissueTkInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ReplaceLostTkInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ChargeInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PenInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PenAmt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Currency"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DecPt"/>
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
    "depReqInd",
    "depNonRefundInd",
    "tkNonRefundInd",
    "airVFeeInd",
    "cancellationInd",
    "confFailInd",
    "chgItinReissueTkInd",
    "replaceLostTkInd",
    "chargeInd",
    "penInd",
    "penAmt",
    "currency",
    "decPt"
})
@XmlRootElement(name = "PenQual")
public class PenQual
    implements Serializable
{

    @XmlElement(name = "DepReqInd", required = true)
    protected String depReqInd;
    @XmlElement(name = "DepNonRefundInd", required = true)
    protected String depNonRefundInd;
    @XmlElement(name = "TkNonRefundInd", required = true)
    protected String tkNonRefundInd;
    @XmlElement(name = "AirVFeeInd", required = true)
    protected String airVFeeInd;
    @XmlElement(name = "CancellationInd", required = true)
    protected String cancellationInd;
    @XmlElement(name = "ConfFailInd", required = true)
    protected String confFailInd;
    @XmlElement(name = "ChgItinReissueTkInd", required = true)
    protected String chgItinReissueTkInd;
    @XmlElement(name = "ReplaceLostTkInd", required = true)
    protected String replaceLostTkInd;
    @XmlElement(name = "ChargeInd", required = true)
    protected String chargeInd;
    @XmlElement(name = "PenInd", required = true)
    protected String penInd;
    @XmlElement(name = "PenAmt", required = true)
    protected String penAmt;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "DecPt", required = true)
    protected String decPt;

    /**
     * Gets the value of the depReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepReqInd() {
        return depReqInd;
    }

    /**
     * Sets the value of the depReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepReqInd(String value) {
        this.depReqInd = value;
    }

    /**
     * Gets the value of the depNonRefundInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepNonRefundInd() {
        return depNonRefundInd;
    }

    /**
     * Sets the value of the depNonRefundInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepNonRefundInd(String value) {
        this.depNonRefundInd = value;
    }

    /**
     * Gets the value of the tkNonRefundInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkNonRefundInd() {
        return tkNonRefundInd;
    }

    /**
     * Sets the value of the tkNonRefundInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkNonRefundInd(String value) {
        this.tkNonRefundInd = value;
    }

    /**
     * Gets the value of the airVFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirVFeeInd() {
        return airVFeeInd;
    }

    /**
     * Sets the value of the airVFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirVFeeInd(String value) {
        this.airVFeeInd = value;
    }

    /**
     * Gets the value of the cancellationInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellationInd() {
        return cancellationInd;
    }

    /**
     * Sets the value of the cancellationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellationInd(String value) {
        this.cancellationInd = value;
    }

    /**
     * Gets the value of the confFailInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfFailInd() {
        return confFailInd;
    }

    /**
     * Sets the value of the confFailInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfFailInd(String value) {
        this.confFailInd = value;
    }

    /**
     * Gets the value of the chgItinReissueTkInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChgItinReissueTkInd() {
        return chgItinReissueTkInd;
    }

    /**
     * Sets the value of the chgItinReissueTkInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChgItinReissueTkInd(String value) {
        this.chgItinReissueTkInd = value;
    }

    /**
     * Gets the value of the replaceLostTkInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplaceLostTkInd() {
        return replaceLostTkInd;
    }

    /**
     * Sets the value of the replaceLostTkInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplaceLostTkInd(String value) {
        this.replaceLostTkInd = value;
    }

    /**
     * Gets the value of the chargeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeInd() {
        return chargeInd;
    }

    /**
     * Sets the value of the chargeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeInd(String value) {
        this.chargeInd = value;
    }

    /**
     * Gets the value of the penInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenInd() {
        return penInd;
    }

    /**
     * Sets the value of the penInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenInd(String value) {
        this.penInd = value;
    }

    /**
     * Gets the value of the penAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenAmt() {
        return penAmt;
    }

    /**
     * Sets the value of the penAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenAmt(String value) {
        this.penAmt = value;
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
     * Gets the value of the decPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecPt() {
        return decPt;
    }

    /**
     * Sets the value of the decPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecPt(String value) {
        this.decPt = value;
    }

}
