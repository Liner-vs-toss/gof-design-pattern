package com.example.gofdesignpattern.week14_command._02_after

import com.example.gofdesignpattern.week14_command._01_before.Game

class GameEndCommand(
    private val game: Game
): Command {
    override fun execute() {
        game.end()
    }

    override fun undo() {
        GameStartCommand(game).execute()
    }
}
