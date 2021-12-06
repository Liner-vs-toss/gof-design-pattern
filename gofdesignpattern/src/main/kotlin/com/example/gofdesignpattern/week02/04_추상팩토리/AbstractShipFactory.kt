package com.example.gofdesignpattern.week02.`04_추상팩토리`

import com.example.gofdesignpattern.week02.`00_공통`.Ship

abstract class AbstractShipFactory : ShipFactory {
    // default 함수
    override fun orderShip(name: String?, email: String?): Ship {
        validate(name, email)
        prepareFor(name!!)

        val ship = createShip()
        sendEmailTo(email!!, ship)

        return ship
    }

    override fun validate(name: String?, email: String?) {
        require(name.isNullOrBlank().not()) { "배 이름을 지어주세요." }
        require(email.isNullOrBlank().not()) { "연락처를 남겨주세요." }
    }

    override fun prepareFor(name: String) {
        println("$name 만들 준비 중")
    }

    override fun sendEmailTo(email: String, ship: Ship) {
        println("${ship.name} 다 만들었습니다.")
    }
}
