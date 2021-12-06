package com.example.gofdesignpattern.week02.`02_패턴_적용_후`

import com.example.gofdesignpattern.week02.`00_공통`.Ship
import com.example.gofdesignpattern.week02.`00_공통`.WhiteShip

class WhiteShipFactory : ShipFactory {
    override fun createShip(): Ship = WhiteShip()
}
