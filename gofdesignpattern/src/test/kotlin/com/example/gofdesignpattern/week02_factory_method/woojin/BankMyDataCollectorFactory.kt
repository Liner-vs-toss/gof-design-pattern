package com.example.gofdesignpattern.week02_factory_method.woojin

/**
 * 마이데이터 콜렉터 팩토리 인터페이스
 * 은행, 카드, 보헙 세 종류의 콜렉터 생성하는 팩토리 구현
 */
class BankMyDataCollectorFactory: MyDataCollectorFactory {
    override fun getMyDataCollectorInstance(): MyDataCollector {
        return BankMyDataCollector("은행")
    }

}
