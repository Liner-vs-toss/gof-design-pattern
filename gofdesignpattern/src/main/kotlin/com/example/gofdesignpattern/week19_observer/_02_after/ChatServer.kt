package com.example.gofdesignpattern.week19_observer._02_after

/**
 * Subject class
 */
class ChatServer {
    // 주제별로 observer 목록 관리
    private val subscribers : MutableMap<String, MutableList<Subscriber>> = mutableMapOf()

    fun register(topic: String, subscriber: Subscriber) {
        println("${subscriber.name} | $topic 구독")
        if (subscribers.containsKey(topic)) {
            subscribers[topic]!!.add(subscriber)
        } else {
            // 주의. immutable collection
            subscribers[topic] = mutableListOf(subscriber)
        }
    }

    /**
     * WeakReference 를 이용해서 더 이상 참조가 없을 때 소멸되도록 할 수 있지만, 명시적으로 제거하는 것을 권장
     */
    fun unregister(topic: String, subscriber: Subscriber) {
        if (subscribers.containsKey(topic)) {
            subscribers[topic]!!.remove(subscriber)
            println("${subscriber.name} | $topic 구독 해지")
        }
    }

    fun sendMessage(subscriber: Subscriber, topic: String, message: String) {
        if (subscribers.containsKey(topic)) {
            val userMessage = "${subscriber.name}: $message"
            subscribers[topic]!!
                // observer 목록 순회하면서 메시지 전달
                .forEach { s -> s.handleMessage(userMessage) }
        }
    }

    fun sendMessage(topic: String, message: String) {
        if (subscribers.containsKey(topic)) {
            subscribers[topic]!!.forEach { subscriber ->
                // observer 목록 순회하면서 메시지 전달
                subscriber.handleMessage("${subscriber.name} | $message")
            }
        }
    }
}
