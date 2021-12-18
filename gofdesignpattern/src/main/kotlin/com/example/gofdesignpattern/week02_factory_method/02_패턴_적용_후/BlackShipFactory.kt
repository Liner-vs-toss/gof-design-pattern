package com.example.gofdesignpattern.week02_factory_method.`02_패턴_적용_후`

import com.example.gofdesignpattern.week02_factory_method.`00_공통`.BlackShip
import com.example.gofdesignpattern.week02_factory_method.`00_공통`.Ship

class BlackShipFactory : ShipFactory {
    override fun createShip(): Ship = BlackShip()
}
