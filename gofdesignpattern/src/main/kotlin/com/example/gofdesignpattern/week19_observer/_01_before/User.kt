package com.example.gofdesignpattern.week19_observer._01_before

class User(
    private val chatServer: ChatServer
) {
    fun sendMessage(topic: String, message: String) {
        chatServer.add(topic, message)
    }

    fun getMessage(topic: String): List<String> =
        chatServer.getMessage(topic)
}
