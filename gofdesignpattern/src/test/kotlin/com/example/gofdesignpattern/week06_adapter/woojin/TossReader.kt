package com.example.gofdesignpattern.week06_adapter.woojin

class TossReader : Reader {
    override fun read(card: TossBankCard, amount: Long) {
        println("토스 리더기로 결제 요청")
        card.pay(amount)
    }
}
