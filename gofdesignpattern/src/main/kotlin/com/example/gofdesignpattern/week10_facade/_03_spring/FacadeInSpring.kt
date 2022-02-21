package com.example.gofdesignpattern.week10_facade._03_spring

import org.springframework.jdbc.support.JdbcTransactionManager
import org.springframework.transaction.PlatformTransactionManager

class FacadeInSpring {
    fun main() {
        val mailSender: MailSender = JavaMailSenderImpl()

        // 퍼사드 : PlatformTransactionManager, JdbcTransactionManager
        // 실제로 감춰져 있는 것 : jdbc API
        val platformTransactionManager: PlatformTransactionManager = JdbcTransactionManager()
    }
}

interface MailSender

class JavaMailSenderImpl : MailSender
