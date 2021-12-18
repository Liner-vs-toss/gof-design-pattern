package com.example.gofdesignpattern.week02_factory_method.donghyun

class InsuranceMyDataCollector : MyDataCollector {
    override val business: String
        get() = "Insurance"

    override fun collectData() {
        println("collecting insurance mydata ...")
        log()
    }
}
