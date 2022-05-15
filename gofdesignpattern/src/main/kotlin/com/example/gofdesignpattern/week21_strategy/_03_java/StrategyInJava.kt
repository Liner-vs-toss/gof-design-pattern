package com.example.gofdesignpattern.week21_strategy._03_java

import java.util.Collections

fun main() {
    val numbers = listOf<Int>(10, 5)

    println(numbers)

    Collections.sort(numbers, object : Comparator<Int> {
        override fun compare(o1: Int, o2: Int): Int {
            return o1 - o2
        }
    })

    println(numbers)
}