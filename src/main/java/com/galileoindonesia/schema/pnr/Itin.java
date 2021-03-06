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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PortInd"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Name"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StartTm"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndTm"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BoardDt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BoardTm"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "portInd",
    "name",
    "startDt",
    "startTm",
    "endDt",
    "endTm",
    "boardDt",
    "boardTm",
    "status"
})
@XmlRootElement(name = "Itin")
public class Itin
    implements Serializable
{

    @XmlElement(name = "PortInd", required = true)
    protected String portInd;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "StartDt", required = true)
    protected String startDt;
    @XmlElement(name = "StartTm", required = true)
    protected String startTm;
    @XmlElement(name = "EndDt", required = true)
    protected String endDt;
    @XmlElement(name = "EndTm", required = true)
    protected String endTm;
    @XmlElement(name = "BoardDt", required = true)
    protected String boardDt;
    @XmlElement(name = "BoardTm", required = true)
    protected String boardTm;
    @XmlElement(name = "Status", required = true)
    protected String status;

    /**
     * Gets the value of the portInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortInd() {
        return portInd;
    }

    /**
     * Sets the value of the portInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortInd(String value) {
        this.portInd = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Gets the value of the startTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTm() {
        return startTm;
    }

    /**
     * Sets the value of the startTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTm(String value) {
        this.startTm = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDt(String value) {
        this.endDt = value;
    }

    /**
     * Gets the value of the endTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTm() {
        return endTm;
    }

    /**
     * Sets the value of the endTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTm(String value) {
        this.endTm = value;
    }

    /**
     * Gets the value of the boardDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardDt() {
        return boardDt;
    }

    /**
     * Sets the value of the boardDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardDt(String value) {
        this.boardDt = value;
    }

    /**
     * Gets the value of the boardTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardTm() {
        return boardTm;
    }

    /**
     * Sets the value of the boardTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardTm(String value) {
        this.boardTm = value;
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

}
