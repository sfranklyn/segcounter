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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}UserCode"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Process"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Skeada"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}VAT"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ActualFare"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExchangeRate"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PrintDelivery"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ClientFile"/>
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
    "userCode",
    "process",
    "skeada",
    "vat",
    "actualFare",
    "exchangeRate",
    "printDelivery",
    "clientFile"
})
@XmlRootElement(name = "BackOfficeInfo")
public class BackOfficeInfo implements Serializable
{

    @XmlElement(name = "UserCode", required = true)
    protected String userCode;
    @XmlElement(name = "Process", required = true)
    protected String process;
    @XmlElement(name = "Skeada", required = true)
    protected String skeada;
    @XmlElement(name = "VAT", required = true)
    protected VAT vat;
    @XmlElement(name = "ActualFare", required = true)
    protected String actualFare;
    @XmlElement(name = "ExchangeRate", required = true)
    protected String exchangeRate;
    @XmlElement(name = "PrintDelivery", required = true)
    protected String printDelivery;
    @XmlElement(name = "ClientFile", required = true)
    protected String clientFile;

    /**
     * Gets the value of the userCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * Sets the value of the userCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCode(String value) {
        this.userCode = value;
    }

    /**
     * Gets the value of the process property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcess() {
        return process;
    }

    /**
     * Sets the value of the process property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcess(String value) {
        this.process = value;
    }

    /**
     * Gets the value of the skeada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSkeada() {
        return skeada;
    }

    /**
     * Sets the value of the skeada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSkeada(String value) {
        this.skeada = value;
    }

    /**
     * Gets the value of the vat property.
     * 
     * @return
     *     possible object is
     *     {@link VAT }
     *     
     */
    public VAT getVAT() {
        return vat;
    }

    /**
     * Sets the value of the vat property.
     * 
     * @param value
     *     allowed object is
     *     {@link VAT }
     *     
     */
    public void setVAT(VAT value) {
        this.vat = value;
    }

    /**
     * Gets the value of the actualFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFare() {
        return actualFare;
    }

    /**
     * Sets the value of the actualFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFare(String value) {
        this.actualFare = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the printDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintDelivery() {
        return printDelivery;
    }

    /**
     * Sets the value of the printDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintDelivery(String value) {
        this.printDelivery = value;
    }

    /**
     * Gets the value of the clientFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientFile() {
        return clientFile;
    }

    /**
     * Sets the value of the clientFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientFile(String value) {
        this.clientFile = value;
    }

}