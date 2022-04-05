package com.example.gofdesignpattern.jongyeobsample.week14_command

class JyAirConditionerOnCommand(
    private val airConditioner: JyAirConditioner
): JyCommand {
    override fun execute() {
        airConditioner.turnOn()
    }
}
