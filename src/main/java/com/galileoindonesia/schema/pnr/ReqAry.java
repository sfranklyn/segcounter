//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-548 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.03.31 at 11:27:25 AM ICT 
//


package com.galileoindonesia.schema.pnr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *       &lt;choice>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Req" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ReqInfo" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "req",
    "reqInfo"
})
@XmlRootElement(name = "ReqAry")
public class ReqAry
    implements Serializable
{

    @XmlElement(name = "Req")
    protected List<Req> req;
    @XmlElement(name = "ReqInfo")
    protected List<ReqInfo> reqInfo;

    /**
     * Gets the value of the req property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the req property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Req }
     * 
     * 
     */
    public List<Req> getReq() {
        if (req == null) {
            req = new ArrayList<Req>();
        }
        return this.req;
    }

    /**
     * Gets the value of the reqInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reqInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReqInfo }
     * 
     * 
     */
    public List<ReqInfo> getReqInfo() {
        if (reqInfo == null) {
            reqInfo = new ArrayList<ReqInfo>();
        }
        return this.reqInfo;
    }

}
