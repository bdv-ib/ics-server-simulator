package com.diximonline.cbspaymentsimulator.ws.model.response;

import jakarta.xml.bind.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "E07COT02Response")
@XmlType(
        name = "E07COT02Response",
        propOrder = {
                "reqLanInd_inout",
                "inpChannelId_inout",
                "inpChannelRefNum_inout",
                "outReqId_out",
                "outStatus_out",
                "outMsgTxt_out",
                "outProcData_out",
                "outDetInfo_out",
                "dbAppErr_out"
        }
)
public class E07COT02Response {

    @XmlElement(nillable = true)
    public BigDecimal reqLanInd_inout;

    @XmlElement(nillable = true)
    public BigDecimal inpChannelId_inout;

    @XmlElement(nillable = true)
    public String inpChannelRefNum_inout;

    @XmlElement(nillable = true)
    public String outReqId_out;

    @XmlElement(nillable = true)
    public BigDecimal outStatus_out;

    @XmlElement(nillable = true)
    public String outMsgTxt_out;

    @XmlElement(nillable = true)
    public String outProcData_out;

    @XmlElement(nillable = true)
    public String outDetInfo_out;

    @XmlElement(nillable = true)
    public BigDecimal dbAppErr_out;
}
