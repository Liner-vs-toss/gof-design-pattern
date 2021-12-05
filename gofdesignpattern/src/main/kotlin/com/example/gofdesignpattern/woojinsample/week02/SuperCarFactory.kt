package com.example.gofdesignpattern.woojinsample.week02

import java.lang.RuntimeException

class SuperCarFactory : CarFactory {
    override fun initCar(name: String, price: Long): Car {
        return SuperCar(name, price)
    }

    override fun prepareCar(car: Car) = car.run {
        super.prepareCar(car)
        println("$maker $name 튜닝을 시작합니다.")
        println("바퀴 튜닝 완료")
        println("프레임 튜닝 완료")
    }

}
