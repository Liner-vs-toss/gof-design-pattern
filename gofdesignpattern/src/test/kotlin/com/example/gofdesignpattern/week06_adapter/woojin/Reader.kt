package com.example.gofdesignpattern.week06_adapter.woojin

/**
 * Target
 */
interface Reader {
    fun read(card: TossBankCard, amount: Long)
}
