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
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RmkAry"/>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AbsLNameNum"/>
 *             &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AbsFNameNum"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}LineNum" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}IDType"/>
 *           &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Type"/>
 *         &lt;/choice>
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
    "rmkAry",
    "absLNameNum",
    "absFNameNum",
    "lineNum",
    "idType",
    "type"
})
@XmlRootElement(name = "DelQual")
public class DelQual
    implements Serializable
{

    @XmlElement(name = "RmkAry")
    protected RmkAry rmkAry;
    @XmlElement(name = "AbsLNameNum")
    protected String absLNameNum;
    @XmlElement(name = "AbsFNameNum")
    protected String absFNameNum;
    @XmlElement(name = "LineNum")
    protected String lineNum;
    @XmlElement(name = "IDType")
    protected String idType;
    @XmlElement(name = "Type")
    protected String type;

    /**
     * Gets the value of the rmkAry property.
     * 
     * @return
     *     possible object is
     *     {@link RmkAry }
     *     
     */
    public RmkAry getRmkAry() {
        return rmkAry;
    }

    /**
     * Sets the value of the rmkAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link RmkAry }
     *     
     */
    public void setRmkAry(RmkAry value) {
        this.rmkAry = value;
    }

    /**
     * Gets the value of the absLNameNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsLNameNum() {
        return absLNameNum;
    }

    /**
     * Sets the value of the absLNameNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsLNameNum(String value) {
        this.absLNameNum = value;
    }

    /**
     * Gets the value of the absFNameNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsFNameNum() {
        return absFNameNum;
    }

    /**
     * Sets the value of the absFNameNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsFNameNum(String value) {
        this.absFNameNum = value;
    }

    /**
     * Gets the value of the lineNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNum() {
        return lineNum;
    }

    /**
     * Sets the value of the lineNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNum(String value) {
        this.lineNum = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
