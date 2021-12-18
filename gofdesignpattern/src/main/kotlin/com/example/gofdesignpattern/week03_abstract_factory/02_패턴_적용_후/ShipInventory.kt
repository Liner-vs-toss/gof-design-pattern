package com.example.gofdesignpattern.week03_abstract_factory.`02_패턴_적용_후`

import com.example.gofdesignpattern.week02_factory_method.`00_공통`.Ship
import com.example.gofdesignpattern.week02_factory_method.`02_패턴_적용_후`.ShipFactory


fun main() {

    val shipFactory: ShipFactory = WhiteshipFactory(WhiteshipPartsFactory())
//    val shipFactory: ShipFactory = WhiteshipFactory(WhiteshipPartsProFactory())
    val ship: Ship = shipFactory.createShip()

    println(ship.anchor::class.java)
    println(ship.wheel::class.java)
}
