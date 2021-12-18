package com.example.gofdesignpattern.week02_factory_method.jongyeob

import io.kotest.matchers.types.shouldBeInstanceOf
import org.junit.jupiter.api.Test

internal class Reader {
    @Test
    fun readMyData() {
        val bankCollector = BankMyDataCollectorFactory()
            .createMyDataCollector(
                authKey = "kftc-12345",
                employees = listOf(Employee("jykim", "Common"))
            ).also { it.collectData() }
        bankCollector.shouldBeInstanceOf<BankMyDataCollector>()

        val cardCollector = CardMyDataCollectorFactory()
            .createMyDataCollector(
                authKey = "kftc-12345",
                employees = listOf(Employee("jykim", "Common"))
            ).also { it.collectData() }
        cardCollector.shouldBeInstanceOf<CardMyDataCollector>()

        val insuranceCollector = InsuranceMyDataCollectorFactory()
            .createMyDataCollector(
                authKey = "kftc-12345",
                employees = listOf(Employee("jykim", "Common"))
            ).also { it.collectData() }
        insuranceCollector.shouldBeInstanceOf<InsuranceMyDataCollector>()
    }
}
