package com.example.gofdesignpattern.jongyeobsample.week03.factory

import com.example.gofdesignpattern.jongyeobsample.week03.model.Ship
import com.example.gofdesignpattern.jongyeobsample.week03.model.WhiteShip

class WhiteshipFactory(
    private val shipPartsFactory: ShipPartsFactory
) {
    fun createShip(): Ship {
        val ship = WhiteShip()
        ship.anchor = shipPartsFactory.createAnchor()
        ship.wheel = shipPartsFactory.createWheel()
        return ship
    }
}
