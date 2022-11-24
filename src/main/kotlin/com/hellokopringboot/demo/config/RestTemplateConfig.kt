package com.hellokopringboot.demo.config

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RestTemplateConfig {

    @Bean
    fun restTemplate(
        builder: RestTemplateBuilder
    ) = builder.build()
}
