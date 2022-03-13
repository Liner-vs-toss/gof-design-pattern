package com.example.gofdesignpattern.week12_proxy._02_after

class DefaultGameService : GameService{

    override fun startGame() {
        Thread.sleep(1000L)
        println("이 자리에 오신 여러분을 진심으로 환영합니다.")
    }
}
