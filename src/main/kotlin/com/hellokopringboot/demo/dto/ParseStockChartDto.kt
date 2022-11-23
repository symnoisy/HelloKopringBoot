package com.hellokopringboot.demo.dto

data class ParseStockChartDto<T> (
        val chart: Collection<T>
        )