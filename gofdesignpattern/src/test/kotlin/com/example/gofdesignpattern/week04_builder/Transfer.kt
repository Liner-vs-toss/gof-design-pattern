package com.example.gofdesignpattern.week04_builder

interface Transfer {
    val fromBankCode: Int
    val toBankCode: Int
    val amount: Long
    val summary: String?
    val name: String
}
