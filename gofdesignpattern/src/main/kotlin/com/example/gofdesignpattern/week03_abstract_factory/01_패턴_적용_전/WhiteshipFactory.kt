package com.example.gofdesignpattern.week03_abstract_factory.`01_패턴_적용_전`

import com.example.gofdesignpattern.week02_factory_method.`02_패턴_적용_후`.*
import com.example.gofdesignpattern.week02_factory_method.`00_공통`.*

class WhiteshipFactory : ShipFactory {

    override fun createShip(): Ship {
        val whiteShip = WhiteShip()
        whiteShip.anchor = WhiteAnchor()
        whiteShip.wheel = WhiteWheel()
        return whiteShip
    }

}
