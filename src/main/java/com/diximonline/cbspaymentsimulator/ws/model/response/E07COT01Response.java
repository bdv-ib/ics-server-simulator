package com.diximonline.cbspaymentsimulator.ws.model.response;

import com.diximonline.cbspaymentsimulator.ws.model.types.ObjAchOtrfUserOld;
import jakarta.xml.bind.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "E07COT01Response")
@XmlType(
        name = "E07COT01Response",
        propOrder = {
                "reqLanInd_inout",
                "inpChannelId_inout",
                "inpChannelRefNum_inout",
                "allAchTra_out",
                "outReqId_out",
                "outStatus_out",
                "outMsgTxt_out",
                "outProcData_out",
                "outDetInfo_out",
                "dbAppErr_out"
        }
)
public class E07COT01Response {

    @XmlElement(nillable = true)
    public BigDecimal reqLanInd_inout;

    @XmlElement(nillable = true)
    public BigDecimal inpChannelId_inout;

    @XmlElement(nillable = true)
    public String inpChannelRefNum_inout;

    @XmlElementWrapper(name = "allAchTra_out", nillable = true)
    @XmlElement(name = "ObjAchOtrfUser", nillable = true)
    public List<com.diximonline.cbspaymentsimulator.acxf.types.ObjAchOtrfUser> allAchTra_out;

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
