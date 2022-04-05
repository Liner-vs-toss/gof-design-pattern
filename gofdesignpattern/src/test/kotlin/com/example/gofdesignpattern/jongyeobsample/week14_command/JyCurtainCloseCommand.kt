package com.example.gofdesignpattern.jongyeobsample.week14_command

class JyCurtainCloseCommand(
    private val curtain: JyCurtain
): JyCommand {
    override fun execute() {
        curtain.close()
    }
}
