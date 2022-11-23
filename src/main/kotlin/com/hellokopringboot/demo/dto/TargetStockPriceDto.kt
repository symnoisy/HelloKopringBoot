package com.hellokopringboot.demo.dto

data class TargetStockPriceDto (
     val meta: MetaDto,
     val timestamp: List<Long>,
     val indicators: IndicatorsDto,
     val adjclose: List<AdjCloseDto>
        )