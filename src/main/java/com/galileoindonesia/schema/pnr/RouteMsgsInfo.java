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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CityItemAry"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AlertDetailsAry"/>
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
    "cityItemAry",
    "alertDetailsAry"
})
@XmlRootElement(name = "RouteMsgsInfo")
public class RouteMsgsInfo
    implements Serializable
{

    @XmlElement(name = "CityItemAry", required = true)
    protected CityItemAry cityItemAry;
    @XmlElement(name = "AlertDetailsAry", required = true)
    protected AlertDetailsAry alertDetailsAry;

    /**
     * Gets the value of the cityItemAry property.
     * 
     * @return
     *     possible object is
     *     {@link CityItemAry }
     *     
     */
    public CityItemAry getCityItemAry() {
        return cityItemAry;
    }

    /**
     * Sets the value of the cityItemAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityItemAry }
     *     
     */
    public void setCityItemAry(CityItemAry value) {
        this.cityItemAry = value;
    }

    /**
     * Gets the value of the alertDetailsAry property.
     * 
     * @return
     *     possible object is
     *     {@link AlertDetailsAry }
     *     
     */
    public AlertDetailsAry getAlertDetailsAry() {
        return alertDetailsAry;
    }

    /**
     * Sets the value of the alertDetailsAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertDetailsAry }
     *     
     */
    public void setAlertDetailsAry(AlertDetailsAry value) {
        this.alertDetailsAry = value;
    }

}
