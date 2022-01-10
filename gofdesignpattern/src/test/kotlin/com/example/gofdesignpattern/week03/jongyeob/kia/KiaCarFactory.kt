package com.example.gofdesignpattern.week03.jongyeob.kia

import com.example.gofdesignpattern.week03.jongyeob.Car
import com.example.gofdesignpattern.week03.jongyeob.CarFactory
import com.example.gofdesignpattern.week03.jongyeob.CarPartFactory

class KiaCarFactory: CarFactory {
    override fun createCar(carPartFactory: CarPartFactory): Car
        = KiaCar(
            wheel = carPartFactory.createWheel(),
            roof = carPartFactory.createRoof()
        )
}
