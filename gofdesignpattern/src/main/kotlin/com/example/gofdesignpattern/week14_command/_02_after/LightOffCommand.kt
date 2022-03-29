package com.example.gofdesignpattern.week14_command._02_after

import com.example.gofdesignpattern.week14_command._01_before.Light

class LightOffCommand(
    private val light: Light
) : Command {
    override fun execute() {
        light.off()
    }

    override fun undo() {
        LightOnCommand(light).execute()
    }
}
