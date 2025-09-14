
package com.diximonline.cbspaymentsimulator.acxf.types;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjAchOtrfUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjAchOtrfUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://com/icsfs/banks/ws/BanksMiddleware_PE07COT00.wsdl/types/}ObjAchOtrfBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apprTellId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="intrInstNameAdd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sourceCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ordInstNameAdd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="equivAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="benfBankCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="traPur" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="intrInstPartyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="crValDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ordCustAcct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="traType" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="remitInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="crIntDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="braComChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="benfBraCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="chgAcct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="instrAmtFlag" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="exchPermit" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="intrInstOptCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="equivBaseAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="refKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="stampsChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="corrChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="altChgCurCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ordInstOptCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="isoPayCurCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="benfId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="chgDet" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="apprTraDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="braCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="traStaCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="isoTraCurCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ordInstPartyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="multiBenfFlag" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="benfCountry" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="commRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="transRemarks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="benfCustNameAdd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="benfCustAcct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="benfBankOptCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="tellId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="reqRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fstApprTellId" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="instrAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="covAcct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="benfTraAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="acWithInst" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="swfChgAcct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="contactInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="apprBraCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="traDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="traPayType" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="apprFlag" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="custAcct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="drValDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ordCustOptCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="cusIdNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="benfCity" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="traStaChgDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="restCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="traAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="traServiceType" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="processRem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rejReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="swiftChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="cusIdType" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="benfCustOptCode" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="postTlxChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="exchRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="benfBankPartyId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="chgPayType" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="ordCustNameAdd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="drIntDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="centComChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="exch" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="vatChg" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjAchOtrfUser", propOrder = {
    "apprTellId",
    "intrInstNameAdd",
    "sourceCode",
    "ordInstNameAdd",
    "equivAmt",
    "benfBankCode",
    "traPur",
    "intrInstPartyId",
    "crValDate",
    "ordCustAcct",
    "traType",
    "remitInfo",
    "crIntDate",
    "braComChg",
    "benfBraCode",
    "chgAcct",
    "instrAmtFlag",
    "exchPermit",
    "intrInstOptCode",
    "equivBaseAmt",
    "refKey",
    "stampsChg",
    "corrChg",
    "altChgCurCode",
    "ordInstOptCode",
    "isoPayCurCode",
    "benfId",
    "chgDet",
    "apprTraDate",
    "braCode",
    "traStaCode",
    "isoTraCurCode",
    "ordInstPartyId",
    "multiBenfFlag",
    "benfCountry",
    "commRate",
    "transRemarks",
    "benfCustNameAdd",
    "benfCustAcct",
    "benfBankOptCode",
    "tellId",
    "reqRef",
    "remarks",
    "fstApprTellId",
    "instrAmt",
    "covAcct",
    "benfTraAmt",
    "acWithInst",
    "swfChgAcct",
    "contactInfo",
    "apprBraCode",
    "traDate",
    "traPayType",
    "apprFlag",
    "custAcct",
    "drValDate",
    "ordCustOptCode",
    "cusIdNum",
    "benfCity",
    "traStaChgDate",
    "restCode",
    "traAmt",
    "traServiceType",
    "processRem",
    "rejReason",
    "swiftChg",
    "cusIdType",
    "benfCustOptCode",
    "postTlxChg",
    "exchRate",
    "benfBankPartyId",
    "chgPayType",
    "ordCustNameAdd",
    "drIntDate",
    "centComChg",
    "exch",
    "vatChg"
})
public class ObjAchOtrfUser
    extends ObjAchOtrfBase
{

    @XmlElement(required = true, nillable = true)
    protected BigDecimal apprTellId;
    @XmlElement(required = true, nillable = true)
    protected String intrInstNameAdd;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal sourceCode;
    @XmlElement(required = true, nillable = true)
    protected String ordInstNameAdd;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal equivAmt;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal benfBankCode;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal traPur;
    @XmlElement(required = true, nillable = true)
    protected String intrInstPartyId;
    @XmlElement(required = true, nillable = true)
    protected String crValDate;
    @XmlElement(required = true, nillable = true)
    protected String ordCustAcct;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal traType;
    @XmlElement(required = true, nillable = true)
    protected String remitInfo;
    @XmlElement(required = true, nillable = true)
    protected String crIntDate;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal braComChg;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal benfBraCode;
    @XmlElement(required = true, nillable = true)
    protected String chgAcct;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal instrAmtFlag;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal exchPermit;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal intrInstOptCode;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal equivBaseAmt;
    @XmlElement(required = true, nillable = true)
    protected String refKey;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal stampsChg;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal corrChg;
    @XmlElement(required = true, nillable = true)
    protected String altChgCurCode;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal ordInstOptCode;
    @XmlElement(required = true, nillable = true)
    protected String isoPayCurCode;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal benfId;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal chgDet;
    @XmlElement(required = true, nillable = true)
    protected String apprTraDate;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal braCode;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal traStaCode;
    @XmlElement(required = true, nillable = true)
    protected String isoTraCurCode;
    @XmlElement(required = true, nillable = true)
    protected String ordInstPartyId;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal multiBenfFlag;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal benfCountry;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal commRate;
    @XmlElement(required = true, nillable = true)
    protected String transRemarks;
    @XmlElement(required = true, nillable = true)
    protected String benfCustNameAdd;
    @XmlElement(required = true, nillable = true)
    protected String benfCustAcct;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal benfBankOptCode;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal tellId;
    @XmlElement(required = true, nillable = true)
    protected String reqRef;
    @XmlElement(required = true, nillable = true)
    protected String remarks;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal fstApprTellId;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal instrAmt;
    @XmlElement(required = true, nillable = true)
    protected String covAcct;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal benfTraAmt;
    @XmlElement(required = true, nillable = true)
    protected String acWithInst;
    @XmlElement(required = true, nillable = true)
    protected String swfChgAcct;
    @XmlElement(required = true, nillable = true)
    protected String contactInfo;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal apprBraCode;
    @XmlElement(required = true, nillable = true)
    protected String traDate;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal traPayType;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal apprFlag;
    @XmlElement(required = true, nillable = true)
    protected String custAcct;
    @XmlElement(required = true, nillable = true)
    protected String drValDate;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal ordCustOptCode;
    @XmlElement(required = true, nillable = true)
    protected String cusIdNum;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal benfCity;
    @XmlElement(required = true, nillable = true)
    protected String traStaChgDate;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal restCode;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal traAmt;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal traServiceType;
    @XmlElement(required = true, nillable = true)
    protected String processRem;
    @XmlElement(required = true, nillable = true)
    protected String rejReason;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal swiftChg;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal cusIdType;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal benfCustOptCode;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal postTlxChg;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal exchRate;
    @XmlElement(required = true, nillable = true)
    protected String benfBankPartyId;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal chgPayType;
    @XmlElement(required = true, nillable = true)
    protected String ordCustNameAdd;
    @XmlElement(required = true, nillable = true)
    protected String drIntDate;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal centComChg;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal exch;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal vatChg;

    /**
     * Gets the value of the apprTellId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprTellId() {
        return apprTellId;
    }

    /**
     * Sets the value of the apprTellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprTellId(BigDecimal value) {
        this.apprTellId = value;
    }

    /**
     * Gets the value of the intrInstNameAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrInstNameAdd() {
        return intrInstNameAdd;
    }

    /**
     * Sets the value of the intrInstNameAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrInstNameAdd(String value) {
        this.intrInstNameAdd = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSourceCode(BigDecimal value) {
        this.sourceCode = value;
    }

    /**
     * Gets the value of the ordInstNameAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdInstNameAdd() {
        return ordInstNameAdd;
    }

    /**
     * Sets the value of the ordInstNameAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdInstNameAdd(String value) {
        this.ordInstNameAdd = value;
    }

    /**
     * Gets the value of the equivAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquivAmt() {
        return equivAmt;
    }

    /**
     * Sets the value of the equivAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquivAmt(BigDecimal value) {
        this.equivAmt = value;
    }

    /**
     * Gets the value of the benfBankCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBenfBankCode() {
        return benfBankCode;
    }

    /**
     * Sets the value of the benfBankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBenfBankCode(BigDecimal value) {
        this.benfBankCode = value;
    }

    /**
     * Gets the value of the traPur property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTraPur() {
        return traPur;
    }

    /**
     * Sets the value of the traPur property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTraPur(BigDecimal value) {
        this.traPur = value;
    }

    /**
     * Gets the value of the intrInstPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrInstPartyId() {
        return intrInstPartyId;
    }

    /**
     * Sets the value of the intrInstPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrInstPartyId(String value) {
        this.intrInstPartyId = value;
    }

    /**
     * Gets the value of the crValDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrValDate() {
        return crValDate;
    }

    /**
     * Sets the value of the crValDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrValDate(String value) {
        this.crValDate = value;
    }

    /**
     * Gets the value of the ordCustAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdCustAcct() {
        return ordCustAcct;
    }

    /**
     * Sets the value of the ordCustAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdCustAcct(String value) {
        this.ordCustAcct = value;
    }

    /**
     * Gets the value of the traType property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTraType() {
        return traType;
    }

    /**
     * Sets the value of the traType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTraType(BigDecimal value) {
        this.traType = value;
    }

    /**
     * Gets the value of the remitInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitInfo() {
        return remitInfo;
    }

    /**
     * Sets the value of the remitInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitInfo(String value) {
        this.remitInfo = value;
    }

    /**
     * Gets the value of the crIntDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrIntDate() {
        return crIntDate;
    }

    /**
     * Sets the value of the crIntDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrIntDate(String value) {
        this.crIntDate = value;
    }

    /**
     * Gets the value of the braComChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBraComChg() {
        return braComChg;
    }

    /**
     * Sets the value of the braComChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBraComChg(BigDecimal value) {
        this.braComChg = value;
    }

    /**
     * Gets the value of the benfBraCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBenfBraCode() {
        return benfBraCode;
    }

    /**
     * Sets the value of the benfBraCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBenfBraCode(BigDecimal value) {
        this.benfBraCode = value;
    }

    /**
     * Gets the value of the chgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChgAcct() {
        return chgAcct;
    }

    /**
     * Sets the value of the chgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChgAcct(String value) {
        this.chgAcct = value;
    }

    /**
     * Gets the value of the instrAmtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstrAmtFlag() {
        return instrAmtFlag;
    }

    /**
     * Sets the value of the instrAmtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstrAmtFlag(BigDecimal value) {
        this.instrAmtFlag = value;
    }

    /**
     * Gets the value of the exchPermit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchPermit() {
        return exchPermit;
    }

    /**
     * Sets the value of the exchPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchPermit(BigDecimal value) {
        this.exchPermit = value;
    }

    /**
     * Gets the value of the intrInstOptCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrInstOptCode() {
        return intrInstOptCode;
    }

    /**
     * Sets the value of the intrInstOptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntrInstOptCode(BigDecimal value) {
        this.intrInstOptCode = value;
    }

    /**
     * Gets the value of the equivBaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEquivBaseAmt() {
        return equivBaseAmt;
    }

    /**
     * Sets the value of the equivBaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEquivBaseAmt(BigDecimal value) {
        this.equivBaseAmt = value;
    }

    /**
     * Gets the value of the refKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefKey() {
        return refKey;
    }

    /**
     * Sets the value of the refKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefKey(String value) {
        this.refKey = value;
    }

    /**
     * Gets the value of the stampsChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStampsChg() {
        return stampsChg;
    }

    /**
     * Sets the value of the stampsChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStampsChg(BigDecimal value) {
        this.stampsChg = value;
    }

    /**
     * Gets the value of the corrChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCorrChg() {
        return corrChg;
    }

    /**
     * Sets the value of the corrChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCorrChg(BigDecimal value) {
        this.corrChg = value;
    }

    /**
     * Gets the value of the altChgCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltChgCurCode() {
        return altChgCurCode;
    }

    /**
     * Sets the value of the altChgCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltChgCurCode(String value) {
        this.altChgCurCode = value;
    }

    /**
     * Gets the value of the ordInstOptCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdInstOptCode() {
        return ordInstOptCode;
    }

    /**
     * Sets the value of the ordInstOptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrdInstOptCode(BigDecimal value) {
        this.ordInstOptCode = value;
    }

    /**
     * Gets the value of the isoPayCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoPayCurCode() {
        return isoPayCurCode;
    }

    /**
     * Sets the value of the isoPayCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoPayCurCode(String value) {
        this.isoPayCurCode = value;
    }

    /**
     * Gets the value of the benfId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBenfId() {
        return benfId;
    }

    /**
     * Sets the value of the benfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBenfId(BigDecimal value) {
        this.benfId = value;
    }

    /**
     * Gets the value of the chgDet property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChgDet() {
        return chgDet;
    }

    /**
     * Sets the value of the chgDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChgDet(BigDecimal value) {
        this.chgDet = value;
    }

    /**
     * Gets the value of the apprTraDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprTraDate() {
        return apprTraDate;
    }

    /**
     * Sets the value of the apprTraDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprTraDate(String value) {
        this.apprTraDate = value;
    }

    /**
     * Gets the value of the braCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBraCode() {
        return braCode;
    }

    /**
     * Sets the value of the braCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBraCode(BigDecimal value) {
        this.braCode = value;
    }

    /**
     * Gets the value of the traStaCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTraStaCode() {
        return traStaCode;
    }

    /**
     * Sets the value of the traStaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTraStaCode(BigDecimal value) {
        this.traStaCode = value;
    }

    /**
     * Gets the value of the isoTraCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsoTraCurCode() {
        return isoTraCurCode;
    }

    /**
     * Sets the value of the isoTraCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsoTraCurCode(String value) {
        this.isoTraCurCode = value;
    }

    /**
     * Gets the value of the ordInstPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdInstPartyId() {
        return ordInstPartyId;
    }

    /**
     * Sets the value of the ordInstPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdInstPartyId(String value) {
        this.ordInstPartyId = value;
    }

    /**
     * Gets the value of the multiBenfFlag property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiBenfFlag() {
        return multiBenfFlag;
    }

    /**
     * Sets the value of the multiBenfFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiBenfFlag(BigDecimal value) {
        this.multiBenfFlag = value;
    }

    /**
     * Gets the value of the benfCountry property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBenfCountry() {
        return benfCountry;
    }

    /**
     * Sets the value of the benfCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBenfCountry(BigDecimal value) {
        this.benfCountry = value;
    }

    /**
     * Gets the value of the commRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCommRate() {
        return commRate;
    }

    /**
     * Sets the value of the commRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCommRate(BigDecimal value) {
        this.commRate = value;
    }

    /**
     * Gets the value of the transRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransRemarks() {
        return transRemarks;
    }

    /**
     * Sets the value of the transRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransRemarks(String value) {
        this.transRemarks = value;
    }

    /**
     * Gets the value of the benfCustNameAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenfCustNameAdd() {
        return benfCustNameAdd;
    }

    /**
     * Sets the value of the benfCustNameAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenfCustNameAdd(String value) {
        this.benfCustNameAdd = value;
    }

    /**
     * Gets the value of the benfCustAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenfCustAcct() {
        return benfCustAcct;
    }

    /**
     * Sets the value of the benfCustAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenfCustAcct(String value) {
        this.benfCustAcct = value;
    }

    /**
     * Gets the value of the benfBankOptCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBenfBankOptCode() {
        return benfBankOptCode;
    }

    /**
     * Sets the value of the benfBankOptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBenfBankOptCode(BigDecimal value) {
        this.benfBankOptCode = value;
    }

    /**
     * Gets the value of the tellId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTellId() {
        return tellId;
    }

    /**
     * Sets the value of the tellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTellId(BigDecimal value) {
        this.tellId = value;
    }

    /**
     * Gets the value of the reqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqRef() {
        return reqRef;
    }

    /**
     * Sets the value of the reqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqRef(String value) {
        this.reqRef = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the fstApprTellId property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFstApprTellId() {
        return fstApprTellId;
    }

    /**
     * Sets the value of the fstApprTellId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFstApprTellId(BigDecimal value) {
        this.fstApprTellId = value;
    }

    /**
     * Gets the value of the instrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstrAmt() {
        return instrAmt;
    }

    /**
     * Sets the value of the instrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstrAmt(BigDecimal value) {
        this.instrAmt = value;
    }

    /**
     * Gets the value of the covAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCovAcct() {
        return covAcct;
    }

    /**
     * Sets the value of the covAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCovAcct(String value) {
        this.covAcct = value;
    }

    /**
     * Gets the value of the benfTraAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBenfTraAmt() {
        return benfTraAmt;
    }

    /**
     * Sets the value of the benfTraAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBenfTraAmt(BigDecimal value) {
        this.benfTraAmt = value;
    }

    /**
     * Gets the value of the acWithInst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcWithInst() {
        return acWithInst;
    }

    /**
     * Sets the value of the acWithInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcWithInst(String value) {
        this.acWithInst = value;
    }

    /**
     * Gets the value of the swfChgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwfChgAcct() {
        return swfChgAcct;
    }

    /**
     * Sets the value of the swfChgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwfChgAcct(String value) {
        this.swfChgAcct = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfo(String value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the apprBraCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprBraCode() {
        return apprBraCode;
    }

    /**
     * Sets the value of the apprBraCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprBraCode(BigDecimal value) {
        this.apprBraCode = value;
    }

    /**
     * Gets the value of the traDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraDate() {
        return traDate;
    }

    /**
     * Sets the value of the traDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraDate(String value) {
        this.traDate = value;
    }

    /**
     * Gets the value of the traPayType property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTraPayType() {
        return traPayType;
    }

    /**
     * Sets the value of the traPayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTraPayType(BigDecimal value) {
        this.traPayType = value;
    }

    /**
     * Gets the value of the apprFlag property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprFlag() {
        return apprFlag;
    }

    /**
     * Sets the value of the apprFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprFlag(BigDecimal value) {
        this.apprFlag = value;
    }

    /**
     * Gets the value of the custAcct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustAcct() {
        return custAcct;
    }

    /**
     * Sets the value of the custAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustAcct(String value) {
        this.custAcct = value;
    }

    /**
     * Gets the value of the drValDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrValDate() {
        return drValDate;
    }

    /**
     * Sets the value of the drValDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrValDate(String value) {
        this.drValDate = value;
    }

    /**
     * Gets the value of the ordCustOptCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrdCustOptCode() {
        return ordCustOptCode;
    }

    /**
     * Sets the value of the ordCustOptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrdCustOptCode(BigDecimal value) {
        this.ordCustOptCode = value;
    }

    /**
     * Gets the value of the cusIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusIdNum() {
        return cusIdNum;
    }

    /**
     * Sets the value of the cusIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusIdNum(String value) {
        this.cusIdNum = value;
    }

    /**
     * Gets the value of the benfCity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBenfCity() {
        return benfCity;
    }

    /**
     * Sets the value of the benfCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBenfCity(BigDecimal value) {
        this.benfCity = value;
    }

    /**
     * Gets the value of the traStaChgDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraStaChgDate() {
        return traStaChgDate;
    }

    /**
     * Sets the value of the traStaChgDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraStaChgDate(String value) {
        this.traStaChgDate = value;
    }

    /**
     * Gets the value of the restCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRestCode() {
        return restCode;
    }

    /**
     * Sets the value of the restCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRestCode(BigDecimal value) {
        this.restCode = value;
    }

    /**
     * Gets the value of the traAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTraAmt() {
        return traAmt;
    }

    /**
     * Sets the value of the traAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTraAmt(BigDecimal value) {
        this.traAmt = value;
    }

    /**
     * Gets the value of the traServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTraServiceType() {
        return traServiceType;
    }

    /**
     * Sets the value of the traServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTraServiceType(BigDecimal value) {
        this.traServiceType = value;
    }

    /**
     * Gets the value of the processRem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessRem() {
        return processRem;
    }

    /**
     * Sets the value of the processRem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessRem(String value) {
        this.processRem = value;
    }

    /**
     * Gets the value of the rejReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejReason() {
        return rejReason;
    }

    /**
     * Sets the value of the rejReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejReason(String value) {
        this.rejReason = value;
    }

    /**
     * Gets the value of the swiftChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSwiftChg() {
        return swiftChg;
    }

    /**
     * Sets the value of the swiftChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSwiftChg(BigDecimal value) {
        this.swiftChg = value;
    }

    /**
     * Gets the value of the cusIdType property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCusIdType() {
        return cusIdType;
    }

    /**
     * Sets the value of the cusIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCusIdType(BigDecimal value) {
        this.cusIdType = value;
    }

    /**
     * Gets the value of the benfCustOptCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBenfCustOptCode() {
        return benfCustOptCode;
    }

    /**
     * Sets the value of the benfCustOptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBenfCustOptCode(BigDecimal value) {
        this.benfCustOptCode = value;
    }

    /**
     * Gets the value of the postTlxChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPostTlxChg() {
        return postTlxChg;
    }

    /**
     * Sets the value of the postTlxChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPostTlxChg(BigDecimal value) {
        this.postTlxChg = value;
    }

    /**
     * Gets the value of the exchRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExchRate() {
        return exchRate;
    }

    /**
     * Sets the value of the exchRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExchRate(BigDecimal value) {
        this.exchRate = value;
    }

    /**
     * Gets the value of the benfBankPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenfBankPartyId() {
        return benfBankPartyId;
    }

    /**
     * Sets the value of the benfBankPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenfBankPartyId(String value) {
        this.benfBankPartyId = value;
    }

    /**
     * Gets the value of the chgPayType property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChgPayType() {
        return chgPayType;
    }

    /**
     * Sets the value of the chgPayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChgPayType(BigDecimal value) {
        this.chgPayType = value;
    }

    /**
     * Gets the value of the ordCustNameAdd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdCustNameAdd() {
        return ordCustNameAdd;
    }

    /**
     * Sets the value of the ordCustNameAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdCustNameAdd(String value) {
        this.ordCustNameAdd = value;
    }

    /**
     * Gets the value of the drIntDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrIntDate() {
        return drIntDate;
    }

    /**
     * Sets the value of the drIntDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrIntDate(String value) {
        this.drIntDate = value;
    }

    /**
     * Gets the value of the centComChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCentComChg() {
        return centComChg;
    }

    /**
     * Sets the value of the centComChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCentComChg(BigDecimal value) {
        this.centComChg = value;
    }

    /**
     * Gets the value of the exch property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExch() {
        return exch;
    }

    /**
     * Sets the value of the exch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExch(BigDecimal value) {
        this.exch = value;
    }

    /**
     * Gets the value of the vatChg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVatChg() {
        return vatChg;
    }

    /**
     * Sets the value of the vatChg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVatChg(BigDecimal value) {
        this.vatChg = value;
    }

}
