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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PenMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NoMinStayMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NoMaxStayMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NoMinOrMaxStayMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NoRestrictionsMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NoAdvPurchMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PICOptMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PICOnlyMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PFMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FICMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}StopoverMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NoBreakMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ConxMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}OnlyBreakMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BreakMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TaxExemptMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PlatingAirVMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TICMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ReturnMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CommissionMod"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SoldTicketed"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TicketingCurrency"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BaggageAllowance"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TicketDesignator"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TicketValidity"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PrintRLoc"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PsgrReceiptOverride"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EndorsementBox"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BulkTicket"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NonRefundBulkTicket"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FreeFormTicket"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}GroupTour"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FreeTicket"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TourCode"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NetRemitOverride"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ActualSellingFare"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AccountingInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CorporateDiscount"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}InvoiceFare"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NettFare"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NettRemittance"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ValueCode"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}DocumentSelect"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SatelliteTicketPrinting"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ItinRmksSuppression"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}WaitlistSegSelect"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AuxSegSelect"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}BackOfficeInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}EncargosFinanceiros"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SysGenItinNumbers"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}OriginalAgentDetail"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}VAT"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}VATExempt"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NonNegotiableCharge"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PrintTableOverride"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AdditionalPsgrFareInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}Commission"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AdditionalFareInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FareNumInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FaxData"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AssocSegs"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SegmentData"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CreditCardFOP"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CheckFOP"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}OtherFOP"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AssocPsgrs"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ItineraryCity"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ErrText"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}CommNetGrossInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}ExtendedQuoteInformation"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}FareConstruction"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}GenQuoteDetails"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}InfoMsg"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SellFareConstruct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NetFareConstruct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkAuditFareConstruct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkPsgrFareConstruct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}PsgrFacilityCharge"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NetStructFareConstruct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkAuditStructFareConstruct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkPsgrStructFareConstruct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SellStructFareConstruct"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}SegRelatedInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkPsgrFareConstructTaxInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}NetFareTaxInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TaxBreakdown"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}TkAuditFareTaxInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}WaiverInfo"/>
 *         &lt;element ref="{http://www.galileoindonesia.com/schema/PNR}AgntEnteredPsgrDescInfo"/>
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
    "penModOrNoMinStayModOrNoMaxStayMod"
})
@XmlRootElement(name = "DocProdDisplayStoredQuote")
public class DocProdDisplayStoredQuote implements Serializable
{

    @XmlElementRefs({
        @XmlElementRef(name = "TkAuditFareTaxInfo", namespace = "http://www.galileoindonesia.com/schema/PNR", type = TkAuditFareTaxInfo.class),
        @XmlElementRef(name = "CreditCardFOP", namespace = "http://www.galileoindonesia.com/schema/PNR", type = CreditCardFOP.class),
        @XmlElementRef(name = "NoBreakMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = NoBreakMod.class),
        @XmlElementRef(name = "DocumentSelect", namespace = "http://www.galileoindonesia.com/schema/PNR", type = DocumentSelect.class),
        @XmlElementRef(name = "AdditionalFareInfo", namespace = "http://www.galileoindonesia.com/schema/PNR", type = AdditionalFareInfo.class),
        @XmlElementRef(name = "ErrText", namespace = "http://www.galileoindonesia.com/schema/PNR", type = ErrText.class),
        @XmlElementRef(name = "PFMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = PFMod.class),
        @XmlElementRef(name = "EncargosFinanceiros", namespace = "http://www.galileoindonesia.com/schema/PNR", type = EncargosFinanceiros.class),
        @XmlElementRef(name = "TourCode", namespace = "http://www.galileoindonesia.com/schema/PNR", type = TourCode.class),
        @XmlElementRef(name = "CommNetGrossInfo", namespace = "http://www.galileoindonesia.com/schema/PNR", type = CommNetGrossInfo.class),
        @XmlElementRef(name = "AccountingInfo", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "TicketValidity", namespace = "http://www.galileoindonesia.com/schema/PNR", type = TicketValidity.class),
        @XmlElementRef(name = "BackOfficeInfo", namespace = "http://www.galileoindonesia.com/schema/PNR", type = BackOfficeInfo.class),
        @XmlElementRef(name = "GenQuoteDetails", namespace = "http://www.galileoindonesia.com/schema/PNR", type = GenQuoteDetails.class),
        @XmlElementRef(name = "BreakMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = BreakMod.class),
        @XmlElementRef(name = "TkAuditStructFareConstruct", namespace = "http://www.galileoindonesia.com/schema/PNR", type = TkAuditStructFareConstruct.class),
        @XmlElementRef(name = "TkPsgrFareConstructTaxInfo", namespace = "http://www.galileoindonesia.com/schema/PNR", type = TkPsgrFareConstructTaxInfo.class),
        @XmlElementRef(name = "NonRefundBulkTicket", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "AssocSegs", namespace = "http://www.galileoindonesia.com/schema/PNR", type = AssocSegs.class),
        @XmlElementRef(name = "TICMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = TICMod.class),
        @XmlElementRef(name = "WaiverInfo", namespace = "http://www.galileoindonesia.com/schema/PNR", type = WaiverInfo.class),
        @XmlElementRef(name = "CheckFOP", namespace = "http://www.galileoindonesia.com/schema/PNR", type = CheckFOP.class),
        @XmlElementRef(name = "ItinRmksSuppression", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "SegmentData", namespace = "http://www.galileoindonesia.com/schema/PNR", type = SegmentData.class),
        @XmlElementRef(name = "AgntEnteredPsgrDescInfo", namespace = "http://www.galileoindonesia.com/schema/PNR", type = AgntEnteredPsgrDescInfo.class),
        @XmlElementRef(name = "ActualSellingFare", namespace = "http://www.galileoindonesia.com/schema/PNR", type = ActualSellingFare.class),
        @XmlElementRef(name = "PrintTableOverride", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "NoMinStayMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "NetFareTaxInfo", namespace = "http://www.galileoindonesia.com/schema/PNR", type = NetFareTaxInfo.class),
        @XmlElementRef(name = "NoAdvPurchMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "FreeTicket", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "InvoiceFare", namespace = "http://www.galileoindonesia.com/schema/PNR", type = InvoiceFare.class),
        @XmlElementRef(name = "PrintRLoc", namespace = "http://www.galileoindonesia.com/schema/PNR", type = PrintRLoc.class),
        @XmlElementRef(name = "TicketDesignator", namespace = "http://www.galileoindonesia.com/schema/PNR", type = TicketDesignator.class),
        @XmlElementRef(name = "FareConstruction", namespace = "http://www.galileoindonesia.com/schema/PNR", type = FareConstruction.class),
        @XmlElementRef(name = "NetFareConstruct", namespace = "http://www.galileoindonesia.com/schema/PNR", type = NetFareConstruct.class),
        @XmlElementRef(name = "NettRemittance", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "PsgrReceiptOverride", namespace = "http://www.galileoindonesia.com/schema/PNR", type = PsgrReceiptOverride.class),
        @XmlElementRef(name = "NoRestrictionsMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "SysGenItinNumbers", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "PenMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "OtherFOP", namespace = "http://www.galileoindonesia.com/schema/PNR", type = OtherFOP.class),
        @XmlElementRef(name = "StopoverMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = StopoverMod.class),
        @XmlElementRef(name = "AssocPsgrs", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "BulkTicket", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "CorporateDiscount", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "SellFareConstruct", namespace = "http://www.galileoindonesia.com/schema/PNR", type = SellFareConstruct.class),
        @XmlElementRef(name = "ConxMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = ConxMod.class),
        @XmlElementRef(name = "FaxData", namespace = "http://www.galileoindonesia.com/schema/PNR", type = FaxData.class),
        @XmlElementRef(name = "NetRemitOverride", namespace = "http://www.galileoindonesia.com/schema/PNR", type = NetRemitOverride.class),
        @XmlElementRef(name = "NoMaxStayMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "TaxExemptMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "ReturnMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = ReturnMod.class),
        @XmlElementRef(name = "VATExempt", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "PICOnlyMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = PICOnlyMod.class),
        @XmlElementRef(name = "WaitlistSegSelect", namespace = "http://www.galileoindonesia.com/schema/PNR", type = WaitlistSegSelect.class),
        @XmlElementRef(name = "PlatingAirVMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = PlatingAirVMod.class),
        @XmlElementRef(name = "SegRelatedInfo", namespace = "http://www.galileoindonesia.com/schema/PNR", type = SegRelatedInfo.class),
        @XmlElementRef(name = "TaxBreakdown", namespace = "http://www.galileoindonesia.com/schema/PNR", type = TaxBreakdown.class),
        @XmlElementRef(name = "FareNumInfo", namespace = "http://www.galileoindonesia.com/schema/PNR", type = FareNumInfo.class),
        @XmlElementRef(name = "SoldTicketed", namespace = "http://www.galileoindonesia.com/schema/PNR", type = SoldTicketed.class),
        @XmlElementRef(name = "Commission", namespace = "http://www.galileoindonesia.com/schema/PNR", type = Commission.class),
        @XmlElementRef(name = "FICMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = FICMod.class),
        @XmlElementRef(name = "InfoMsg", namespace = "http://www.galileoindonesia.com/schema/PNR", type = InfoMsg.class),
        @XmlElementRef(name = "ValueCode", namespace = "http://www.galileoindonesia.com/schema/PNR", type = ValueCode.class),
        @XmlElementRef(name = "CommissionMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = CommissionMod.class),
        @XmlElementRef(name = "ItineraryCity", namespace = "http://www.galileoindonesia.com/schema/PNR", type = ItineraryCity.class),
        @XmlElementRef(name = "TkPsgrStructFareConstruct", namespace = "http://www.galileoindonesia.com/schema/PNR", type = TkPsgrStructFareConstruct.class),
        @XmlElementRef(name = "AuxSegSelect", namespace = "http://www.galileoindonesia.com/schema/PNR", type = AuxSegSelect.class),
        @XmlElementRef(name = "TkAuditFareConstruct", namespace = "http://www.galileoindonesia.com/schema/PNR", type = TkAuditFareConstruct.class),
        @XmlElementRef(name = "GroupTour", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "SatelliteTicketPrinting", namespace = "http://www.galileoindonesia.com/schema/PNR", type = SatelliteTicketPrinting.class),
        @XmlElementRef(name = "OriginalAgentDetail", namespace = "http://www.galileoindonesia.com/schema/PNR", type = OriginalAgentDetail.class),
        @XmlElementRef(name = "PICOptMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = PICOptMod.class),
        @XmlElementRef(name = "SellStructFareConstruct", namespace = "http://www.galileoindonesia.com/schema/PNR", type = SellStructFareConstruct.class),
        @XmlElementRef(name = "BaggageAllowance", namespace = "http://www.galileoindonesia.com/schema/PNR", type = BaggageAllowance.class),
        @XmlElementRef(name = "TkPsgrFareConstruct", namespace = "http://www.galileoindonesia.com/schema/PNR", type = TkPsgrFareConstruct.class),
        @XmlElementRef(name = "PsgrFacilityCharge", namespace = "http://www.galileoindonesia.com/schema/PNR", type = PsgrFacilityCharge.class),
        @XmlElementRef(name = "OnlyBreakMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = OnlyBreakMod.class),
        @XmlElementRef(name = "VAT", namespace = "http://www.galileoindonesia.com/schema/PNR", type = VAT.class),
        @XmlElementRef(name = "AdditionalPsgrFareInfo", namespace = "http://www.galileoindonesia.com/schema/PNR", type = AdditionalPsgrFareInfo.class),
        @XmlElementRef(name = "FreeFormTicket", namespace = "http://www.galileoindonesia.com/schema/PNR", type = FreeFormTicket.class),
        @XmlElementRef(name = "NetStructFareConstruct", namespace = "http://www.galileoindonesia.com/schema/PNR", type = NetStructFareConstruct.class),
        @XmlElementRef(name = "TicketingCurrency", namespace = "http://www.galileoindonesia.com/schema/PNR", type = TicketingCurrency.class),
        @XmlElementRef(name = "EndorsementBox", namespace = "http://www.galileoindonesia.com/schema/PNR", type = EndorsementBox.class),
        @XmlElementRef(name = "NoMinOrMaxStayMod", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "NonNegotiableCharge", namespace = "http://www.galileoindonesia.com/schema/PNR", type = JAXBElement.class),
        @XmlElementRef(name = "ExtendedQuoteInformation", namespace = "http://www.galileoindonesia.com/schema/PNR", type = ExtendedQuoteInformation.class),
        @XmlElementRef(name = "NettFare", namespace = "http://www.galileoindonesia.com/schema/PNR", type = NettFare.class)
    })
    protected List<Object> penModOrNoMinStayModOrNoMaxStayMod;

    /**
     * Gets the value of the penModOrNoMinStayModOrNoMaxStayMod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penModOrNoMinStayModOrNoMaxStayMod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenModOrNoMinStayModOrNoMaxStayMod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TkAuditFareTaxInfo }
     * {@link CreditCardFOP }
     * {@link DocumentSelect }
     * {@link NoBreakMod }
     * {@link AdditionalFareInfo }
     * {@link ErrText }
     * {@link PFMod }
     * {@link TourCode }
     * {@link EncargosFinanceiros }
     * {@link CommNetGrossInfo }
     * {@link TicketValidity }
     * {@link JAXBElement }{@code <}{@link InfoType }{@code >}
     * {@link BackOfficeInfo }
     * {@link BreakMod }
     * {@link GenQuoteDetails }
     * {@link TkAuditStructFareConstruct }
     * {@link TkPsgrFareConstructTaxInfo }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link AssocSegs }
     * {@link CheckFOP }
     * {@link WaiverInfo }
     * {@link TICMod }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link SegmentData }
     * {@link AgntEnteredPsgrDescInfo }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link ActualSellingFare }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link NetFareTaxInfo }
     * {@link InvoiceFare }
     * {@link PrintRLoc }
     * {@link TicketDesignator }
     * {@link NetFareConstruct }
     * {@link FareConstruction }
     * {@link PsgrReceiptOverride }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link PenType }{@code >}
     * {@link OtherFOP }
     * {@link StopoverMod }
     * {@link JAXBElement }{@code <}{@link PsgrAryType }{@code >}
     * {@link JAXBElement }{@code <}{@link FareConstructIndType }{@code >}
     * {@link SellFareConstruct }
     * {@link JAXBElement }{@code <}{@link InfoType }{@code >}
     * {@link ConxMod }
     * {@link FaxData }
     * {@link NetRemitOverride }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link WaitlistSegSelect }
     * {@link PICOnlyMod }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link ReturnMod }
     * {@link PlatingAirVMod }
     * {@link SegRelatedInfo }
     * {@link TaxBreakdown }
     * {@link FareNumInfo }
     * {@link InfoMsg }
     * {@link FICMod }
     * {@link Commission }
     * {@link SoldTicketed }
     * {@link ValueCode }
     * {@link ItineraryCity }
     * {@link CommissionMod }
     * {@link AuxSegSelect }
     * {@link TkPsgrStructFareConstruct }
     * {@link TkAuditFareConstruct }
     * {@link JAXBElement }{@code <}{@link FareConstructIndType }{@code >}
     * {@link OriginalAgentDetail }
     * {@link SatelliteTicketPrinting }
     * {@link PICOptMod }
     * {@link SellStructFareConstruct }
     * {@link BaggageAllowance }
     * {@link TkPsgrFareConstruct }
     * {@link OnlyBreakMod }
     * {@link PsgrFacilityCharge }
     * {@link VAT }
     * {@link AdditionalPsgrFareInfo }
     * {@link FreeFormTicket }
     * {@link NetStructFareConstruct }
     * {@link TicketingCurrency }
     * {@link EndorsementBox }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link ExtendedQuoteInformation }
     * {@link NettFare }
     * 
     * 
     */
    public List<Object> getPenModOrNoMinStayModOrNoMaxStayMod() {
        if (penModOrNoMinStayModOrNoMaxStayMod == null) {
            penModOrNoMinStayModOrNoMaxStayMod = new ArrayList<Object>();
        }
        return this.penModOrNoMinStayModOrNoMaxStayMod;
    }

}
