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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreqCustAryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreqCustAryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FreqCustAry"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqCustAryType", propOrder = {
    "freqCustAry"
})
public class FreqCustAryType
    implements Serializable
{

    @XmlElement(name = "FreqCustAry", required = true)
    protected FreqCustAry freqCustAry;

    /**
     * Gets the value of the freqCustAry property.
     * 
     * @return
     *     possible object is
     *     {@link FreqCustAry }
     *     
     */
    public FreqCustAry getFreqCustAry() {
        return freqCustAry;
    }

    /**
     * Sets the value of the freqCustAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreqCustAry }
     *     
     */
    public void setFreqCustAry(FreqCustAry value) {
        this.freqCustAry = value;
    }

}
