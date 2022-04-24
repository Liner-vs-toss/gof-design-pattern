package com.example.gofdesignpattern.woojinsample.week02

class NormalCarFactory : CarFactory {
    override fun initCar(name: String, price: Long): Car {
        return NormalCar(name, price)
    }

    override fun prepareCar(car: Car) = car.run {
        super.prepareCar(car)
    }
}
