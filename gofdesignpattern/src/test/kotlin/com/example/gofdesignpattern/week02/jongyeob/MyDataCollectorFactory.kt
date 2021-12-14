package com.example.gofdesignpattern.week02.jongyeob

/**
 * 마이데이터 콜렉터 팩토리 인터페이스
 * 은행, 카드, 보헙 세 종류의 콜렉터 생성하는 팩토리 구현
 */
internal interface MyDataCollectorFactory {
    fun getMyDataCollectorInstance() : MyDataCollector

    fun createMyDataCollector(authKey: String, employees: List<Employee>): MyDataCollector {
        registerAuthKey(authKey)
        registerEmployees(employees)

        return getMyDataCollectorInstance()
    }

    // 금결원으로부터 전달받은 인증키 등록
    private fun registerAuthKey(authKey: String) {
        println("인증키 등록 : $authKey")
    }

    // 담당자 등록 (최대 2인)
    private fun registerEmployees(employees: List<Employee>) {
        employees.forEachIndexed { index, employee ->
            println("[${index + 1}] 임직원 등록 : $employee")
        }
    }
}

internal class BankMyDataCollectorFactory : MyDataCollectorFactory {
    override fun getMyDataCollectorInstance(): MyDataCollector =
        BankMyDataCollector()
}

internal class CardMyDataCollectorFactory : MyDataCollectorFactory {
    override fun getMyDataCollectorInstance(): MyDataCollector =
        CardMyDataCollector()
}

internal class InsuranceMyDataCollectorFactory : MyDataCollectorFactory {
    override fun getMyDataCollectorInstance(): MyDataCollector =
        InsuranceMyDataCollector()
}
