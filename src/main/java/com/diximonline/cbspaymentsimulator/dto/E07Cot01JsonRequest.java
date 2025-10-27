package com.diximonline.cbspaymentsimulator.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class E07Cot01JsonRequest {

    @JsonProperty("iTraType")
    private BigDecimal iTraType;

    @JsonProperty("iSysSourceCode")
    private BigDecimal iSysSourceCode;

    @JsonProperty("iSouCode")
    private BigDecimal iSouCode;

    @JsonProperty("iTraDate")
    private String iTraDate;

    @JsonProperty("reqLanInd_inout")
    private BigDecimal reqLanInd_inout;

    @JsonProperty("inpChannelId_inout")
    private BigDecimal inpChannelId_inout;

    @JsonProperty("inpChannelRefNum_inout")
    private String inpChannelRefNum_inout;
}
