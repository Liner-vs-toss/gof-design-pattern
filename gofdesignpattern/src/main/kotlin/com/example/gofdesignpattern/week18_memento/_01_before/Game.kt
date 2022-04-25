package com.example.gofdesignpattern.week18_memento._01_before

import java.io.Serializable

data class Game(
    var redTeamScore: Int,
    var blueTeamScore: Int,
) : Serializable
