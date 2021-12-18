package com.example.gofdesignpattern.week02_factory_method.`03_패턴_적용_후_의존성_주입`

import com.example.gofdesignpattern.week02_factory_method.`02_패턴_적용_후`.BlackShipFactory
import com.example.gofdesignpattern.week02_factory_method.`02_패턴_적용_후`.ShipFactory
import com.example.gofdesignpattern.week02_factory_method.`02_패턴_적용_후`.WhiteShipFactory

fun main() {
    println("[의존성 주입]")

    print(WhiteShipFactory(), "whiteship", "toss@toss.im")
    println()
    print(BlackShipFactory(), "blackship", "toss@toss.im")
}

/**
 * ShipFactory 인터페이스를 의존성 주입받아 사용하기 때문에 클라이언트 코드는 변경되지 않는다.
 */
private fun print(shipFactory: ShipFactory, name: String?, email: String?) {
    println(shipFactory.orderShip(name, email))
}
