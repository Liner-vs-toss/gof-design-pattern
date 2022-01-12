package com.example.gofdesignpattern.week06_adapter

/**
 * Target
 */
interface Reader {
    fun read(card: TossBankCard, amount: Long)
}
