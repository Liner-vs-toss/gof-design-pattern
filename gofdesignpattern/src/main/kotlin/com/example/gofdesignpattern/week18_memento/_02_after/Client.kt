package com.example.gofdesignpattern.week18_memento._02_after

fun main() {

    val game: Game = Game(10, 20)
    val blueTeamScore: Int = game.blueTeamScore
    val redTeamScore: Int = game.redTeamScore
    println("blue : ${game.blueTeamScore}, red : ${game.redTeamScore}")

    val restoredGame: GameSave = game.save()
    game.blueTeamScore = 21
    game.redTeamScore = 11
    println("blue : ${game.blueTeamScore}, red : ${game.redTeamScore}")

    game.restore(restoredGame)
    println("blue : ${game.blueTeamScore}, red : ${game.redTeamScore}")
}
