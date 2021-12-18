package com.example.gofdesignpattern.week02_factory_method.donghyun

class InsuranceMyDataCollectorFactory : MyDataCollectorFactory{
    override fun getMyDataCollectorInstance(): MyDataCollector = InsuranceMyDataCollector()
}
