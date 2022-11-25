package com.hellokopringboot.demo.api.v1

import com.hellokopringboot.demo.dto.ResponseDataDto
import com.hellokopringboot.demo.dto.YahooFinanceDto
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject


@Tag(name="Stock Data Parse Controller")
@RestController
@RequestMapping("/v1/stock")
class StockParseController (
    private val restTemplate: RestTemplate
        ){

    @PostMapping("")
    fun getStockInfoList(
        @RequestParam("ticker", defaultValue = "005930.KS") ticker: String,
        @RequestParam("interval", defaultValue = "1d") interval: String,
        @RequestParam("range", defaultValue = "5d") range: String,
    ): ResponseDataDto {
        // YahooFinance Documentation: https://syncwith.com/yahoo-finance/yahoo-finance-api

        val yahooFinanceURI = "https://query1.finance.yahoo.com/v8/finance/chart/$ticker?interval=$interval&range=$range"
        val response = restTemplate.getForObject<YahooFinanceDto>(yahooFinanceURI)

        val timestamp = response.chart?.result?.get(0)?.timestamp
        val quote = response.chart?.result?.get(0)?.indicators?.quote

//        YahooFinanceModel().

        return ResponseDataDto(timestamp = timestamp, indicators = ResponseDataDto.Indicators(quote))
    }

}
