package com.example.gofdesignpattern.week02_factory_method.`05_실무_적용`

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Config {
    @Bean
    fun hello(): String = "hello"
}
