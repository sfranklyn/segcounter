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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}QuoteNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FareComponentNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NetGrossInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartCity"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndCity"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CrncyCode"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CommPercentage"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CrncyCodeSpecifiedAmt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CommAmt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NumDecSpecifiedAmt"/>
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
    "quoteNum",
    "fareComponentNum",
    "netGrossInd",
    "startCity",
    "endCity",
    "crncyCode",
    "commPercentage",
    "crncyCodeSpecifiedAmt",
    "commAmt",
    "numDecSpecifiedAmt"
})
@XmlRootElement(name = "CommNetGrossInfo")
public class CommNetGrossInfo implements Serializable
{

    @XmlElement(name = "UniqueKey", required = true)
    protected String uniqueKey;
    @XmlElement(name = "QuoteNum", required = true)
    protected String quoteNum;
    @XmlElement(name = "FareComponentNum", required = true)
    protected String fareComponentNum;
    @XmlElement(name = "NetGrossInd", required = true)
    protected String netGrossInd;
    @XmlElement(name = "StartCity", required = true)
    protected String startCity;
    @XmlElement(name = "EndCity", required = true)
    protected String endCity;
    @XmlElement(name = "CrncyCode", required = true)
    protected String crncyCode;
    @XmlElement(name = "CommPercentage", required = true)
    protected String commPercentage;
    @XmlElement(name = "CrncyCodeSpecifiedAmt", required = true)
    protected String crncyCodeSpecifiedAmt;
    @XmlElement(name = "CommAmt", required = true)
    protected String commAmt;
    @XmlElement(name = "NumDecSpecifiedAmt", required = true)
    protected String numDecSpecifiedAmt;

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
     * Gets the value of the quoteNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteNum() {
        return quoteNum;
    }

    /**
     * Sets the value of the quoteNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteNum(String value) {
        this.quoteNum = value;
    }

    /**
     * Gets the value of the fareComponentNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareComponentNum() {
        return fareComponentNum;
    }

    /**
     * Sets the value of the fareComponentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareComponentNum(String value) {
        this.fareComponentNum = value;
    }

    /**
     * Gets the value of the netGrossInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetGrossInd() {
        return netGrossInd;
    }

    /**
     * Sets the value of the netGrossInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetGrossInd(String value) {
        this.netGrossInd = value;
    }

    /**
     * Gets the value of the startCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartCity() {
        return startCity;
    }

    /**
     * Sets the value of the startCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartCity(String value) {
        this.startCity = value;
    }

    /**
     * Gets the value of the endCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndCity() {
        return endCity;
    }

    /**
     * Sets the value of the endCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndCity(String value) {
        this.endCity = value;
    }

    /**
     * Gets the value of the crncyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrncyCode() {
        return crncyCode;
    }

    /**
     * Sets the value of the crncyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrncyCode(String value) {
        this.crncyCode = value;
    }

    /**
     * Gets the value of the commPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommPercentage() {
        return commPercentage;
    }

    /**
     * Sets the value of the commPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommPercentage(String value) {
        this.commPercentage = value;
    }

    /**
     * Gets the value of the crncyCodeSpecifiedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrncyCodeSpecifiedAmt() {
        return crncyCodeSpecifiedAmt;
    }

    /**
     * Sets the value of the crncyCodeSpecifiedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrncyCodeSpecifiedAmt(String value) {
        this.crncyCodeSpecifiedAmt = value;
    }

    /**
     * Gets the value of the commAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommAmt() {
        return commAmt;
    }

    /**
     * Sets the value of the commAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommAmt(String value) {
        this.commAmt = value;
    }

    /**
     * Gets the value of the numDecSpecifiedAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumDecSpecifiedAmt() {
        return numDecSpecifiedAmt;
    }

    /**
     * Sets the value of the numDecSpecifiedAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumDecSpecifiedAmt(String value) {
        this.numDecSpecifiedAmt = value;
    }

}
