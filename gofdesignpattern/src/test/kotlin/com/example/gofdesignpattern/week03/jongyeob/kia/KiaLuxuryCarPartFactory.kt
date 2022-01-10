package com.example.gofdesignpattern.week03.jongyeob.kia

import com.example.gofdesignpattern.week03.jongyeob.CarPartFactory
import com.example.gofdesignpattern.week03.jongyeob.Roof
import com.example.gofdesignpattern.week03.jongyeob.Wheel

class KiaLuxuryCarPartFactory: CarPartFactory {
    override fun createWheel(): Wheel = KiaLuxuryWheel()
    override fun createRoof(): Roof = KiaLuxuryRoof()
}
