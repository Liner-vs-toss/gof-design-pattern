package com.example.gofdesignpattern.week02.`00_공통`

import com.example.gofdesignpattern.week03.`02_패턴_적용_후`.*

open class Ship {
    lateinit var name: String
    lateinit var logo: String
    lateinit var color: String

    lateinit var anchor: Anchor
    lateinit var wheel: Wheel

    override fun toString() =
        "name: $name, logo: $logo, color: $color"
}

