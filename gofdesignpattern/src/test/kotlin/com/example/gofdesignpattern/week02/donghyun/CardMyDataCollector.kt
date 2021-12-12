package com.example.gofdesignpattern.week02.donghyun

class CardMyDataCollector : MyDataCollector {
    override val business: String
        get() = "Card"

    override fun collectData() {
        println("collecting Card mydata ...")
        log()
    }
}
