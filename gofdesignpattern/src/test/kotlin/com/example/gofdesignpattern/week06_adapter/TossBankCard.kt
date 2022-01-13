package com.example.gofdesignpattern.week06_adapter

class TossBankCard {
    fun pay(amount: Long) {
        println("${"토스뱅크 카드로 %,d".format(amount)} 원 결제")
    }
}
