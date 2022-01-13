package com.example.gofdesignpattern.week06_adapter

/**
 * Adaptee
 */
class KakaoReader {
    fun kakaoPay(card: TossBankCard, amount: Long) {
        println("카카오 리더기로 결제 요청")
    }
}
