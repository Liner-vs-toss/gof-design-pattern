package com.example.gofdesignpattern.jongyeobsample.week11_flyweight

class JyMessageTemplateFactory {
    private val cache: MutableMap<String, JyMessageTemplate> = mutableMapOf()

    fun getMessageTemplate(title: String, message: String): JyMessageTemplate =
        cache["$title:$message"] ?: run {
            val messageTemplate = JyMessageTemplate(title, message)
            cache["$title:$message"] = messageTemplate
            messageTemplate
        }
}
