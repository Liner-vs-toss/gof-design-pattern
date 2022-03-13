package com.example.gofdesignpattern.week12_proxy._03_java

import org.springframework.stereotype.Service

@Service
class GameService {
    fun startGame() {
        println("이 자리에 오신 여러분을 진심으로 환영합니다.")
    }
}
