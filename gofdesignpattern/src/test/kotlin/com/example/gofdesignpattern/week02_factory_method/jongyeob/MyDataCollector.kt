package com.example.gofdesignpattern.week02_factory_method.jongyeob

/**
 * 은행, 카드, 보헙 세 종류의 콜렉터 구현
 */
internal interface MyDataCollector {
    // 업권 종류
    val business: String

    // 데이터 수집
    fun collectData()

    fun log() {
        println("$business 데이터 수집 로그")
    }
}

internal class BankMyDataCollector : MyDataCollector {
    override val business: String = "은행업권"

    override fun collectData() {
        println("$business 데이터 수집")
        log()
    }
}

internal class CardMyDataCollector : MyDataCollector {
    override val business: String = "카드업권"

    override fun collectData() {
        println("$business 데이터 수집")
        log()
    }
}

internal class InsuranceMyDataCollector : MyDataCollector {
    override val business: String = "보험업권"

    override fun collectData() {
        println("$business 데이터 수집")
        log()
    }
}
