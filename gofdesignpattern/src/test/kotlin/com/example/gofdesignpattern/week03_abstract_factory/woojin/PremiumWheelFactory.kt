package com.example.gofdesignpattern.week03_abstract_factory.woojin

class PremiumWheelFactory: WheelFactory {
    override fun createWheel(): Wheel {
        return PremiumWheel()
    }
}
