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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}UniqueKey"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AgntEnteredPsgrDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}QuotedPsgrDesc" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PFCApplies"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare1" minOccurs="0"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ApplesToAry"/>
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
    "uniqueKey",
    "agntEnteredPsgrDesc",
    "quotedPsgrDesc",
    "pfcApplies",
    "spare1",
    "applesToAry"
})
@XmlRootElement(name = "AgntEnteredPsgrDescInfo")
public class AgntEnteredPsgrDescInfo implements Serializable
{

    @XmlElement(name = "UniqueKey", required = true)
    protected String uniqueKey;
    @XmlElement(name = "AgntEnteredPsgrDesc")
    protected String agntEnteredPsgrDesc;
    @XmlElement(name = "QuotedPsgrDesc")
    protected String quotedPsgrDesc;
    @XmlElement(name = "PFCApplies", required = true)
    protected String pfcApplies;
    @XmlElement(name = "Spare1")
    protected String spare1;
    @XmlElement(name = "ApplesToAry", required = true)
    protected AppliesToType applesToAry;

    /**
     * Gets the value of the uniqueKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueKey() {
        return uniqueKey;
    }

    /**
     * Sets the value of the uniqueKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueKey(String value) {
        this.uniqueKey = value;
    }

    /**
     * Gets the value of the agntEnteredPsgrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgntEnteredPsgrDesc() {
        return agntEnteredPsgrDesc;
    }

    /**
     * Sets the value of the agntEnteredPsgrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgntEnteredPsgrDesc(String value) {
        this.agntEnteredPsgrDesc = value;
    }

    /**
     * Gets the value of the quotedPsgrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotedPsgrDesc() {
        return quotedPsgrDesc;
    }

    /**
     * Sets the value of the quotedPsgrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotedPsgrDesc(String value) {
        this.quotedPsgrDesc = value;
    }

    /**
     * Gets the value of the pfcApplies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPFCApplies() {
        return pfcApplies;
    }

    /**
     * Sets the value of the pfcApplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPFCApplies(String value) {
        this.pfcApplies = value;
    }

    /**
     * Gets the value of the spare1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare1() {
        return spare1;
    }

    /**
     * Sets the value of the spare1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare1(String value) {
        this.spare1 = value;
    }

    /**
     * Gets the value of the applesToAry property.
     * 
     * @return
     *     possible object is
     *     {@link AppliesToType }
     *     
     */
    public AppliesToType getApplesToAry() {
        return applesToAry;
    }

    /**
     * Sets the value of the applesToAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliesToType }
     *     
     */
    public void setApplesToAry(AppliesToType value) {
        this.applesToAry = value;
    }

}
