package com.example.gofdesignpattern.week06_adapter.woojin

/**
 * Adaptee
 */
class KakaoReader {
    fun kakaoPay(card: TossBankCard, amount: Long) {
        println("카카오 리더기로 ${"토스뱅크 카드로 %,d".format(amount)} 원 결제")
    }
}
