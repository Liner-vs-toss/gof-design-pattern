package com.example.gofdesignpattern.week14_command._02_after

import com.example.gofdesignpattern.week14_command._01_before.Game

class GameStartCommand(
    private val game: Game
): Command {
    override fun execute() {
        game.start()
    }

    override fun undo() {
        GameEndCommand(game).execute()
    }
}
