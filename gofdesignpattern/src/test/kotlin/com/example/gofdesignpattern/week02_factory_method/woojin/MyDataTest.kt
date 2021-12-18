package com.example.gofdesignpattern.week02_factory_method.woojin

import java.util.UUID
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MyDataTest {

    @Test
    fun bankMyCollector() {
        val bankMyCollector = BankMyDataCollectorFactory().createMyDataCollector(
            authKey = UUID.randomUUID().toString(),
            employees = listOf(Employee("강우진", "Common Squad"), Employee("김종엽", "Common Squad"))
        )
        assertThat(bankMyCollector.business).isEqualTo("은행")
        bankMyCollector.collectData()
        bankMyCollector.log()
    }

    @Test
    fun cardMyCollector() {
        val cardMyCollector = CardMyDataCollectorFactory().createMyDataCollector(
            authKey = UUID.randomUUID().toString(),
            employees = listOf(Employee("이찬희", "Card Squad"), Employee("한재만", "Card Squad"))
        )
        assertThat(cardMyCollector.business).isEqualTo("카드")
        cardMyCollector.collectData()
        cardMyCollector.log()
    }

    @Test
    fun insuranceMyCollector() {
        val insuranceMyCollector = InsuranceMyDataCollectorFactory().createMyDataCollector(
            authKey = UUID.randomUUID().toString(),
            employees = listOf(Employee("김말똥", "Insurance Squad"), Employee("한빛남", "Insurance Squad"))
        )
        assertThat(insuranceMyCollector.business).isEqualTo("보험")
        insuranceMyCollector.collectData()
        insuranceMyCollector.log()
    }



}
