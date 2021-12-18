package com.example.gofdesignpattern.week04_builder.`03_java`

import org.springframework.web.util.UriComponents
import org.springframework.web.util.UriComponentsBuilder

fun main() {
    val uriComponents: UriComponents = UriComponentsBuilder.newInstance()
        .scheme("https")
        .host("toss.im")
        .path("login")
        .build()

    println(uriComponents)
}
