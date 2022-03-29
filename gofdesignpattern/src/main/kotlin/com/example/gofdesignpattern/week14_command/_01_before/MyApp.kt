package com.example.gofdesignpattern.week14_command._01_before

class MyApp(
    private val game: Game
) {
    fun press() {
        game.start()
    }
}

fun main() {
    val myApp = MyApp(Game())
    myApp.press()
    myApp.press()
}
