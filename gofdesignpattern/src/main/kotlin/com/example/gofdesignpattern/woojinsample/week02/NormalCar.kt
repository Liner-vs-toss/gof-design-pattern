package com.example.gofdesignpattern.woojinsample.week02

class NormalCar(
    override val name: String,
    override val price: Long,
    override val maker: String = "현대",
) : AbstractCar(name, price)
