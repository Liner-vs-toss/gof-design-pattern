package com.example.gofdesignpattern.jongyeobsample.week03.factory

fun main() {
    val shipFactory = WhiteshipFactory(WhitePartsProFactory())
    val ship = shipFactory.createShip()

    println(ship.anchor::class.java)
    println(ship.wheel::class.java)
}
