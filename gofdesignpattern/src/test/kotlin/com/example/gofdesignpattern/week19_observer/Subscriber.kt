package com.example.gofdesignpattern.week19_observer

/**
 * 옵저버 인터페이스
 */
interface Subscriber {
    val email: String

    fun sendMessage(message: String)
}
