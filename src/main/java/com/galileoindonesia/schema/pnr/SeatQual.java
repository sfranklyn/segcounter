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
 *         &lt;element name="SeatAry">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Seat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "seatAry"
})
@XmlRootElement(name = "SeatQual")
public class SeatQual
    implements Serializable
{

    @XmlElement(name = "SeatAry", required = true)
    protected SeatQual.SeatAry seatAry;

    /**
     * Gets the value of the seatAry property.
     * 
     * @return
     *     possible object is
     *     {@link SeatQual.SeatAry }
     *     
     */
    public SeatQual.SeatAry getSeatAry() {
        return seatAry;
    }

    /**
     * Sets the value of the seatAry property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatQual.SeatAry }
     *     
     */
    public void setSeatAry(SeatQual.SeatAry value) {
        this.seatAry = value;
    }


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
     *         &lt;element name="Seat" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "seat"
    })
    public static class SeatAry
        implements Serializable
    {

        @XmlElement(name = "Seat", required = true)
        protected String seat;

        /**
         * Gets the value of the seat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeat() {
            return seat;
        }

        /**
         * Sets the value of the seat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeat(String value) {
            this.seat = value;
        }

    }

}
