package com.example.gofdesignpattern.week02.donghyun

class InsuranceMyDataCollectorFactory : MyDataCollectorFactory{
    override fun getMyDataCollectorInstance(): MyDataCollector = InsuranceMyDataCollector()
}
