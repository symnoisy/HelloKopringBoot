package com.hellokopringboot.demo.api.v1

import com.fasterxml.jackson.module.kotlin.jsonMapper
import io.swagger.v3.core.util.Json
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse


@Tag(name="Stock Data Parse Controller")
@RestController
@RequestMapping("/v1/stock")
class StockParseController {

    @PostMapping("")
    fun getStockInfoList(
        @RequestParam("ticker", defaultValue = "005930.KS") ticker: String,
        @RequestParam("interval", defaultValue = "1d") interval: String,
        @RequestParam("range", defaultValue = "5d") range: String,
    ): String? {
        // YahooFinance Documentation: https://syncwith.com/yahoo-finance/yahoo-finance-api

        val client = HttpClient.newBuilder().build()
        val yahooFinanceURI = "https://query1.finance.yahoo.com/v8/finance/chart/$ticker?interval=$interval&range=$range"
        val request = HttpRequest.newBuilder().uri(URI.create(yahooFinanceURI)).build()
        val responseBody = client.send(request, HttpResponse.BodyHandlers.ofString()).body()

        return responseBody
    }

}
