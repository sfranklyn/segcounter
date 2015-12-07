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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NumPlusUpItems"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}City1"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}City2"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PlusUpReason"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PlusUpAmt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NegativeInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}City3"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}City4"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PlusUpAmtLocCurrency"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare1"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}MileSurchargeBand"/>
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
    "numPlusUpItems",
    "city1",
    "city2",
    "plusUpReason",
    "plusUpAmt",
    "negativeInd",
    "city3",
    "city4",
    "plusUpAmtLocCurrency",
    "spare1",
    "mileSurchargeBand"
})
@XmlRootElement(name = "PlusUps")
public class PlusUps
    implements Serializable
{

    @XmlElement(name = "UniqueKey", required = true)
    protected String uniqueKey;
    @XmlElement(name = "QuoteNum", required = true)
    protected String quoteNum;
    @XmlElement(name = "NumPlusUpItems", required = true)
    protected String numPlusUpItems;
    @XmlElement(name = "City1", required = true)
    protected String city1;
    @XmlElement(name = "City2", required = true)
    protected String city2;
    @XmlElement(name = "PlusUpReason", required = true)
    protected String plusUpReason;
    @XmlElement(name = "PlusUpAmt", required = true)
    protected String plusUpAmt;
    @XmlElement(name = "NegativeInd", required = true)
    protected String negativeInd;
    @XmlElement(name = "City3", required = true)
    protected String city3;
    @XmlElement(name = "City4", required = true)
    protected String city4;
    @XmlElement(name = "PlusUpAmtLocCurrency", required = true)
    protected String plusUpAmtLocCurrency;
    @XmlElement(name = "Spare1", required = true)
    protected String spare1;
    @XmlElement(name = "MileSurchargeBand", required = true)
    protected String mileSurchargeBand;

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
     * Gets the value of the numPlusUpItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPlusUpItems() {
        return numPlusUpItems;
    }

    /**
     * Sets the value of the numPlusUpItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPlusUpItems(String value) {
        this.numPlusUpItems = value;
    }

    /**
     * Gets the value of the city1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity1() {
        return city1;
    }

    /**
     * Sets the value of the city1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity1(String value) {
        this.city1 = value;
    }

    /**
     * Gets the value of the city2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity2() {
        return city2;
    }

    /**
     * Sets the value of the city2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity2(String value) {
        this.city2 = value;
    }

    /**
     * Gets the value of the plusUpReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlusUpReason() {
        return plusUpReason;
    }

    /**
     * Sets the value of the plusUpReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlusUpReason(String value) {
        this.plusUpReason = value;
    }

    /**
     * Gets the value of the plusUpAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlusUpAmt() {
        return plusUpAmt;
    }

    /**
     * Sets the value of the plusUpAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlusUpAmt(String value) {
        this.plusUpAmt = value;
    }

    /**
     * Gets the value of the negativeInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegativeInd() {
        return negativeInd;
    }

    /**
     * Sets the value of the negativeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegativeInd(String value) {
        this.negativeInd = value;
    }

    /**
     * Gets the value of the city3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity3() {
        return city3;
    }

    /**
     * Sets the value of the city3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity3(String value) {
        this.city3 = value;
    }

    /**
     * Gets the value of the city4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity4() {
        return city4;
    }

    /**
     * Sets the value of the city4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity4(String value) {
        this.city4 = value;
    }

    /**
     * Gets the value of the plusUpAmtLocCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlusUpAmtLocCurrency() {
        return plusUpAmtLocCurrency;
    }

    /**
     * Sets the value of the plusUpAmtLocCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlusUpAmtLocCurrency(String value) {
        this.plusUpAmtLocCurrency = value;
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
     * Gets the value of the mileSurchargeBand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileSurchargeBand() {
        return mileSurchargeBand;
    }

    /**
     * Sets the value of the mileSurchargeBand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileSurchargeBand(String value) {
        this.mileSurchargeBand = value;
    }

}