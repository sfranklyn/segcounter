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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FareGuarCode"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkType"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LNameNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PsgrNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AbsNameNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}UnableTkStatus"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}InvoiceAlphaChars"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}InvoiceNum"/>
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
    "fareGuarCode",
    "status",
    "tkNum",
    "tkType",
    "lNameNum",
    "psgrNum",
    "absNameNum",
    "unableTkStatus",
    "invoiceAlphaChars",
    "invoiceNum"
})
@XmlRootElement(name = "AdditionalPsgrFareInfo")
public class AdditionalPsgrFareInfo implements Serializable
{

    @XmlElement(name = "FareGuarCode", required = true)
    protected String fareGuarCode;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "TkNum", required = true)
    protected String tkNum;
    @XmlElement(name = "TkType", required = true)
    protected String tkType;
    @XmlElement(name = "LNameNum", required = true)
    protected String lNameNum;
    @XmlElement(name = "PsgrNum", required = true)
    protected String psgrNum;
    @XmlElement(name = "AbsNameNum", required = true)
    protected String absNameNum;
    @XmlElement(name = "UnableTkStatus", required = true)
    protected String unableTkStatus;
    @XmlElement(name = "InvoiceAlphaChars", required = true)
    protected String invoiceAlphaChars;
    @XmlElement(name = "InvoiceNum", required = true)
    protected String invoiceNum;

    /**
     * Gets the value of the fareGuarCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareGuarCode() {
        return fareGuarCode;
    }

    /**
     * Sets the value of the fareGuarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareGuarCode(String value) {
        this.fareGuarCode = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the tkNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkNum() {
        return tkNum;
    }

    /**
     * Sets the value of the tkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkNum(String value) {
        this.tkNum = value;
    }

    /**
     * Gets the value of the tkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkType() {
        return tkType;
    }

    /**
     * Sets the value of the tkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkType(String value) {
        this.tkType = value;
    }

    /**
     * Gets the value of the lNameNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNameNum() {
        return lNameNum;
    }

    /**
     * Sets the value of the lNameNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNameNum(String value) {
        this.lNameNum = value;
    }

    /**
     * Gets the value of the psgrNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsgrNum() {
        return psgrNum;
    }

    /**
     * Sets the value of the psgrNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsgrNum(String value) {
        this.psgrNum = value;
    }

    /**
     * Gets the value of the absNameNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsNameNum() {
        return absNameNum;
    }

    /**
     * Sets the value of the absNameNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsNameNum(String value) {
        this.absNameNum = value;
    }

    /**
     * Gets the value of the unableTkStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnableTkStatus() {
        return unableTkStatus;
    }

    /**
     * Sets the value of the unableTkStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnableTkStatus(String value) {
        this.unableTkStatus = value;
    }

    /**
     * Gets the value of the invoiceAlphaChars property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceAlphaChars() {
        return invoiceAlphaChars;
    }

    /**
     * Sets the value of the invoiceAlphaChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceAlphaChars(String value) {
        this.invoiceAlphaChars = value;
    }

    /**
     * Gets the value of the invoiceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * Sets the value of the invoiceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNum(String value) {
        this.invoiceNum = value;
    }

}