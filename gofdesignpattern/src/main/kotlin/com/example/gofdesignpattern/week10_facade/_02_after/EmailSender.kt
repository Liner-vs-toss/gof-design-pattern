package com.example.gofdesignpattern.week10_facade._02_after

import java.util.Properties
import javax.mail.Message
import javax.mail.MessagingException
import javax.mail.Session
import javax.mail.Transport
import javax.mail.internet.InternetAddress
import javax.mail.internet.MimeMessage

/**
 * 메시지 전송 Facade
 */
class EmailSender(
    private val emailSettings: EmailSettings
) {
    fun sendEmail(emailMessage: EmailMessage) {
        val properties: Properties = System.getProperties()
            .apply { setProperty("mail.smtp.host", emailSettings.host) }

        val session: Session = Session.getDefaultInstance(properties)

        try {
            val message: MimeMessage = MimeMessage(session)
                .apply {
                    setFrom(InternetAddress(emailMessage.from))
                    addRecipient(Message.RecipientType.TO, InternetAddress(emailMessage.to))
                    setSubject(emailMessage.subject)
                    setText(emailMessage.text)
                }

            Transport.send(message)
        } catch (e: MessagingException) {
            e.printStackTrace()
        }
    }
}
