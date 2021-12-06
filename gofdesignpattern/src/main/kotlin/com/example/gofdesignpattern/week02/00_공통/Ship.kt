package com.example.gofdesignpattern.week02.`00_공통`

open class Ship {
    lateinit var name: String
    lateinit var logo: String
    lateinit var color: String

    override fun toString() =
        "name: $name, logo: $logo, color: $color"
}

