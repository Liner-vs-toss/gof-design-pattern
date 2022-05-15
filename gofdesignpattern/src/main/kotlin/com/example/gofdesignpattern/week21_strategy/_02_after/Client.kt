package com.example.gofdesignpattern.week21_strategy._02_after

fun main() {
    val blueLightRedLight = BlueLightRedLight(Normal())

    blueLightRedLight.blueLight()
    blueLightRedLight.redLight()
}