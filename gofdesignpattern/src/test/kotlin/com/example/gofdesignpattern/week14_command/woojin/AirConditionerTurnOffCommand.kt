package com.example.gofdesignpattern.week14_command.woojin

class AirConditionerTurnOffCommand(
    val airConditioner: AirConditioner
): Command {
    override fun execute() {
        airConditioner.turnOff()
    }
}
