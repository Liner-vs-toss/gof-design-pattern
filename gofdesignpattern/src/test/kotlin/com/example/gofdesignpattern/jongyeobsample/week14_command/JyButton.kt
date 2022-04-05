package com.example.gofdesignpattern.jongyeobsample.week14_command

/**
 * invoker
 */
class JyButton {
    fun press(command: JyCommand) {
        command.execute()
    }
}
