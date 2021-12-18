package com.example.gofdesignpattern.week03_abstract_factory.`02_패턴_적용_후`

class WhiteshipPartsProFactory : ShipPartFactory {
    override fun createAnchor() = WhiteAnchorPro()
    override fun createWheel() = WhiteWheelPro()
}
