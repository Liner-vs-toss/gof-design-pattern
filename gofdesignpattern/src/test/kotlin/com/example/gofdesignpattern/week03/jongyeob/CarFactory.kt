package com.example.gofdesignpattern.week03.jongyeob

interface CarFactory {
    fun createCar(carPartFactory: CarPartFactory): Car
}
