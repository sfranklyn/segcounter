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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EditTypeInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AddQual"/>
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
    "editTypeInd",
    "addQual"
})
@XmlRootElement(name = "BillingQualB3")
public class BillingQualB3
    implements Serializable
{

    @XmlElement(name = "EditTypeInd", required = true)
    protected String editTypeInd;
    @XmlElement(name = "AddQual", required = true)
    protected AddQual addQual;

    /**
     * Gets the value of the editTypeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditTypeInd() {
        return editTypeInd;
    }

    /**
     * Sets the value of the editTypeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditTypeInd(String value) {
        this.editTypeInd = value;
    }

    /**
     * Gets the value of the addQual property.
     * 
     * @return
     *     possible object is
     *     {@link AddQual }
     *     
     */
    public AddQual getAddQual() {
        return addQual;
    }

    /**
     * Sets the value of the addQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddQual }
     *     
     */
    public void setAddQual(AddQual value) {
        this.addQual = value;
    }

}
