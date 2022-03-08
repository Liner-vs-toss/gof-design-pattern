package com.example.gofdesignpattern.week11_flyweight

import java.lang.Math.random
import org.junit.jupiter.api.Test

class Client {

    @Test
    fun `before 메세지를 10000개 발송한다`() {
        val sender = MessageSender()
        (1..1000).forEach {
            sender.send(it,
                messageTemplate = MessageTemplate("메세지1", "토스뱅크를 사용해 주셔서 감사합니다."))
        }
    }

    @Test
    fun `after 메세지를 10000개 발송한다`() {
        val sender = MessageSender()
        val messageTemplateFactory = MessageTemplateFactory()
        (1..1000).forEach {
            sender.send(it, messageTemplate = messageTemplateFactory.getMessageTemplate("메세지1",
                "토스뱅크를 사용해 주셔서 감사합니다."))
        }
    }
}
