package com.example.gofdesignpattern.week05_prototype

import java.math.BigDecimal
import java.time.LocalDateTime

class TransactionService {

    fun getTransactionsFromSameBank(bankCode: Int): List<Transaction> {
        return (0..10).map {
            val transaction = getTransaction(it)
            val user = getUser(transaction.userNo)
            val bank = getBank(bankCode)
            Transaction(bank, transaction.useStore, transaction.amount, transaction.txTime, user)
        }
    }

    fun getUser(userNo: Long): User {
        System.out.println("start getting user")
        Thread.sleep(3000)
        System.out.println("end getting user")
        return User(userNo, 30, "김토스")

    }

    fun getBank(bankCode: Int): Bank {
        System.out.println("start getting bank")
        Thread.sleep(5000)
        System.out.println("end getting bank")
        return Bank(bankCode, "토스뱅크")
    }

    fun getTransaction(postFix: Int): TransactionDto {
        return TransactionDto(
            1,
            "useStore$postFix",
            BigDecimal.valueOf(1000),
            LocalDateTime.now(),
            1,
        )
    }
}
