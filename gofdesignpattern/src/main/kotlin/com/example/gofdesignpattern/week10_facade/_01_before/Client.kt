package com.example.gofdesignpattern.week10_facade._01_before

import java.util.Properties
import javax.mail.Message
import javax.mail.MessagingException
import javax.mail.Session
import javax.mail.Transport
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

class Client {
    /**
     * 의존성이 강한 코드 (Tightly Coupled)
     */
    fun main() {
        val to = "study@toss.im"
        val from = "gof@toss.im"
        val host = "127.0.0.1"

        val properties: Properties = System.getProperties()
            .apply { setProperty("mail.smtp.host", host) }

        val session: Session = Session.getDefaultInstance(properties)

        try {
            val message: MimeMessage = MimeMessage(session)
                .apply {
                    setFrom(InternetAddress(from))
                    addRecipient(Message.RecipientType.TO, InternetAddress(to))
                    setSubject("디자인패턴 스터디")
                    setText("열심히 하고 있어요.")
                }

            Transport.send(message)
        } catch (e: MessagingException) {
            e.printStackTrace()
        }
    }
}
