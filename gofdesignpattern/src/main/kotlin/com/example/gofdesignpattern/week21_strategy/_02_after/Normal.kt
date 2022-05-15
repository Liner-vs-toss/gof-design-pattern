package com.example.gofdesignpattern.week21_strategy._02_after

class Normal: SpeedStrategy {
    override fun blueLight() {
        println("무 궁 화 꽃 이")
    }

    override fun redLight() {
        println("피 었 습 니 다")
    }
}