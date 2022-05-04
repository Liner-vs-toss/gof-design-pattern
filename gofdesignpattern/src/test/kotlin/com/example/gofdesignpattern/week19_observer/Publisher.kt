package com.example.gofdesignpattern.week19_observer

/**
 * Subject 인터페이스
 */
interface Publisher {
    val subscribers: MutableMap<Topic, MutableList<Subscriber>>

    fun subscribe(topic: Topic, subscriber: Subscriber)
    fun unsubscribe(topic: Topic, subscriber: Subscriber)
    fun publish(topic: Topic)
}

enum class Topic {
    토스_소식,
    토스_신규기능_알림
}
