package com.example.gofdesignpattern.jongyeobsample.week11_flyweight

class JyMessageSender {
    fun send(target: Int, messageTemplate: JyMessageTemplate) {
        println("send message to $target title ${messageTemplate.title} message ${messageTemplate.message}")
    }
}
