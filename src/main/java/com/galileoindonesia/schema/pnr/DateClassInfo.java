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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NewDate"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SeqNumAry"/>
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
    "newDate",
    "seqNumAry"
})
@XmlRootElement(name = "DateClassInfo")
public class DateClassInfo
    implements Serializable
{

    @XmlElement(name = "NewDate", required = true)
    protected String newDate;
    @XmlElement(name = "SeqNumAry", required = true)
    protected SeqNumAry seqNumAry;

    /**
     * Gets the value of the newDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDate() {
        return newDate;
    }

    /**
     * Sets the value of the newDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDate(String value) {
        this.newDate = value;
    }

    /**
     * Gets the value of the seqNumAry property.
     * 
     * @return
     *     possible object is
     *     {@link SeqNumAry }
     *     
     */
    public SeqNumAry getSeqNumAry() {
        return seqNumAry;
    }

    /**
     * Sets the value of the seqNumAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeqNumAry }
     *     
     */
    public void setSeqNumAry(SeqNumAry value) {
        this.seqNumAry = value;
    }

}
