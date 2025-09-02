package com.example.cbspaymentsimulator.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class E07Cot01JsonRequest {
    private BigDecimal iTraType;
    private BigDecimal iSysSourceCode;
    private BigDecimal iSouCode;
    private String iTraDate;
    private BigDecimal reqLanInd_inout;
    private BigDecimal inpChannelId_inout;
    private String inpChannelRefNum_inout;
}

