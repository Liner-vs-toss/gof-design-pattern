package com.example.gofdesignpattern.week14_command.woojin

class CurtainCloseCommand(
    val curtain: Curtain
): Command {
    override fun execute() {
        curtain.close()
    }
}
