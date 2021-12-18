package com.example.gofdesignpattern.week02_factory_method.donghyun

class BankMyDataCollectorFactory: MyDataCollectorFactory {
    override fun getMyDataCollectorInstance(): MyDataCollector
       = BankMyDataCollector()
}
