package com.example.gofdesignpattern.week03.jongyeob.hyundai

import com.example.gofdesignpattern.week03.jongyeob.Car
import com.example.gofdesignpattern.week03.jongyeob.CarFactory
import com.example.gofdesignpattern.week03.jongyeob.CarPartFactory

class HyundaiCarFactory: CarFactory {
    override fun createCar(carPartFactory: CarPartFactory): Car
        = HyundaiCar(
            wheel = carPartFactory.createWheel(),
            roof = carPartFactory.createRoof()
        )
}
