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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}HotelSell"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}HotelOptionalData"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}HotelError"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}HotelType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}HotelRule"/>
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
    "hotelSell",
    "hotelOptionalData",
    "hotelError",
    "hotelType",
    "hotelRule"
})
@XmlRootElement(name = "HtlSegSell")
public class HtlSegSell implements Serializable
{

    @XmlElement(name = "HotelSell", required = true)
    protected HotelSell hotelSell;
    @XmlElement(name = "HotelOptionalData", required = true)
    protected HotelOptionalData hotelOptionalData;
    @XmlElement(name = "HotelError", required = true)
    protected HotelError hotelError;
    @XmlElement(name = "HotelType", required = true)
    protected HotelType hotelType;
    @XmlElement(name = "HotelRule", required = true)
    protected HotelRule hotelRule;

    /**
     * Gets the value of the hotelSell property.
     * 
     * @return
     *     possible object is
     *     {@link HotelSell }
     *     
     */
    public HotelSell getHotelSell() {
        return hotelSell;
    }

    /**
     * Sets the value of the hotelSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelSell }
     *     
     */
    public void setHotelSell(HotelSell value) {
        this.hotelSell = value;
    }

    /**
     * Gets the value of the hotelOptionalData property.
     * 
     * @return
     *     possible object is
     *     {@link HotelOptionalData }
     *     
     */
    public HotelOptionalData getHotelOptionalData() {
        return hotelOptionalData;
    }

    /**
     * Sets the value of the hotelOptionalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelOptionalData }
     *     
     */
    public void setHotelOptionalData(HotelOptionalData value) {
        this.hotelOptionalData = value;
    }

    /**
     * Gets the value of the hotelError property.
     * 
     * @return
     *     possible object is
     *     {@link HotelError }
     *     
     */
    public HotelError getHotelError() {
        return hotelError;
    }

    /**
     * Sets the value of the hotelError property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelError }
     *     
     */
    public void setHotelError(HotelError value) {
        this.hotelError = value;
    }

    /**
     * Gets the value of the hotelType property.
     * 
     * @return
     *     possible object is
     *     {@link HotelType }
     *     
     */
    public HotelType getHotelType() {
        return hotelType;
    }

    /**
     * Sets the value of the hotelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelType }
     *     
     */
    public void setHotelType(HotelType value) {
        this.hotelType = value;
    }

    /**
     * Gets the value of the hotelRule property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRule }
     *     
     */
    public HotelRule getHotelRule() {
        return hotelRule;
    }

    /**
     * Sets the value of the hotelRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRule }
     *     
     */
    public void setHotelRule(HotelRule value) {
        this.hotelRule = value;
    }

}