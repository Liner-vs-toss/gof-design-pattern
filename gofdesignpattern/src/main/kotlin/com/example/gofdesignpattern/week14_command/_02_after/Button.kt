package com.example.gofdesignpattern.week14_command._02_after

import com.example.gofdesignpattern.week14_command._01_before.Game
import com.example.gofdesignpattern.week14_command._01_before.Light
import java.util.Stack

class Button {
    private val commands: Stack<Command> = Stack()

    fun press(command: Command) {
        command.execute()
        commands.push(command)
    }

    fun undo() {
        if (commands.isNotEmpty()) {
            val command = commands.pop()
            command.undo()
        }
    }
}

fun main() {
    val button = Button()
    button.press(LightOnCommand(Light()))
    button.press(GameStartCommand(Game()))
    button.undo()
    button.undo()
}
