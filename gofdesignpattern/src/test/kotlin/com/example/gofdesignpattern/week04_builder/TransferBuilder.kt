package com.example.gofdesignpattern.week04_builder

interface TransferBuilder {

    fun newInstance(name: String, toBankCode: Int): TransferBuilder

    fun bankCode(fromBankCode: Int): TransferBuilder

    fun amount(amount: Long): TransferBuilder

    fun summary(summary: String): TransferBuilder

    fun createTransfer(): Transfer
}
