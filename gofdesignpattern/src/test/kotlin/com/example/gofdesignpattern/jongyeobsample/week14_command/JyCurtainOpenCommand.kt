package com.example.gofdesignpattern.jongyeobsample.week14_command

class JyCurtainOpenCommand(
    private val curtain: JyCurtain
): JyCommand {
    override fun execute() {
        curtain.open()
    }
}
