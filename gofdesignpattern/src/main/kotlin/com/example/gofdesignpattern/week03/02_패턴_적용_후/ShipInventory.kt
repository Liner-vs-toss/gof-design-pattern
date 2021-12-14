package com.example.gofdesignpattern.week03.`02_패턴_적용_후`

import com.example.gofdesignpattern.week02.`00_공통`.Ship
import com.example.gofdesignpattern.week02.`02_패턴_적용_후`.ShipFactory
import com.example.gofdesignpattern.week03.`02_패턴_적용_후`.WhiteshipFactory


fun main() {

    val shipFactory: ShipFactory = WhiteshipFactory(WhiteshipPartsFactory())
//    val shipFactory: ShipFactory = WhiteshipFactory(WhiteshipPartsProFactory())
    val ship: Ship = shipFactory.createShip()

    println(ship.anchor::class.java)
    println(ship.wheel::class.java)
}
