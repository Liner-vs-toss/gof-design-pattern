package com.example.gofdesignpattern.week03_abstract_factory.woojin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarFactoryTest {

    @Test
    fun `normal 현재 자동차가 생성되는 것을 검증한다`() {
        val normalCar = HyundaiCarFactory(NormalWheelFactory(), NormalLoofFactory()).createCar()
        assertThat(normalCar.wheel).isInstanceOf(NormalWheel::class.java)
        assertThat(normalCar.loof).isInstanceOf(NormalLoof::class.java)
    }

    @Test
    fun `premium 현재 자동차가 생성되는 것을 검증한다`() {
        val normalCar = HyundaiCarFactory(PremiumWheelFactory(), PremiumLoofFactory()).createCar()
        assertThat(normalCar.wheel).isInstanceOf(PremiumWheel::class.java)
        assertThat(normalCar.loof).isInstanceOf(PremiumLoof::class.java)
    }
}
