package com.diximonline.cbspaymentsimulator.acxf.interfaces;

import java.math.BigDecimal;

import com.diximonline.cbspaymentsimulator.acxf.types.ObjAchOtrfUserArray;
import com.diximonline.cbspaymentsimulator.acxf.types.ObjectFactory;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Holder;

/**
 * BanksMiddleware_PE07COT00 — RPC/Literal
 * Сгенерёнку подчистили: *_out -> OUT, *_inout -> INOUT.
 */
@WebService(
        targetNamespace = "http://com/icsfs/banks/ws/BanksMiddleware_PE07COT00.wsdl",
        name = "BanksMiddleware_PE07COT00"
)
@XmlSeeAlso({ ObjectFactory.class })
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface BanksMiddlewarePE07COT00 {

    @WebMethod(
            operationName = "e07cot01",
            action = "http://com/icsfs/banks/ws/BanksMiddleware_PE07COT00.wsdl/e07cot01"
    )
    void e07cot01(
            // IN
            @WebParam(partName = "iTraType", name = "iTraType")
            BigDecimal iTraType,
            @WebParam(partName = "iSysSourceCode", name = "iSysSourceCode")
            BigDecimal iSysSourceCode,
            @WebParam(partName = "iSouCode", name = "iSouCode")
            BigDecimal iSouCode,
            @WebParam(partName = "iTraDate", name = "iTraDate")
            String iTraDate,

            // INOUT
            @WebParam(partName = "reqLanInd_inout", name = "reqLanInd_inout", mode = WebParam.Mode.INOUT)
            Holder<BigDecimal> reqLanIndInout,
            @WebParam(partName = "inpChannelId_inout", name = "inpChannelId_inout", mode = WebParam.Mode.INOUT)
            Holder<BigDecimal> inpChannelIdInout,
            @WebParam(partName = "inpChannelRefNum_inout", name = "inpChannelRefNum_inout", mode = WebParam.Mode.INOUT)
            Holder<String> inpChannelRefNumInout,

            // OUT
            @WebParam(partName = "allAchTra_out", name = "allAchTra_out", mode = WebParam.Mode.OUT)
            Holder<ObjAchOtrfUserArray> allAchTraOut,
            @WebParam(partName = "outReqId_out", name = "outReqId_out", mode = WebParam.Mode.OUT)
            Holder<String> outReqIdOut,
            @WebParam(partName = "outStatus_out", name = "outStatus_out", mode = WebParam.Mode.OUT)
            Holder<BigDecimal> outStatusOut,
            @WebParam(partName = "outMsgTxt_out", name = "outMsgTxt_out", mode = WebParam.Mode.OUT)
            Holder<String> outMsgTxtOut,
            @WebParam(partName = "outProcData_out", name = "outProcData_out", mode = WebParam.Mode.OUT)
            Holder<String> outProcDataOut,
            @WebParam(partName = "outDetInfo_out", name = "outDetInfo_out", mode = WebParam.Mode.OUT)
            Holder<String> outDetInfoOut,
            @WebParam(partName = "dbAppErr_out", name = "dbAppErr_out", mode = WebParam.Mode.OUT)
            Holder<BigDecimal> dbAppErrOut
    );

    @WebMethod(
            operationName = "e07cot02",
            action = "http://com/icsfs/banks/ws/BanksMiddleware_PE07COT00.wsdl/e07cot02"
    )
    void e07cot02(
            // IN
            @WebParam(partName = "iBraCode", name = "iBraCode")
            BigDecimal iBraCode,
            @WebParam(partName = "iRefType", name = "iRefType")
            BigDecimal iRefType,
            @WebParam(partName = "iRefYear", name = "iRefYear")
            BigDecimal iRefYear,
            @WebParam(partName = "iRefNum", name = "iRefNum")
            BigDecimal iRefNum,
            @WebParam(partName = "iSouCode", name = "iSouCode")
            BigDecimal iSouCode,

            // INOUT
            @WebParam(partName = "reqLanInd_inout", name = "reqLanInd_inout", mode = WebParam.Mode.INOUT)
            Holder<BigDecimal> reqLanIndInout,
            @WebParam(partName = "inpChannelId_inout", name = "inpChannelId_inout", mode = WebParam.Mode.INOUT)
            Holder<BigDecimal> inpChannelIdInout,
            @WebParam(partName = "inpChannelRefNum_inout", name = "inpChannelRefNum_inout", mode = WebParam.Mode.INOUT)
            Holder<String> inpChannelRefNumInout,

            // OUT
            @WebParam(partName = "outReqId_out", name = "outReqId_out", mode = WebParam.Mode.OUT)
            Holder<String> outReqIdOut,
            @WebParam(partName = "outStatus_out", name = "outStatus_out", mode = WebParam.Mode.OUT)
            Holder<BigDecimal> outStatusOut,
            @WebParam(partName = "outMsgTxt_out", name = "outMsgTxt_out", mode = WebParam.Mode.OUT)
            Holder<String> outMsgTxtOut,
            @WebParam(partName = "outProcData_out", name = "outProcData_out", mode = WebParam.Mode.OUT)
            Holder<String> outProcDataOut,
            @WebParam(partName = "outDetInfo_out", name = "outDetInfo_out", mode = WebParam.Mode.OUT)
            Holder<String> outDetInfoOut,
            @WebParam(partName = "dbAppErr_out", name = "dbAppErr_out", mode = WebParam.Mode.OUT)
            Holder<BigDecimal> dbAppErrOut
    );
}
