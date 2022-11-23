package com.hellokopringboot.demo.dto

import io.swagger.v3.oas.annotations.media.Schema

data class MetaDto (
    val currency: String,
    val symbol: String,
    val exchangeName: String,
    val instrumentType: String,
    val firstTradeDate: Long,
    val regularMarketTime: Long,
    val gmtoffset: Long,
    val timezone: String,
    val exchangeTimezoneName: String,
    val regularMarketPrice: Long,
    val chartPreviousClose: Long,
    val priceHint: Int,
    val currentTradingPeriod: CurrentTradingPeriodDto,
    val dataGranularity: String,
    val range: String,
    val validRanges: List<String>
)