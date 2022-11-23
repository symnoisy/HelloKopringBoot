package com.hellokopringboot.demo.dto

data class QuoteValueDto (
        val low: List<Long>,
        val high: List<Long>,
        val volume: List<Long>,
        val close: List<Long>,
        val open: List<Long>
)