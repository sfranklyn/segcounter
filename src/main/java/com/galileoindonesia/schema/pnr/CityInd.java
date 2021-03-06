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
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Mandatory-NoStopover"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}MandatoryRtePt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CityWI1stLevelSideTrip"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CityWI2ndLevelSideTrip"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AllowOpenJawBreak"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SurfaceSectorInc"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SurfaceSectorExc"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SysGenFictitiousPt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NegMileExcMPMReductionPt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}RIOSAOMileCity"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}UnspecExtraMileAllow"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SouthAtlanticMileCity"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ClassDifferential"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Spare1"/>
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
    "mandatoryNoStopover",
    "mandatoryRtePt",
    "cityWI1StLevelSideTrip",
    "cityWI2NdLevelSideTrip",
    "allowOpenJawBreak",
    "surfaceSectorInc",
    "surfaceSectorExc",
    "sysGenFictitiousPt",
    "negMileExcMPMReductionPt",
    "riosaoMileCity",
    "unspecExtraMileAllow",
    "southAtlanticMileCity",
    "classDifferential",
    "spare1"
})
@XmlRootElement(name = "CityInd")
public class CityInd
    implements Serializable
{

    @XmlElement(name = "Mandatory-NoStopover", required = true)
    protected String mandatoryNoStopover;
    @XmlElement(name = "MandatoryRtePt", required = true)
    protected String mandatoryRtePt;
    @XmlElement(name = "CityWI1stLevelSideTrip", required = true)
    protected String cityWI1StLevelSideTrip;
    @XmlElement(name = "CityWI2ndLevelSideTrip", required = true)
    protected String cityWI2NdLevelSideTrip;
    @XmlElement(name = "AllowOpenJawBreak", required = true)
    protected String allowOpenJawBreak;
    @XmlElement(name = "SurfaceSectorInc", required = true)
    protected String surfaceSectorInc;
    @XmlElement(name = "SurfaceSectorExc", required = true)
    protected String surfaceSectorExc;
    @XmlElement(name = "SysGenFictitiousPt", required = true)
    protected String sysGenFictitiousPt;
    @XmlElement(name = "NegMileExcMPMReductionPt", required = true)
    protected String negMileExcMPMReductionPt;
    @XmlElement(name = "RIOSAOMileCity", required = true)
    protected String riosaoMileCity;
    @XmlElement(name = "UnspecExtraMileAllow", required = true)
    protected String unspecExtraMileAllow;
    @XmlElement(name = "SouthAtlanticMileCity", required = true)
    protected String southAtlanticMileCity;
    @XmlElement(name = "ClassDifferential", required = true)
    protected String classDifferential;
    @XmlElement(name = "Spare1", required = true)
    protected String spare1;

    /**
     * Gets the value of the mandatoryNoStopover property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandatoryNoStopover() {
        return mandatoryNoStopover;
    }

    /**
     * Sets the value of the mandatoryNoStopover property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandatoryNoStopover(String value) {
        this.mandatoryNoStopover = value;
    }

    /**
     * Gets the value of the mandatoryRtePt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMandatoryRtePt() {
        return mandatoryRtePt;
    }

    /**
     * Sets the value of the mandatoryRtePt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMandatoryRtePt(String value) {
        this.mandatoryRtePt = value;
    }

    /**
     * Gets the value of the cityWI1StLevelSideTrip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityWI1StLevelSideTrip() {
        return cityWI1StLevelSideTrip;
    }

    /**
     * Sets the value of the cityWI1StLevelSideTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityWI1StLevelSideTrip(String value) {
        this.cityWI1StLevelSideTrip = value;
    }

    /**
     * Gets the value of the cityWI2NdLevelSideTrip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityWI2NdLevelSideTrip() {
        return cityWI2NdLevelSideTrip;
    }

    /**
     * Sets the value of the cityWI2NdLevelSideTrip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityWI2NdLevelSideTrip(String value) {
        this.cityWI2NdLevelSideTrip = value;
    }

    /**
     * Gets the value of the allowOpenJawBreak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowOpenJawBreak() {
        return allowOpenJawBreak;
    }

    /**
     * Sets the value of the allowOpenJawBreak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowOpenJawBreak(String value) {
        this.allowOpenJawBreak = value;
    }

    /**
     * Gets the value of the surfaceSectorInc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurfaceSectorInc() {
        return surfaceSectorInc;
    }

    /**
     * Sets the value of the surfaceSectorInc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfaceSectorInc(String value) {
        this.surfaceSectorInc = value;
    }

    /**
     * Gets the value of the surfaceSectorExc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurfaceSectorExc() {
        return surfaceSectorExc;
    }

    /**
     * Sets the value of the surfaceSectorExc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfaceSectorExc(String value) {
        this.surfaceSectorExc = value;
    }

    /**
     * Gets the value of the sysGenFictitiousPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysGenFictitiousPt() {
        return sysGenFictitiousPt;
    }

    /**
     * Sets the value of the sysGenFictitiousPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysGenFictitiousPt(String value) {
        this.sysGenFictitiousPt = value;
    }

    /**
     * Gets the value of the negMileExcMPMReductionPt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegMileExcMPMReductionPt() {
        return negMileExcMPMReductionPt;
    }

    /**
     * Sets the value of the negMileExcMPMReductionPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegMileExcMPMReductionPt(String value) {
        this.negMileExcMPMReductionPt = value;
    }

    /**
     * Gets the value of the riosaoMileCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIOSAOMileCity() {
        return riosaoMileCity;
    }

    /**
     * Sets the value of the riosaoMileCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIOSAOMileCity(String value) {
        this.riosaoMileCity = value;
    }

    /**
     * Gets the value of the unspecExtraMileAllow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnspecExtraMileAllow() {
        return unspecExtraMileAllow;
    }

    /**
     * Sets the value of the unspecExtraMileAllow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnspecExtraMileAllow(String value) {
        this.unspecExtraMileAllow = value;
    }

    /**
     * Gets the value of the southAtlanticMileCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSouthAtlanticMileCity() {
        return southAtlanticMileCity;
    }

    /**
     * Sets the value of the southAtlanticMileCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSouthAtlanticMileCity(String value) {
        this.southAtlanticMileCity = value;
    }

    /**
     * Gets the value of the classDifferential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDifferential() {
        return classDifferential;
    }

    /**
     * Sets the value of the classDifferential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDifferential(String value) {
        this.classDifferential = value;
    }

    /**
     * Gets the value of the spare1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpare1() {
        return spare1;
    }

    /**
     * Sets the value of the spare1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpare1(String value) {
        this.spare1 = value;
    }

}
