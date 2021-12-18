package com.example.gofdesignpattern.week02_factory_method.`02_패턴_적용_후`

fun main() {
    println("[패턴 적용 후]")

    val whiteship = WhiteShipFactory().orderShip("whiteship", "toss@toss.im")
    println(whiteship)
    println()
    val blackship = BlackShipFactory().orderShip("blackship", "toss@toss.im")
    println(blackship)
}
