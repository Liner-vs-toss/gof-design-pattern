package com.example.gofdesignpattern.week02_factory_method.`02_패턴_적용_후`

import com.example.gofdesignpattern.week02_factory_method.`00_공통`.Ship

interface ShipFactory {
    // default 함수
    fun orderShip(name: String?, email: String?): Ship {
        validate(name, email)
        prepareFor(name!!)

        val ship = createShip()
        sendEmailTo(email!!, ship)

        return ship
    }

    // 팩토리 메소드
    fun createShip(): Ship

    private fun validate(name: String?, email: String?) {
        require(name.isNullOrBlank().not()) { "배 이름을 지어주세요." }
        require(email.isNullOrBlank().not()) { "연락처를 남겨주세요." }
    }

    private fun prepareFor(name: String) {
        println("$name 만들 준비 중")
    }

    private fun sendEmailTo(email: String, ship: Ship) {
        println("${ship.name} 다 만들었습니다.")
    }
}
