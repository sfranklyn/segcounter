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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FareNumInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DPOK"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ErrText"/>
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
    "fareNumInfo",
    "dpok",
    "errText"
})
@XmlRootElement(name = "RestrictFare")
public class RestrictFare implements Serializable
{

    @XmlElement(name = "FareNumInfo", required = true)
    protected FareNumInfo fareNumInfo;
    @XmlElement(name = "DPOK", required = true)
    protected String dpok;
    @XmlElement(name = "ErrText", required = true)
    protected ErrText errText;

    /**
     * Gets the value of the fareNumInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FareNumInfo }
     *     
     */
    public FareNumInfo getFareNumInfo() {
        return fareNumInfo;
    }

    /**
     * Sets the value of the fareNumInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareNumInfo }
     *     
     */
    public void setFareNumInfo(FareNumInfo value) {
        this.fareNumInfo = value;
    }

    /**
     * Gets the value of the dpok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPOK() {
        return dpok;
    }

    /**
     * Sets the value of the dpok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPOK(String value) {
        this.dpok = value;
    }

    /**
     * Gets the value of the errText property.
     * 
     * @return
     *     possible object is
     *     {@link ErrText }
     *     
     */
    public ErrText getErrText() {
        return errText;
    }

    /**
     * Sets the value of the errText property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrText }
     *     
     */
    public void setErrText(ErrText value) {
        this.errText = value;
    }

}
