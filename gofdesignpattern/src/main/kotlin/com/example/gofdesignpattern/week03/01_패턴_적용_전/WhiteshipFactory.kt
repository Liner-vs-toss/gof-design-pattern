package com.example.gofdesignpattern.week03.`01_패턴_적용_전`

import com.example.gofdesignpattern.week02.`02_패턴_적용_후`.*
import com.example.gofdesignpattern.week02.`00_공통`.*

class WhiteshipFactory : ShipFactory {

    override fun createShip(): Ship {
        val whiteShip = WhiteShip()
        whiteShip.anchor = WhiteAnchor()
        whiteShip.wheel = WhiteWheel()
        return whiteShip
    }

}
