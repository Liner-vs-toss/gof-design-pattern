package com.example.gofdesignpattern.jongyeobsample.week11_flyweight

class JyMessageTemplate(
    val title: String,
    val message: String,
) {
    init {
        Thread.sleep(10L)
    }
}
