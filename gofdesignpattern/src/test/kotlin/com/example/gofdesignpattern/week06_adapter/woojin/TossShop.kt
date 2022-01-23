package com.example.gofdesignpattern.week06_adapter.woojin

import org.junit.jupiter.api.Test

/**
 * Client
 */
class TossShop {

    @Test
    fun `토스 단말을 이용해서 결제한다`() {
        val reader: Reader = TossReader()

        val card: TossBankCard = TossBankCard()
        val amount: Long = 20000

        reader.read(card, amount)
    }

    @Test
    fun `어댑터를 이용해 카카오 단말로 결제한다`() {
        val reader: Reader = KaKaoReaderAdapter(KakaoReader())

        val card: TossBankCard = TossBankCard()
        val amount: Long = 20000

        reader.read(card, amount)
    }
}
