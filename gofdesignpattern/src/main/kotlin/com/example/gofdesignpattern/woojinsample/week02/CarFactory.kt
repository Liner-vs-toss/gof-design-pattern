package com.example.gofdesignpattern.woojinsample.week02

import java.lang.RuntimeException

interface CarFactory {

    fun createCar(name: String, price: Long): Car {
        val car = initCar(name, price)
        prepareCar(car)
        notify(car)
        return car
    }

    fun initCar(name: String, price: Long): Car

    fun prepareCar(car: Car) = car.run {
        println("$maker $name 자동차 조립 중입니다.")
    }

    private fun notify(car: Car) = car.run {
        println("$maker $name 자동차 조립이 완료되었습니다.")
    }
}
