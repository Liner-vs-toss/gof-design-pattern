package com.example.gofdesignpattern.week04_builder.`03_java`

import java.lang.StringBuilder

fun main() {
    val builder = StringBuilder()
    val sample1 = builder.append("aaa").append("aaa").toString()

    val sample2 = buildString {
        append("aaa")
        append("aaa")
    }

    println(sample1 == sample2)
}
