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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Ind"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SegNumAry"/>
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
    "ind",
    "segNumAry"
})
@XmlRootElement(name = "TicketValidity")
public class TicketValidity implements Serializable
{

    @XmlElement(name = "Ind", required = true)
    protected String ind;
    @XmlElement(name = "SegNumAry", required = true)
    protected SegNumAry segNumAry;

    /**
     * Gets the value of the ind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInd() {
        return ind;
    }

    /**
     * Sets the value of the ind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInd(String value) {
        this.ind = value;
    }

    /**
     * Gets the value of the segNumAry property.
     * 
     * @return
     *     possible object is
     *     {@link SegNumAry }
     *     
     */
    public SegNumAry getSegNumAry() {
        return segNumAry;
    }

    /**
     * Sets the value of the segNumAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegNumAry }
     *     
     */
    public void setSegNumAry(SegNumAry value) {
        this.segNumAry = value;
    }

}
