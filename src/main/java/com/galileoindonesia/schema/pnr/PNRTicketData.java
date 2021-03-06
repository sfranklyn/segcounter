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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PsgrName"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PsgrOrdNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ESaleInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}OAETkInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LinkedETkt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PNRSvcETKInd"/>
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
    "tkNum",
    "psgrName",
    "psgrOrdNum",
    "eSaleInd",
    "oaeTkInd",
    "linkedETkt",
    "pnrSvcETKInd"
})
@XmlRootElement(name = "PNRTicketData")
public class PNRTicketData implements Serializable
{

    @XmlElement(name = "TkNum", required = true)
    protected String tkNum;
    @XmlElement(name = "PsgrName", required = true)
    protected String psgrName;
    @XmlElement(name = "PsgrOrdNum", required = true)
    protected String psgrOrdNum;
    @XmlElement(name = "ESaleInd", required = true)
    protected String eSaleInd;
    @XmlElement(name = "OAETkInd", required = true)
    protected String oaeTkInd;
    @XmlElement(name = "LinkedETkt", required = true)
    protected String linkedETkt;
    @XmlElement(name = "PNRSvcETKInd", required = true)
    protected String pnrSvcETKInd;

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
     * Gets the value of the psgrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsgrName() {
        return psgrName;
    }

    /**
     * Sets the value of the psgrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsgrName(String value) {
        this.psgrName = value;
    }

    /**
     * Gets the value of the psgrOrdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsgrOrdNum() {
        return psgrOrdNum;
    }

    /**
     * Sets the value of the psgrOrdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsgrOrdNum(String value) {
        this.psgrOrdNum = value;
    }

    /**
     * Gets the value of the eSaleInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESaleInd() {
        return eSaleInd;
    }

    /**
     * Sets the value of the eSaleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESaleInd(String value) {
        this.eSaleInd = value;
    }

    /**
     * Gets the value of the oaeTkInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOAETkInd() {
        return oaeTkInd;
    }

    /**
     * Sets the value of the oaeTkInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOAETkInd(String value) {
        this.oaeTkInd = value;
    }

    /**
     * Gets the value of the linkedETkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkedETkt() {
        return linkedETkt;
    }

    /**
     * Sets the value of the linkedETkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkedETkt(String value) {
        this.linkedETkt = value;
    }

    /**
     * Gets the value of the pnrSvcETKInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNRSvcETKInd() {
        return pnrSvcETKInd;
    }

    /**
     * Sets the value of the pnrSvcETKInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNRSvcETKInd(String value) {
        this.pnrSvcETKInd = value;
    }

}
