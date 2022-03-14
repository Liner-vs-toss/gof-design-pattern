package com.example.gofdesignpattern.jongyeobsample.week11_flyweight

import org.junit.jupiter.api.Test

class JyClient {

    /**
     * init 블록으로 인스턴스 생성 지연시켜서 시간차 발생
     */
    @Test
    fun `before 메세지를 10000개 발송한다`() {
        val sender = JyMessageSender()
        val start = System.currentTimeMillis()
        (1..1000).forEach {
            sender.send(it,
                messageTemplate = JyMessageTemplate("메세지1", "토스뱅크를 사용해 주셔서 감사합니다."))
        }
        val end = System.currentTimeMillis()
        println("${end - start} ms")
    }

    @Test
    fun `after 메세지를 10000개 발송한다`() {
        val sender = JyMessageSender()
        val messageTemplateFactory = JyMessageTemplateFactory()
        val start = System.currentTimeMillis()
        (1..1000).forEach {
            sender.send(it, messageTemplate = messageTemplateFactory.getMessageTemplate("메세지1",
                "토스뱅크를 사용해 주셔서 감사합니다."))
        }
        val end = System.currentTimeMillis()
        println("${end - start} ms")
    }
}
