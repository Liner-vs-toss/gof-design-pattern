package com.example.gofdesignpattern.woojinsample.week02

import java.lang.RuntimeException

class NormalCarFactory : CarFactory {
    override fun initCar(name: String, price: Long): Car {
        return NormalCar(name, price)
    }

    override fun prepareCar(car: Car) = car.run {
        super.prepareCar(car)
    }

}
