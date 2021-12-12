package com.example.gofdesignpattern.week02.donghyun

/**
 * 마이데이터 콜렉터 팩토리 인터페이스
 * 은행, 카드, 보헙 세 종류의 콜렉터 생성하는 팩토리 구현
 */
interface MyDataCollectorFactory {
    fun getMyDataCollectorInstance() : MyDataCollector

    fun createMyDataCollector(authKey: String, employees: List<Employee>): MyDataCollector {
        registerAuthKey(authKey)
        registerEmployees(employees)
        return getMyDataCollectorInstance()
    }

    // 금결원으로부터 전달받은 인증키 등록
    private fun registerAuthKey(authKey: String) {
        println("인증 키 등록 ... ${authKey}")
    }

    // 담당자 등록 (최대 2인)
    private fun registerEmployees(employees: List<Employee>) {
        for(employee in employees)
            println("담당자 등록 ... 이름 : ${employee.name} 소속 : ${employee.squad}")
    }
}
