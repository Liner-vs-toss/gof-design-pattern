package com.example.gofdesignpattern.week11_flyweight

class MessageSender {
    fun send(target: Int, messageTemplate: MessageTemplate) {
        println("send message to $target title ${messageTemplate.title} message ${messageTemplate.message}")
    }
}
