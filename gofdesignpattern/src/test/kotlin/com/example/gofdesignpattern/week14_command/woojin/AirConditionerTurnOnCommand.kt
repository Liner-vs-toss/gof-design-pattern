package com.example.gofdesignpattern.week14_command.woojin

class AirConditionerTurnOnCommand(
    val airConditioner: AirConditioner
): Command {
    override fun execute() {
        airConditioner.turnOn()
    }
}
