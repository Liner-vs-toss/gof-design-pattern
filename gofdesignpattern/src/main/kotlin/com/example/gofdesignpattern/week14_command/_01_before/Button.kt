package com.example.gofdesignpattern.week14_command._01_before

class Button(
    private val light: Light
) {
    fun press() {
        light.on()
    }
}

fun main() {
    val button = Button(Light())
    button.press()
    button.press()
}
