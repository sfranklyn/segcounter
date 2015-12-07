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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DepRequired"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DepNonRef"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkNonRef"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirVFee"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Cancellation"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FailConfirmSpace"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ItinChg"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ReplaceTk"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Applicable"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ApplicableTo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare15"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Amt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Type"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Currency"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare16"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare17"/>
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
    "depRequired",
    "depNonRef",
    "tkNonRef",
    "airVFee",
    "cancellation",
    "failConfirmSpace",
    "itinChg",
    "replaceTk",
    "applicable",
    "applicableTo",
    "spare15",
    "amt",
    "type",
    "currency",
    "spare16",
    "spare17"
})
@XmlRootElement(name = "PenFee")
public class PenFee
    implements Serializable
{

    @XmlElement(name = "DepRequired", required = true)
    protected String depRequired;
    @XmlElement(name = "DepNonRef", required = true)
    protected String depNonRef;
    @XmlElement(name = "TkNonRef", required = true)
    protected String tkNonRef;
    @XmlElement(name = "AirVFee", required = true)
    protected String airVFee;
    @XmlElement(name = "Cancellation", required = true)
    protected String cancellation;
    @XmlElement(name = "FailConfirmSpace", required = true)
    protected String failConfirmSpace;
    @XmlElement(name = "ItinChg", required = true)
    protected String itinChg;
    @XmlElement(name = "ReplaceTk", required = true)
    protected String replaceTk;
    @XmlElement(name = "Applicable", required = true)
    protected String applicable;
    @XmlElement(name = "ApplicableTo", required = true)
    protected String applicableTo;
    @XmlElement(name = "Spare15", required = true)
    protected String spare15;
    @XmlElement(name = "Amt", required = true)
    protected String amt;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Spare16", required = true)
    protected String spare16;
    @XmlElement(name = "Spare17", required = true)
    protected String spare17;

    /**
     * Gets the value of the depRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepRequired() {
        return depRequired;
    }

    /**
     * Sets the value of the depRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepRequired(String value) {
        this.depRequired = value;
    }

    /**
     * Gets the value of the depNonRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepNonRef() {
        return depNonRef;
    }

    /**
     * Sets the value of the depNonRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepNonRef(String value) {
        this.depNonRef = value;
    }

    /**
     * Gets the value of the tkNonRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkNonRef() {
        return tkNonRef;
    }

    /**
     * Sets the value of the tkNonRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkNonRef(String value) {
        this.tkNonRef = value;
    }

    /**
     * Gets the value of the airVFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirVFee() {
        return airVFee;
    }

    /**
     * Sets the value of the airVFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirVFee(String value) {
        this.airVFee = value;
    }

    /**
     * Gets the value of the cancellation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancellation() {
        return cancellation;
    }

    /**
     * Sets the value of the cancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancellation(String value) {
        this.cancellation = value;
    }

    /**
     * Gets the value of the failConfirmSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailConfirmSpace() {
        return failConfirmSpace;
    }

    /**
     * Sets the value of the failConfirmSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailConfirmSpace(String value) {
        this.failConfirmSpace = value;
    }

    /**
     * Gets the value of the itinChg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItinChg() {
        return itinChg;
    }

    /**
     * Sets the value of the itinChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItinChg(String value) {
        this.itinChg = value;
    }

    /**
     * Gets the value of the replaceTk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplaceTk() {
        return replaceTk;
    }

    /**
     * Sets the value of the replaceTk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplaceTk(String value) {
        this.replaceTk = value;
    }

    /**
     * Gets the value of the applicable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicable() {
        return applicable;
    }

    /**
     * Sets the value of the applicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicable(String value) {
        this.applicable = value;
    }

    /**
     * Gets the value of the applicableTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableTo() {
        return applicableTo;
    }

    /**
     * Sets the value of the applicableTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableTo(String value) {
        this.applicableTo = value;
    }

    /**
     * Gets the value of the spare15 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare15() {
        return spare15;
    }

    /**
     * Sets the value of the spare15 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare15(String value) {
        this.spare15 = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmt(String value) {
        this.amt = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the spare16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare16() {
        return spare16;
    }

    /**
     * Sets the value of the spare16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare16(String value) {
        this.spare16 = value;
    }

    /**
     * Gets the value of the spare17 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare17() {
        return spare17;
    }

    /**
     * Sets the value of the spare17 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare17(String value) {
        this.spare17 = value;
    }

}
