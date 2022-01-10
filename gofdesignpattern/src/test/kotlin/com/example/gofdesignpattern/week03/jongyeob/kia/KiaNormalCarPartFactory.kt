package com.example.gofdesignpattern.week03.jongyeob.kia

import com.example.gofdesignpattern.week03.jongyeob.CarPartFactory
import com.example.gofdesignpattern.week03.jongyeob.Roof
import com.example.gofdesignpattern.week03.jongyeob.Wheel

class KiaNormalCarPartFactory: CarPartFactory {
    override fun createWheel(): Wheel = KiaNormalWheel()
    override fun createRoof(): Roof = KiaNormalRoof()
}
