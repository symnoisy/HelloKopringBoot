package com.hellokopringboot.demo.dto


data class ResponseDataDto(
    val timestamp: List<Int?>?,
    val indicators: Indicators
) {
    data class Indicators(
        val quote: List<YahooFinanceDto.Chart.Result.Indicators.Quote?>?
    )
}