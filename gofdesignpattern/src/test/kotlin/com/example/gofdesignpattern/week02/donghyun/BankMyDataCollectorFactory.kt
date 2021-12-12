package com.example.gofdesignpattern.week02.donghyun

class BankMyDataCollectorFactory: MyDataCollectorFactory {
    override fun getMyDataCollectorInstance(): MyDataCollector
       = BankMyDataCollector()
}
