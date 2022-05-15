package com.example.gofdesignpattern.week21_strategy._01_before

class BlueLightRedLight(
    val speed: Int
) {
    fun blueLight() {
        if ( speed == 1) {
            println("무   궁   화   꽃   이")
        } else if (speed == 2) {
            println("무 궁 화 꽃 이")
        } else {
            println("무궁화꽃이")
        }

    }

    fun redLight() {
        if (speed == 1) {
            println("피  었  습  니  다")
        }
        else if (speed == 2) {
            println("피 었 습 니 다")
        } else {
            println("피어씀다")
        }
    }
}