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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CancelInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IssuePaperTkInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IssuePaperTkToSTP"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}STPlocation"/>
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
    "cancelInd",
    "issuePaperTkInd",
    "issuePaperTkToSTP",
    "stPlocation"
})
@XmlRootElement(name = "ElectronicTicketFailed")
public class ElectronicTicketFailed
    implements Serializable
{

    @XmlElement(name = "CancelInd", required = true)
    protected String cancelInd;
    @XmlElement(name = "IssuePaperTkInd", required = true)
    protected String issuePaperTkInd;
    @XmlElement(name = "IssuePaperTkToSTP", required = true)
    protected String issuePaperTkToSTP;
    @XmlElement(name = "STPlocation", required = true)
    protected String stPlocation;

    /**
     * Gets the value of the cancelInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelInd() {
        return cancelInd;
    }

    /**
     * Sets the value of the cancelInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelInd(String value) {
        this.cancelInd = value;
    }

    /**
     * Gets the value of the issuePaperTkInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuePaperTkInd() {
        return issuePaperTkInd;
    }

    /**
     * Sets the value of the issuePaperTkInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuePaperTkInd(String value) {
        this.issuePaperTkInd = value;
    }

    /**
     * Gets the value of the issuePaperTkToSTP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuePaperTkToSTP() {
        return issuePaperTkToSTP;
    }

    /**
     * Sets the value of the issuePaperTkToSTP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuePaperTkToSTP(String value) {
        this.issuePaperTkToSTP = value;
    }

    /**
     * Gets the value of the stPlocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTPlocation() {
        return stPlocation;
    }

    /**
     * Sets the value of the stPlocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTPlocation(String value) {
        this.stPlocation = value;
    }

}
