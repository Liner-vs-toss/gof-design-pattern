package com.example.gofdesignpattern.week03_abstract_factory.`02_패턴_적용_후`

interface ShipPartFactory {

    fun createAnchor() : Anchor

    fun createWheel() : Wheel

}
