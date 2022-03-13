package com.example.gofdesignpattern.week12_proxy._02_after

data class GameServiceProxyLazy(
    private var gameService: GameService?
): GameService {
    init {
        if (gameService == null) {
            gameService = DefaultGameService()
        }
    }

    override fun startGame() {
        val startTime = System.currentTimeMillis()
        gameService?.startGame()
        val endTime = System.currentTimeMillis()
        println("걸린 시간: ${endTime - startTime}")
    }
}
