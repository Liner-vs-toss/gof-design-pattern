package com.example.gofdesignpattern.week03_abstract_factory.`02_패턴_적용_후`

import com.example.gofdesignpattern.week02_factory_method.`02_패턴_적용_후`.*
import com.example.gofdesignpattern.week02_factory_method.`00_공통`.*

class WhiteshipFactory : ShipFactory {

    private val shipPartFactory : ShipPartFactory

    constructor(shipPartFactory: ShipPartFactory) {
        this.shipPartFactory = shipPartFactory
    }

    override fun createShip(): Ship {
        val ship = WhiteShip()
        ship.anchor = shipPartFactory.createAnchor()
        ship.wheel = shipPartFactory.createWheel()
        return ship
    }

}
