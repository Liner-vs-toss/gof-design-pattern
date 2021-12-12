package com.example.gofdesignpattern.week02.donghyun

class BankMyDataCollector : MyDataCollector {
    override val business: String
        get() = "Bank"

    override fun collectData() {
        println("Collecting Bank mydata ...")
    }


}
