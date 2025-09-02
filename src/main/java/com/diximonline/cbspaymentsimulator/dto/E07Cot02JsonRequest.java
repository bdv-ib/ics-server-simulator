package com.diximonline.cbspaymentsimulator.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class E07Cot02JsonRequest {

    private BigDecimal iBraCode;
    private BigDecimal iRefType;
    private BigDecimal iRefYear;
    private BigDecimal iRefNum;
    private BigDecimal iSouCode;
    private BigDecimal reqLanInd_inout;
    private BigDecimal inpChannelId_inout;
    private String inpChannelRefNum_inout;
}