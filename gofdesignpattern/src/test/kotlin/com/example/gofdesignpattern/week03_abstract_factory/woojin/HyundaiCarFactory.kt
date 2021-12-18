package com.example.gofdesignpattern.week03_abstract_factory.woojin

class HyundaiCarFactory(
    private val wheelFactory: WheelFactory,
    private val loofFactory: LoofFactory
): CarFactory{

    override fun createCar(): Car {
        return HyundaiCar(wheelFactory.createWheel(), loofFactory.createLoof())
    }
}
