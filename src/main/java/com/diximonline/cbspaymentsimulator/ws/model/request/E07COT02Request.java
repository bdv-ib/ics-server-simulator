package com.diximonline.cbspaymentsimulator.ws.model.request;

import jakarta.xml.bind.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "E07COT02Request")
@XmlType(
        name = "E07COT02Request",
        propOrder = {
                "iBraCode",
                "iRefType",
                "iRefYear",
                "iRefNum",
                "iSouCode",
                "reqLanInd_inout",
                "inpChannelId_inout",
                "inpChannelRefNum_inout"
        }
)
public class E07COT02Request {

    @XmlElement(nillable = true)
    public BigDecimal iBraCode;

    @XmlElement(nillable = true)
    public BigDecimal iRefType;

    @XmlElement(nillable = true)
    public BigDecimal iRefYear;

    @XmlElement(nillable = true)
    public BigDecimal iRefNum;

    @XmlElement(nillable = true)
    public BigDecimal iSouCode;

    @XmlElement(nillable = true)
    public BigDecimal reqLanInd_inout;

    @XmlElement(nillable = true)
    public BigDecimal inpChannelId_inout;

    @XmlElement(nillable = true)
    public String inpChannelRefNum_inout;
}
