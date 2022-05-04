package com.example.gofdesignpattern.week19_observer._02_after

/**
 * Observer 인터페이스
 */
interface Subscriber {
    val name: String
    fun handleMessage(message: String)
}
