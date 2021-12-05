package com.example.gofdesignpattern.woojinsample.week02

class SuperCar(
    override val name: String,
    override val price: Long,
    override val maker: String = "람보르기니",
) : AbstractCar(name, price)
