package com.diximonline.cbspaymentsimulator.acxf.services;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.diximonline.cbspaymentsimulator.acxf.interfaces.BanksMiddlewarePE07COT00;
import com.diximonline.cbspaymentsimulator.acxf.types.ObjAchOtrfUserArray;
import com.diximonline.cbspaymentsimulator.acxf.types.ObjectFactory;

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
public class BanksMiddlewarePE07COT00Impl implements BanksMiddlewarePE07COT00 {

	@Override
	public void e07cot01(
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
		log.debug("[START] e07cot01 iTraType={}, iSysSourceCode={}, iSouCode={}, iTraDate={}",
				iTraType, iSysSourceCode, iSouCode, iTraDate);

		// INOUT нормализуем
		if (reqLanIndInout.value == null) reqLanIndInout.value = BigDecimal.ONE;
		if (inpChannelIdInout.value == null) inpChannelIdInout.value = BigDecimal.ONE;
		if (inpChannelRefNumInout.value == null || inpChannelRefNumInout.value.isBlank())
			inpChannelRefNumInout.value = "AUTO-" + UUID.randomUUID();

		// === OUT allAchTra_out ===
		if (allAchTraOut == null) {
			allAchTraOut = new Holder<>(new ObjAchOtrfUserArray());
		} else if (allAchTraOut.value == null) {
			allAchTraOut.value = new ObjAchOtrfUserArray();
		}

		// создаём тестовый объект и заполняем несколько обязательных полей
		var user = new com.diximonline.cbspaymentsimulator.acxf.types.ObjAchOtrfUser();
		user.setTraType(BigDecimal.ONE);
		user.setSourceCode(BigDecimal.ONE);
		user.setTraDate(iTraDate != null ? iTraDate : "2025-10-24");
		user.setTraAmt(BigDecimal.valueOf(1000));
		user.setRemitInfo("TEST TRANSFER SUCCESS");

		// добавляем в список (getObjAchOtrfUser() гарантированно не null)
		allAchTraOut.value.getObjAchOtrfUser().add(user);

		// остальные OUT
		if (outReqIdOut.value == null) outReqIdOut.value = UUID.randomUUID().toString();
		if (outStatusOut.value == null) outStatusOut.value = BigDecimal.ZERO;
		if (outMsgTxtOut.value == null) outMsgTxtOut.value = "SUCCESS";
		if (outProcDataOut.value == null) outProcDataOut.value = "";
		if (outDetInfoOut.value == null) outDetInfoOut.value = "";
		if (dbAppErrOut.value == null) dbAppErrOut.value = BigDecimal.ZERO;

		log.debug("[END] e07cot01 outReqId={}, status={}, msg={}",
				outReqIdOut.value, outStatusOut.value, outMsgTxtOut.value);
	}


	@Override
	public void e07cot02(
			BigDecimal iBraCode,
			BigDecimal iRefType,
			BigDecimal iRefYear,
			BigDecimal iRefNum,
			BigDecimal iSouCode,
			Holder<BigDecimal> reqLanIndInout,
			Holder<BigDecimal> inpChannelIdInout,
			Holder<String>     inpChannelRefNumInout,
			Holder<String>     outReqIdOut,
			Holder<BigDecimal> outStatusOut,
			Holder<String>     outMsgTxtOut,
			Holder<String>     outProcDataOut,
			Holder<String>     outDetInfoOut,
			Holder<BigDecimal> dbAppErrOut
	) {
		log.debug("[START] e07cot02 bra={}, refType={}, year={}, refNum={}, sou={}",
				iBraCode, iRefType, iRefYear, iRefNum, iSouCode);

		// INOUT — нормализуем
		if (reqLanIndInout.value == null)    reqLanIndInout.value = BigDecimal.ONE;
		if (inpChannelIdInout.value == null) inpChannelIdInout.value = BigDecimal.ONE;
		if (inpChannelRefNumInout.value == null || inpChannelRefNumInout.value.isBlank())
			inpChannelRefNumInout.value = "AUTO-" + UUID.randomUUID();

		// OUT — никаких null
		if (outReqIdOut.value == null)    outReqIdOut.value    = UUID.randomUUID().toString();
		if (outStatusOut.value == null)   outStatusOut.value   = BigDecimal.ZERO;
		if (outMsgTxtOut.value == null)   outMsgTxtOut.value   = "";
		if (outProcDataOut.value == null) outProcDataOut.value = "";
		if (outDetInfoOut.value == null)  outDetInfoOut.value  = "";
		if (dbAppErrOut.value == null)    dbAppErrOut.value    = BigDecimal.ZERO;

		log.debug("[END]  e07cot02 outReqId={}, status={}, msg={}",
				outReqIdOut.value, outStatusOut.value, outMsgTxtOut.value);
	}
}
