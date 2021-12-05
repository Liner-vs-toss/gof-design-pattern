package com.example.gofdesignpattern.woojinsample.week02

fun main() {
    val superCar = createCar(SuperCarFactory(), name = "드림카", price = 1000)
    superCar.printSelfIntroduce()

    val normalCar = createCar(NormalCarFactory(), name = "붕붕이", price = 10)
    normalCar.printSelfIntroduce()

    val normalCar2 = createCar(NormalCarFactory(), name = "부릉이", price = -1)
    normalCar.printSelfIntroduce()
}

fun createCar(carFactory: CarFactory, name: String, price:Long) =
    carFactory.createCar(name, price)
