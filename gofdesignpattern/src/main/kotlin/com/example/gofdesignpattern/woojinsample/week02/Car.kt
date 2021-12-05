package com.example.gofdesignpattern.woojinsample.week02

interface Car{
    val name: String
    val price: Long
    val maker: String

    fun printSelfIntroduce() = println("이번에 뽑은 $maker $name, 가격은 $price M")
}
