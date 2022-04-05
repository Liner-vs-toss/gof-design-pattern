package com.example.gofdesignpattern.jongyeobsample.week14_command

class JyAirConditionerOffCommand(
    private val airConditioner: JyAirConditioner
): JyCommand {
    override fun execute() {
        airConditioner.turnOff()
    }
}
