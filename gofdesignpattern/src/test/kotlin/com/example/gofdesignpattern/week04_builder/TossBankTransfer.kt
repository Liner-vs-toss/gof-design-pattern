package com.example.gofdesignpattern.week04_builder

class TossBankTransfer(
    override val fromBankCode: Int,
    override val toBankCode: Int,
    override val amount: Long,
    override val summary: String?,
    override val name: String
) : Transfer {
}
