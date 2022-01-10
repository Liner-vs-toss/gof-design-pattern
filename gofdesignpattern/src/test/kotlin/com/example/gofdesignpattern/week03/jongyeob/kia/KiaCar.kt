package com.example.gofdesignpattern.week03.jongyeob.kia

import com.example.gofdesignpattern.week03.jongyeob.Car
import com.example.gofdesignpattern.week03.jongyeob.Roof
import com.example.gofdesignpattern.week03.jongyeob.Wheel

class KiaCar(
    override val wheel: Wheel,
    override val roof: Roof
) : Car
