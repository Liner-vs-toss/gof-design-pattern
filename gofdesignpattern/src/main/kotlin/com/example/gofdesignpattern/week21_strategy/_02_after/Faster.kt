package com.example.gofdesignpattern.week21_strategy._02_after

class Faster: SpeedStrategy {
    override fun blueLight() {
        println("무궁화꽃이")
    }

    override fun redLight() {
        println("피어씀다")
    }
}