package com.example.gofdesignpattern.week12_proxy._02_after

fun main() {
    val gameService = GameServiceProxyLazy(null)

    gameService.startGame()
}
