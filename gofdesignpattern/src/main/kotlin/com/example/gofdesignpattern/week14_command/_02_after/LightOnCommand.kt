package com.example.gofdesignpattern.week14_command._02_after

import com.example.gofdesignpattern.week14_command._01_before.Light

class LightOnCommand(
    private val light: Light
) : Command {
    override fun execute() {
        light.on()
    }

    override fun undo() {
        LightOffCommand(light).execute()
    }
}
