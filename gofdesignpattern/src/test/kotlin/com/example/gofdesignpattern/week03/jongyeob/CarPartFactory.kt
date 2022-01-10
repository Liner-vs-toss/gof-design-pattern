package com.example.gofdesignpattern.week03.jongyeob

interface CarPartFactory {
    fun createWheel(): Wheel
    fun createRoof(): Roof
}
