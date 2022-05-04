package com.example.gofdesignpattern.week19_observer._02_after

/**
 * Observer 구현체
 */
class User(override val name: String) : Subscriber {
    override fun handleMessage(message: String) {
        println(message)
    }
}
