package com.diximonline.cbspaymentsimulator.converter;

import com.diximonline.cbspaymentsimulator.dto.E07Cot01JsonRequest;
import com.diximonline.cbspaymentsimulator.dto.E07Cot02JsonRequest;
import com.diximonline.cbspaymentsimulator.ws.model.request.E07COT01Request;
import com.diximonline.cbspaymentsimulator.ws.model.request.E07COT02Request;
import com.diximonline.cbspaymentsimulator.ws.model.response.E07COT01Response;
import com.diximonline.cbspaymentsimulator.ws.model.response.E07COT02Response;

import java.math.BigDecimal;

public class E07CotConverter {

    public static E07COT01Request toSoapRequest(E07Cot01JsonRequest dto) {
        E07COT01Request soap = new E07COT01Request();
        soap.setITraType(dto.getITraType());
        soap.setISysSourceCode(dto.getISysSourceCode());
        soap.setISouCode(dto.getISouCode());
        soap.setITraDate(dto.getITraDate());
        soap.setReqLanInd_inout(dto.getReqLanInd_inout());
        soap.setInpChannelId_inout(dto.getInpChannelId_inout());
        soap.setInpChannelRefNum_inout(dto.getInpChannelRefNum_inout());
        return soap;
    }

    public static E07COT02Request toSoapRequest(E07Cot02JsonRequest dto) {
        E07COT02Request soap = new E07COT02Request();
        soap.setIBraCode(dto.getIBraCode());
        soap.setIRefType(dto.getIRefType());
        soap.setIRefYear(dto.getIRefYear());
        soap.setIRefNum(dto.getIRefNum());
        soap.setISouCode(dto.getISouCode());
        soap.setReqLanInd_inout(dto.getReqLanInd_inout());
        soap.setInpChannelId_inout(dto.getInpChannelId_inout());
        soap.setInpChannelRefNum_inout(dto.getInpChannelRefNum_inout());
        return soap;
    }

    public static E07COT01Response toSoapResponse(E07Cot01JsonRequest dto) {
        E07COT01Response response = new E07COT01Response();

        response.setReqLanInd_inout(dto.getReqLanInd_inout());
        response.setInpChannelId_inout(dto.getInpChannelId_inout());
        response.setInpChannelRefNum_inout(dto.getInpChannelRefNum_inout());

        // Мокаем остальные поля (если нужно)
        response.setOutStatus_out(BigDecimal.ONE); // например: 1 = OK
        response.setOutMsgTxt_out("Success");
        response.setOutReqId_out("RESP-" + dto.getInpChannelRefNum_inout());

        return response;
    }

    public static E07COT02Response toSoapResponse(E07Cot02JsonRequest dto) {
        E07COT02Response response = new E07COT02Response();

        response.setReqLanInd_inout(dto.getReqLanInd_inout());
        response.setInpChannelId_inout(dto.getInpChannelId_inout());
        response.setInpChannelRefNum_inout(dto.getInpChannelRefNum_inout());

        // Пример моков
        response.setOutStatus_out(BigDecimal.ONE);
        response.setOutMsgTxt_out("Success");
        response.setOutReqId_out("RESP-" + dto.getInpChannelRefNum_inout());

        return response;
    }
}