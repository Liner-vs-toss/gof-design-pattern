package com.example.gofdesignpattern.week04_builder.`03_java`

import java.util.stream.Stream

fun main() {
    val names: Stream<String> = Stream.builder<String>().add("abc").add("bcd").build()

    names.forEach {
        println(it)
    }
}
