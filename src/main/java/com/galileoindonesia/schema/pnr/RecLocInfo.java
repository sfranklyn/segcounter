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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TmStamp"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DtStamp"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Vnd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RecLoc"/>
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
    "tmStamp",
    "dtStamp",
    "vnd",
    "recLoc"
})
@XmlRootElement(name = "RecLocInfo")
public class RecLocInfo
    implements Serializable
{

    @XmlElement(name = "TmStamp", required = true)
    protected String tmStamp;
    @XmlElement(name = "DtStamp", required = true)
    protected String dtStamp;
    @XmlElement(name = "Vnd", required = true)
    protected String vnd;
    @XmlElement(name = "RecLoc", required = true)
    protected String recLoc;

    /**
     * Gets the value of the tmStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmStamp() {
        return tmStamp;
    }

    /**
     * Sets the value of the tmStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmStamp(String value) {
        this.tmStamp = value;
    }

    /**
     * Gets the value of the dtStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtStamp() {
        return dtStamp;
    }

    /**
     * Sets the value of the dtStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtStamp(String value) {
        this.dtStamp = value;
    }

    /**
     * Gets the value of the vnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVnd() {
        return vnd;
    }

    /**
     * Sets the value of the vnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVnd(String value) {
        this.vnd = value;
    }

    /**
     * Gets the value of the recLoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecLoc() {
        return recLoc;
    }

    /**
     * Sets the value of the recLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecLoc(String value) {
        this.recLoc = value;
    }

}
