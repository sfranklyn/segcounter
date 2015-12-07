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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare1"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AllParaReqind"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SumRuleReqInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FulltextoptInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare2"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Text"/>
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
    "spare1",
    "allParaReqind",
    "sumRuleReqInd",
    "fulltextoptInd",
    "spare2",
    "text"
})
@XmlRootElement(name = "FollowUpEntries")
public class FollowUpEntries
    implements Serializable
{

    @XmlElement(name = "UniqueKey", required = true)
    protected String uniqueKey;
    @XmlElement(name = "QuoteNum", required = true)
    protected String quoteNum;
    @XmlElement(name = "Spare1", required = true)
    protected String spare1;
    @XmlElement(name = "AllParaReqind", required = true)
    protected String allParaReqind;
    @XmlElement(name = "SumRuleReqInd", required = true)
    protected String sumRuleReqInd;
    @XmlElement(name = "FulltextoptInd", required = true)
    protected String fulltextoptInd;
    @XmlElement(name = "Spare2", required = true)
    protected String spare2;
    @XmlElement(name = "Text", required = true)
    protected String text;

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
     * Gets the value of the allParaReqind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllParaReqind() {
        return allParaReqind;
    }

    /**
     * Sets the value of the allParaReqind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllParaReqind(String value) {
        this.allParaReqind = value;
    }

    /**
     * Gets the value of the sumRuleReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumRuleReqInd() {
        return sumRuleReqInd;
    }

    /**
     * Sets the value of the sumRuleReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumRuleReqInd(String value) {
        this.sumRuleReqInd = value;
    }

    /**
     * Gets the value of the fulltextoptInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulltextoptInd() {
        return fulltextoptInd;
    }

    /**
     * Sets the value of the fulltextoptInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulltextoptInd(String value) {
        this.fulltextoptInd = value;
    }

    /**
     * Gets the value of the spare2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare2() {
        return spare2;
    }

    /**
     * Sets the value of the spare2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare2(String value) {
        this.spare2 = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
