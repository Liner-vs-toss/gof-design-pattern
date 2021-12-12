package com.example.gofdesignpattern.week02.donghyun

/**
 * 은행, 카드, 보헙 세 종류의 콜렉터 구현
 */
interface MyDataCollector {
    // 업권 종류
    val business: String

    // 데이터 수집
    fun collectData()

    // 로그 적재
    fun log() {
        println("로그 적재... $business")
    }
}
