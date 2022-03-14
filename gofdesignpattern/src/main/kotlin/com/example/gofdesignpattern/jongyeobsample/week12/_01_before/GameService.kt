package com.example.gofdesignpattern.jongyeobsample.week12._01_before

open class GameService {
    open fun startGame() {
        Thread.sleep(1000L)
        println("이 자리에 오신 여러분들을 환영합니다.")
    }
}
