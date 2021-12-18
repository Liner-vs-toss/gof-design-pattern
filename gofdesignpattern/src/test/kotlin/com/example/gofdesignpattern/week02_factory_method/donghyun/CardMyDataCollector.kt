package com.example.gofdesignpattern.week02_factory_method.donghyun

class CardMyDataCollector : MyDataCollector {
    override val business: String
        get() = "Card"

    override fun collectData() {
        println("collecting Card mydata ...")
        log()
    }
}
