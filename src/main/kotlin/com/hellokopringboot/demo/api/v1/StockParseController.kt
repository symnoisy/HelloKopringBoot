package com.hellokopringboot.demo.api.v1

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@Tag(name="Stock Data Parse Controller")
@RestController
@RequestMapping("/v1/stock")
class StockParseController {

    @GetMapping("{ticker}.KS")
    fun getStockInfoList(
        @PathVariable(name = "ticker") ticker: Long,
        @RequestParam("interval", defaultValue = "5") interval: Int,
        @RequestParam("range", defaultValue = "5") range: Int,
    ): String {
        val helloWorld = "Hello World"

        return helloWorld
    }

}
