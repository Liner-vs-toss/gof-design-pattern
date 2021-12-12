package com.example.gofdesignpattern.week02.donghyun

class CardMyDataCollectorFactory : MyDataCollectorFactory {
    override fun getMyDataCollectorInstance(): MyDataCollector = CardMyDataCollector()

}
