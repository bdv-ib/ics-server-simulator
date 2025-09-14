package com.diximonline.cbspaymentsimulator.acxf.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.diximonline.cbspaymentsimulator.acxf.interfaces.BanksMiddlewarePE07COT00;
import com.diximonline.cbspaymentsimulator.acxf.types.ObjAchOtrfUserArray;

import jakarta.jws.WebService;
import jakarta.xml.ws.Holder;
import lombok.extern.slf4j.Slf4j;

@WebService(
	serviceName = "BanksMiddleware_PE07COT00",
	portName = "BanksMiddleware_PE07COT00Port",
	endpointInterface = "com.diximonline.cbspaymentsimulator.acxf.interfaces.BanksMiddlewarePE07COT00",
	targetNamespace = "http://com/icsfs/banks/ws/BanksMiddleware_PE07COT00.wsdl"
)
@Service
@Slf4j
public class  BanksMiddlewarePE07COT00Impl implements BanksMiddlewarePE07COT00 {

    @Override
    public void e07Cot01(
    	BigDecimal iTraType,
    	BigDecimal iSysSourceCode,
    	BigDecimal iSouCode,
        String iTraDate,
        Holder<BigDecimal> reqLanIndInout,
        Holder<BigDecimal> inpChannelIdInout,
        Holder<String> inpChannelRefNumInout,
        Holder<ObjAchOtrfUserArray> allAchTraOut,
        Holder<String> outReqIdOut,
        Holder<BigDecimal> outStatusOut,
        Holder<String> outMsgTxtOut,
        Holder<String> outProcDataOut,
        Holder<String> outDetInfoOut,
        Holder<BigDecimal> dbAppErrOut
    ) {
    	log.debug("[START] Received e07Cot01 call");
    	
    	log.debug("[END] Processed e07Cot01 call");
    }

    @Override
    public void e07Cot02(

        BigDecimal iBraCode,
        BigDecimal iRefType,
        BigDecimal iRefYear,
        BigDecimal iRefNum,
        BigDecimal iSouCode,
        Holder<BigDecimal> reqLanIndInout,
        Holder<BigDecimal> inpChannelIdInout,
        Holder<String> inpChannelRefNumInout,
        Holder<String> outReqIdOut,
        Holder<BigDecimal> outStatusOut,
        Holder<String> outMsgTxtOut,
        Holder<String> outProcDataOut,
        Holder<String> outDetInfoOut,
        Holder<BigDecimal> dbAppErrOut
    ) {
    	log.debug("[START] Received e07Cot02 call");
    	
    	log.debug("[END] Processed e07Cot02 call");
    }
}
