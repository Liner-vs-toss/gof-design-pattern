package com.example.gofdesignpattern.week14_command

/**
 * invoker
 */
class Button {
    fun press(command: Command) {
        command.execute()
    }
}
