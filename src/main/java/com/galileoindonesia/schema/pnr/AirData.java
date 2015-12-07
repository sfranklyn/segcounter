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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SeatPref"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SmokePref"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DefCCV"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CCAcct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExpYear"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExpMonth"/>
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
    "seatPref",
    "smokePref",
    "defCCV",
    "ccAcct",
    "expYear",
    "expMonth"
})
@XmlRootElement(name = "AirData")
public class AirData
    implements Serializable
{

    @XmlElement(name = "SeatPref", required = true)
    protected String seatPref;
    @XmlElement(name = "SmokePref", required = true)
    protected String smokePref;
    @XmlElement(name = "DefCCV", required = true)
    protected String defCCV;
    @XmlElement(name = "CCAcct", required = true)
    protected String ccAcct;
    @XmlElement(name = "ExpYear", required = true)
    protected String expYear;
    @XmlElement(name = "ExpMonth", required = true)
    protected String expMonth;

    /**
     * Gets the value of the seatPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPref() {
        return seatPref;
    }

    /**
     * Sets the value of the seatPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPref(String value) {
        this.seatPref = value;
    }

    /**
     * Gets the value of the smokePref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmokePref() {
        return smokePref;
    }

    /**
     * Sets the value of the smokePref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmokePref(String value) {
        this.smokePref = value;
    }

    /**
     * Gets the value of the defCCV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefCCV() {
        return defCCV;
    }

    /**
     * Sets the value of the defCCV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefCCV(String value) {
        this.defCCV = value;
    }

    /**
     * Gets the value of the ccAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCAcct() {
        return ccAcct;
    }

    /**
     * Sets the value of the ccAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCAcct(String value) {
        this.ccAcct = value;
    }

    /**
     * Gets the value of the expYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpYear() {
        return expYear;
    }

    /**
     * Sets the value of the expYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpYear(String value) {
        this.expYear = value;
    }

    /**
     * Gets the value of the expMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpMonth() {
        return expMonth;
    }

    /**
     * Sets the value of the expMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpMonth(String value) {
        this.expMonth = value;
    }

}
