package com.example.gofdesignpattern.week11_flyweight.woojin

class MessageTemplateFactory {
    private val templates = mutableMapOf<String, MessageTemplate>()
    fun getMessageTemplate(title: String, message: String): MessageTemplate {
        val uniqueKey = getUniqueKey(title, message)
        return if (templates.containsKey(uniqueKey)) {
            templates[uniqueKey]!!
        } else {
            val messageTemplate = MessageTemplate(title = title, message = message)
            templates[uniqueKey] = messageTemplate
            messageTemplate
        }
    }

    fun getUniqueKey(title: String, message: String): String {
        return "${title}:$message"
    }
}
