package com.example.gofdesignpattern.week18_memento._01_before

fun main() {

    val game: Game = Game(10, 20)

    // snapshot
    val blueTeamScore: Int = game.blueTeamScore
    val redTeamScore: Int = game.redTeamScore

    // restore
    game.blueTeamScore = blueTeamScore
    game.redTeamScore = redTeamScore
    var restoredGame: Game = game
}
