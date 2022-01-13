package com.example.gofdesignpattern.week05_prototype

import java.math.BigDecimal
import java.time.LocalDateTime

data class Transaction (
    val bank: Bank,
    val useStore : String,
    val amount : BigDecimal,
    val txTime : LocalDateTime,
    val user : User,
){
    fun description(): String{
        return "${user.name}은 ${txTime}에 ${useStore}에서 ${amount}만큼 사용하였습니다 [${bank.name}]"
    }
}


data class TransactionDto (
    val bankCode: Int,
    val useStore : String,
    val amount : BigDecimal,
    val txTime : LocalDateTime,
    val userNo : Long,
)


data class User(
    val userNo: Long,
    val age: Int,
    val name : String,
)

data class Bank(
    val code: Int,
    val name: String
)
