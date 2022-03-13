package com.example.gofdesignpattern.week12_proxy._02_after

data class GameServiceProxy(
    private val gameService: GameService
): GameService {
    override fun startGame() {
        val startTime = System.currentTimeMillis()
        gameService.startGame()
        val endTime = System.currentTimeMillis()
        println("걸린 시간: ${endTime - startTime}")
    }
}
