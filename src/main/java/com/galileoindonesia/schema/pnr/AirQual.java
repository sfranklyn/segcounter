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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AirV"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartAirp"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndAirp"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FltNum"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}OpSuf"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BIC"/>
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
    "startDt",
    "airV",
    "startAirp",
    "endAirp",
    "fltNum",
    "opSuf",
    "bic"
})
@XmlRootElement(name = "AirQual")
public class AirQual
    implements Serializable
{

    @XmlElement(name = "StartDt", required = true)
    protected String startDt;
    @XmlElement(name = "AirV", required = true)
    protected String airV;
    @XmlElement(name = "StartAirp", required = true)
    protected String startAirp;
    @XmlElement(name = "EndAirp", required = true)
    protected String endAirp;
    @XmlElement(name = "FltNum", required = true)
    protected String fltNum;
    @XmlElement(name = "OpSuf", required = true)
    protected String opSuf;
    @XmlElement(name = "BIC", required = true)
    protected String bic;

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDt(String value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the airV property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirV() {
        return airV;
    }

    /**
     * Sets the value of the airV property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirV(String value) {
        this.airV = value;
    }

    /**
     * Gets the value of the startAirp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAirp() {
        return startAirp;
    }

    /**
     * Sets the value of the startAirp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAirp(String value) {
        this.startAirp = value;
    }

    /**
     * Gets the value of the endAirp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndAirp() {
        return endAirp;
    }

    /**
     * Sets the value of the endAirp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAirp(String value) {
        this.endAirp = value;
    }

    /**
     * Gets the value of the fltNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFltNum() {
        return fltNum;
    }

    /**
     * Sets the value of the fltNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFltNum(String value) {
        this.fltNum = value;
    }

    /**
     * Gets the value of the opSuf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpSuf() {
        return opSuf;
    }

    /**
     * Sets the value of the opSuf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpSuf(String value) {
        this.opSuf = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

}
