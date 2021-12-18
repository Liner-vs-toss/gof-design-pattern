package com.example.gofdesignpattern.week03_abstract_factory.woojin

class KiaCarFactory(
    private val wheelFactory: WheelFactory,
    private val loofFactory: LoofFactory
): CarFactory{
    override fun createCar(): Car {
        return KiaCar(wheelFactory.createWheel(), loofFactory.createLoof())
    }
}
