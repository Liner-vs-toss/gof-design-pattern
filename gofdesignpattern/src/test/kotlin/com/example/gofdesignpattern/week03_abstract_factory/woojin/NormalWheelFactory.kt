package com.example.gofdesignpattern.week03_abstract_factory.woojin

class NormalWheelFactory: WheelFactory {
    override fun createWheel(): Wheel {
        return NormalWheel()
    }
}
