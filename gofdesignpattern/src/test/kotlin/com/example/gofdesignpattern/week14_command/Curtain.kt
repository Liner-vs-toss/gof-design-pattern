package com.example.gofdesignpattern.week14_command

/**
 * receiver
 */
class Curtain {
    fun close() {
        println("커튼을 친다.")
    }

    fun open() {
        println("커튼을 걷다.")
    }
}
