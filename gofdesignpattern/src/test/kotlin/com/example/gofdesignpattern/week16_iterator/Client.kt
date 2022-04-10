package com.example.gofdesignpattern.week16_iterator

import org.junit.jupiter.api.Test

class Client {

    @Test
    internal fun `자동이체를 iterator로 구현해본다`() {
        val user = User(autoTransfers = mutableListOf())
        user.addAutoTransfer(Transfer("엄마", 10000))
        user.addAutoTransfer(Transfer("아빠", 9999))
        user.addAutoTransfer(Transfer("친구", 9998))

        val iterator = user.iterator()

        while (iterator.hasNext()) {
            val transfer = iterator.next()
            println("${transfer.to}에게 ${transfer.amount} 송금 완료")
        }
    }
}
