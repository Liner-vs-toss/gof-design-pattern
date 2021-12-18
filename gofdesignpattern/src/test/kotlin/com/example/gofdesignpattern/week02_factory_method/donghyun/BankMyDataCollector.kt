package com.example.gofdesignpattern.week02_factory_method.donghyun

class BankMyDataCollector : MyDataCollector {
    override val business: String
        get() = "Bank"

    override fun collectData() {
        println("Collecting Bank mydata ...")
    }


}
