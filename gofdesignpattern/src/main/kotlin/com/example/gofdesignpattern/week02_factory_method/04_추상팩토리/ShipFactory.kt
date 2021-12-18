package com.example.gofdesignpattern.week02_factory_method.`04_추상팩토리`

import com.example.gofdesignpattern.week02_factory_method.`00_공통`.Ship

interface ShipFactory {
    // default 함수
    fun orderShip(name: String?, email: String?): Ship

    // 팩토리 메소드
    fun createShip(): Ship

    fun validate(name: String?, email: String?)
    fun prepareFor(name: String)
    fun sendEmailTo(email: String, ship: Ship)
}
