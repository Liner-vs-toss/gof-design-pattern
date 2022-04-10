package com.example.gofdesignpattern.week14_command.woojin

class CurtainOpenCommand(
    val curtain: Curtain
): Command {
    override fun execute() {
        curtain.open()
    }
}
