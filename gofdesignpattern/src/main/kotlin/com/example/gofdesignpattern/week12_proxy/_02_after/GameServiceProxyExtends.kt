package com.example.gofdesignpattern.week12_proxy._02_after

import com.example.gofdesignpattern.week12_proxy._01_before.GameService

// 코드 수정이 어려운 경우 상속을 활용하는 방식
class GameServiceProxyExtends : GameService() {

    override fun startGame() {
        val startTime = System.currentTimeMillis()
        super.startGame()
        val endTime = System.currentTimeMillis()
        println("걸린 시간: ${endTime - startTime}")
    }
}
