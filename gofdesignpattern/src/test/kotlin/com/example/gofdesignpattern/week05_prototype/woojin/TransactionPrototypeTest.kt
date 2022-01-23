package com.example.gofdesignpattern.week05_prototype.woojin

import org.junit.jupiter.api.Test

class TransactionPrototypeTest {

    @Test
    fun `create_transactions`() {
        val startTimeMillis = System.currentTimeMillis()
        TransactionService().getTransactionsFromSameBank(1)
        val endTimeMillis = System.currentTimeMillis()

        val processTime = endTimeMillis - startTimeMillis
        System.out.println("It took $processTime")
        assert(processTime < 10_000L)
    }
}
