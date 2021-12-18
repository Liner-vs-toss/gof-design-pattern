package com.example.gofdesignpattern.week02_factory_method.`01_패턴_적용_전`

fun main() {
    println("[패턴 적용 전]")

    val whiteship = DefaultShipFactory.orderShip("whiteship", "toss@toss.im")
    println(whiteship)
    println()
    val blackship = DefaultShipFactory.orderShip("blackship", "toss@toss.im")
    println(blackship)
}
