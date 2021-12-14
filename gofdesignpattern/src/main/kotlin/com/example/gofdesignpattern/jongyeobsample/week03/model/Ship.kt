package com.example.gofdesignpattern.jongyeobsample.week03.model

import com.example.gofdesignpattern.jongyeobsample.week03.factory.Anchor
import com.example.gofdesignpattern.jongyeobsample.week03.factory.Wheel

open class Ship {
    lateinit var name: String
    lateinit var logo: String
    lateinit var color: String
    lateinit var anchor: Anchor
    lateinit var wheel: Wheel

    override fun toString() =
        "name: $name, logo: $logo, color: $color"
}

