package com.example.gofdesignpattern.week12_proxy._01_before

import java.lang.Thread.sleep

open class GameService {

    open fun startGame() {
        sleep(1000L)
        println("이 자리에 오신 여러분을 진심으로 환영합니다.")
    }
}
