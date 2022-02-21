package com.example.gofdesignpattern.week10_facade._02_after

class Client {
    fun main() {
        val emailSettings = EmailSettings("127.0.0.1")
        val emailMessage = EmailMessage("study@toss.im", "gof@toss.im", "디자인 패턴 스터디", "열심히 하고 있어요.")

        val emailSender = EmailSender(emailSettings)
        emailSender.sendEmail(emailMessage)
    }
}
