package com.example.gofdesignpattern.week02.donghyun

import org.junit.jupiter.api.Test


class DonghyunTest {

    @Test
    fun testBankMyDataCollector() {
        val bankMyDataCollector: MyDataCollector =
            BankMyDataCollectorFactory()
                .createMyDataCollector("bankAuthKey", listOf(Employee("donghyun", "common"), Employee("woojin", "common")))

        bankMyDataCollector.collectData()
    }

    @Test
    fun testCardMyDataCollector() {
        val cardMyDataCollector: MyDataCollector =
            CardMyDataCollectorFactory()
                .createMyDataCollector("cardAuthKey", listOf(Employee("chanhee", "card")))

        cardMyDataCollector.collectData()
    }

    @Test
    fun testInsuranceMyDataCollector() {
        val insuranceMyDataCollector: MyDataCollector =
            InsuranceMyDataCollectorFactory()
                .createMyDataCollector("insuranceAuthKey", listOf(Employee("terry", "insurance")))

        insuranceMyDataCollector.collectData()
    }

}
