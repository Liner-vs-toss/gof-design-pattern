package com.example.gofdesignpattern.jongyeobsample.week12._02_after

fun main() {
    val gameService: GameServiceInterface = GameServiceProxy(DefaultGameService())
    gameService.startGame()
}
