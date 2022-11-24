package com.hellokopringboot.demo.dto



data class YahooFinanceDto(
    val chart: Chart?
) {
    data class Chart(
        val result: List<Result?>?,
        val error: Any?
    ) {
        data class Result(
            val meta: Meta?,
            val timestamp: List<Int?>?,
            val indicators: Indicators?
        ) {
            data class Meta(
                val currency: String?,
                val symbol: String?,
                val exchangeName: String?,
                val instrumentType: String?,
                val firstTradeDate: Int?,
                val regularMarketTime: Int?,
                val gmtoffset: Int?,
                val timezone: String?,
                val exchangeTimezoneName: String?,
                val regularMarketPrice: Double?,
                val chartPreviousClose: Double?,
                val priceHint: Int?,
                val currentTradingPeriod: CurrentTradingPeriod?,
                val dataGranularity: String?,
                val range: String?,
                val validRanges: List<String?>?
            ) {
                data class CurrentTradingPeriod(
                    val pre: Pre?,
                    val regular: Regular?,
                    val post: Post?
                ) {
                    data class Pre(
                        val timezone: String?,
                        val start: Int?,
                        val end: Int?,
                        val gmtoffset: Int?
                    )

                    data class Regular(
                        val timezone: String?,
                        val start: Int?,
                        val end: Int?,
                        val gmtoffset: Int?
                    )

                    data class Post(
                        val timezone: String?,
                        val start: Int?,
                        val end: Int?,
                        val gmtoffset: Int?
                    )
                }
            }

            data class Indicators(
                val quote: List<Quote?>?,
                val adjclose: List<Adjclose?>?
            ) {
                data class Quote(
                    val low: List<Double?>?,
                    val close: List<Double?>?,
                    val volume: List<Double?>?,
                    val `open`: List<Double?>?,
                    val high: List<Double?>?
                )

                data class Adjclose(
                    val adjclose: List<Double?>?
                )
            }
        }
    }
}
