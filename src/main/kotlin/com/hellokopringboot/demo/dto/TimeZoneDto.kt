package com.hellokopringboot.demo.dto

data class TimeZoneDto (
        val timezone: String,
        val end: Long,
        val start: Long,
        val gmtoffset: Long
        )