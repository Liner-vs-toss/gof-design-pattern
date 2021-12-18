package com.example.gofdesignpattern.week04_builder

interface TransferBuilder {

    fun name(name: String): TransferBuilder

    fun bankCode(fromBankCode: Int, toBankCode: Int): TransferBuilder

    fun amount(amount: Long): TransferBuilder

    fun summary(summary: String): TransferBuilder

    fun createTransfer(): Transfer
}
