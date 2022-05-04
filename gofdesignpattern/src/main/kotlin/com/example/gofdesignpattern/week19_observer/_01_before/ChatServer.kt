package com.example.gofdesignpattern.week19_observer._01_before

class ChatServer {
    private val messages : MutableMap<String, MutableList<String>> = mutableMapOf()

    fun add(topic: String, message: String) {
        if (messages.containsKey(topic)) {
            messages[topic]!!.add(message)
        } else {
            messages[topic] = mutableListOf(message)
        }
    }

    fun getMessage(topic: String): List<String> =
        messages[topic]!!
}
