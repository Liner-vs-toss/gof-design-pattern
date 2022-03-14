package com.example.gofdesignpattern.week12_proxy._03_java

fun interface TempService {

    operator fun invoke()

    open class Default(): TempService {
        override fun invoke() {
            println("hello")
        }

    }
}
