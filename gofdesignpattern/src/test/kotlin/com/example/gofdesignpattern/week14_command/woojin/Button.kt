package com.example.gofdesignpattern.week14_command.woojin

/**
 * invoker
 */
class Button {
    fun press(command: Command) {
        command.execute()
    }
}
