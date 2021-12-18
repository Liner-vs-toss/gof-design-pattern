package com.example.gofdesignpattern.week02_factory_method.woojin

/**
 * 은행, 카드, 보헙 세 종류의 콜렉터 구현
 */
data class InsuranceMyDataCollector(
    override val business: String = "보험"
): MyDataCollector {
    // 데이터 수집
    override fun collectData() {
        println("$business 데이터 수집")
    }
    // 로그 적재
    override fun log() {
        println("$business 로그 적재")
    }
}
