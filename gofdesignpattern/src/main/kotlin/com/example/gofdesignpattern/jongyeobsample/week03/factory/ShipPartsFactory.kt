package com.example.gofdesignpattern.jongyeobsample.week03.factory

// 추상 팩토리
interface ShipPartsFactory {
    fun createAnchor(): Anchor
    fun createWheel(): Wheel
}

// 팩토리 구현체
class WhiteshipPartsFactory : ShipPartsFactory {
    override fun createAnchor(): Anchor = WhiteAnchor()
    override fun createWheel(): Wheel = WhiteWheel()
}

// 구현체 추가
class WhitePartsProFactory : ShipPartsFactory {
    override fun createAnchor(): Anchor = WhiteAnchorPro()
    override fun createWheel(): Wheel = WhiteWheelPro()
}
