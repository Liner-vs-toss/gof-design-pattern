package com.example.gofdesignpattern.week21_strategy._02_after

class BlueLightRedLight(
    val speed: SpeedStrategy,
) {
    fun blueLight() {
        speed.blueLight()
    }

    fun redLight() {
        speed.redLight()
    }
}