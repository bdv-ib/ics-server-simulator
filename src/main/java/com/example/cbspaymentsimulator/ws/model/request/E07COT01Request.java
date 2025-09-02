package com.example.cbspaymentsimulator.ws.model.request;

import jakarta.xml.bind.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "E07COT01Request")
@XmlType(
        name = "E07COT01Request",
        propOrder = {
                "iTraType",
                "iSysSourceCode",
                "iSouCode",
                "iTraDate",
                "reqLanInd_inout",
                "inpChannelId_inout",
                "inpChannelRefNum_inout"
        }
)
public class E07COT01Request {

    @XmlElement(nillable = true)
    private BigDecimal iTraType;

    @XmlElement(nillable = true)
    private BigDecimal iSysSourceCode;

    @XmlElement(nillable = true)
    private BigDecimal iSouCode;

    @XmlElement(nillable = true)
    private String iTraDate;

    @XmlElement(nillable = true)
    private BigDecimal reqLanInd_inout;

    @XmlElement(nillable = true)
    private BigDecimal inpChannelId_inout;

    @XmlElement(nillable = true)
    private String inpChannelRefNum_inout;
}
