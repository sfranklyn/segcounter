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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}OfficeTitle"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AgntTitle"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AssocPCC"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AssocCRSID"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AssocAgntSONID"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CorpTravInd"/>
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
    "officeTitle",
    "agntTitle",
    "assocPCC",
    "assocCRSID",
    "assocAgntSONID",
    "corpTravInd"
})
@XmlRootElement(name = "OfficeAgentClientData")
public class OfficeAgentClientData implements Serializable
{

    @XmlElement(name = "OfficeTitle", required = true)
    protected String officeTitle;
    @XmlElement(name = "AgntTitle", required = true)
    protected String agntTitle;
    @XmlElement(name = "AssocPCC", required = true)
    protected String assocPCC;
    @XmlElement(name = "AssocCRSID", required = true)
    protected String assocCRSID;
    @XmlElement(name = "AssocAgntSONID", required = true)
    protected String assocAgntSONID;
    @XmlElement(name = "CorpTravInd", required = true)
    protected String corpTravInd;

    /**
     * Gets the value of the officeTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeTitle() {
        return officeTitle;
    }

    /**
     * Sets the value of the officeTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeTitle(String value) {
        this.officeTitle = value;
    }

    /**
     * Gets the value of the agntTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgntTitle() {
        return agntTitle;
    }

    /**
     * Sets the value of the agntTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgntTitle(String value) {
        this.agntTitle = value;
    }

    /**
     * Gets the value of the assocPCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssocPCC() {
        return assocPCC;
    }

    /**
     * Sets the value of the assocPCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssocPCC(String value) {
        this.assocPCC = value;
    }

    /**
     * Gets the value of the assocCRSID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssocCRSID() {
        return assocCRSID;
    }

    /**
     * Sets the value of the assocCRSID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssocCRSID(String value) {
        this.assocCRSID = value;
    }

    /**
     * Gets the value of the assocAgntSONID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssocAgntSONID() {
        return assocAgntSONID;
    }

    /**
     * Sets the value of the assocAgntSONID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssocAgntSONID(String value) {
        this.assocAgntSONID = value;
    }

    /**
     * Gets the value of the corpTravInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpTravInd() {
        return corpTravInd;
    }

    /**
     * Sets the value of the corpTravInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpTravInd(String value) {
        this.corpTravInd = value;
    }

}
