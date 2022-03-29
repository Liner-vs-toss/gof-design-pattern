package com.example.gofdesignpattern.week14_command._02_after

import com.example.gofdesignpattern.week14_command._01_before.Game

class MyApp(
    private val command: Command
) {
    fun press() {
        command.execute()
    }
}

fun main() {
    val myApp = MyApp(GameStartCommand(Game()))
    myApp.press()
}
