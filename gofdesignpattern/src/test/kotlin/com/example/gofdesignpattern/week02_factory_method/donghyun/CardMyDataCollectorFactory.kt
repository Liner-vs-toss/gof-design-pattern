package com.example.gofdesignpattern.week02_factory_method.donghyun

class CardMyDataCollectorFactory : MyDataCollectorFactory {
    override fun getMyDataCollectorInstance(): MyDataCollector = CardMyDataCollector()

}
