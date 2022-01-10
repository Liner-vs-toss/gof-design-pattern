package com.example.gofdesignpattern.week03.jongyeob.hyundai

import com.example.gofdesignpattern.week03.jongyeob.CarPartFactory
import com.example.gofdesignpattern.week03.jongyeob.Roof
import com.example.gofdesignpattern.week03.jongyeob.Wheel

class HyundaiLuxuryCarPartFactory: CarPartFactory {
    override fun createWheel(): Wheel = HyundaiLuxuryWheel()
    override fun createRoof(): Roof = HyundaiLuxuryRoof()
}
