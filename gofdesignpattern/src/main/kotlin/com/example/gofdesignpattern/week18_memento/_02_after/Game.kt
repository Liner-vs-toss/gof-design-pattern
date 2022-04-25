package com.example.gofdesignpattern.week18_memento._02_after

import java.io.Serializable

data class Game(
    var redTeamScore: Int,
    var blueTeamScore: Int,
) : Serializable {
    fun save(): GameSave {
        return GameSave(redTeamScore, blueTeamScore)
    }

    fun restore(saved : GameSave) {
        this.redTeamScore = saved.redTeamScore
        this.blueTeamScore = saved.blueTeamScore
    }
}
