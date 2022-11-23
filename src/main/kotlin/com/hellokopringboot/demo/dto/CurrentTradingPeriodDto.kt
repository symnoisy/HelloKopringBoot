package com.hellokopringboot.demo.dto

data class CurrentTradingPeriodDto (
    val pre: TimeZoneDto,
    val regular: TimeZoneDto,
    val post: TimeZoneDto
){

}