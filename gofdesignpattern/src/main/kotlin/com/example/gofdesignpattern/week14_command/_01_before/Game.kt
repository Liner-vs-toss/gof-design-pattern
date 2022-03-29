package com.example.gofdesignpattern.week14_command._01_before

class Game{
    private var isStarted: Boolean = false

    fun start() {
        println("게임 시작.")
        isStarted = true
    }

    fun end() {
        println("게임 종료.")
        isStarted = false
    }

    fun isStarted(): Boolean = isStarted
}
