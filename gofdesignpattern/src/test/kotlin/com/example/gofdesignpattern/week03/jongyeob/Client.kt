package com.example.gofdesignpattern.week03.jongyeob

import com.example.gofdesignpattern.week03.jongyeob.hyundai.HyundaiCarFactory
import com.example.gofdesignpattern.week03.jongyeob.hyundai.HyundaiLuxuryCarPartFactory
import com.example.gofdesignpattern.week03.jongyeob.hyundai.HyundaiLuxuryRoof
import com.example.gofdesignpattern.week03.jongyeob.hyundai.HyundaiLuxuryWheel
import com.example.gofdesignpattern.week03.jongyeob.hyundai.HyundaiNormalCarPartFactory
import com.example.gofdesignpattern.week03.jongyeob.hyundai.HyundaiNormalRoof
import com.example.gofdesignpattern.week03.jongyeob.hyundai.HyundaiNormalWheel
import com.example.gofdesignpattern.week03.jongyeob.kia.KiaCarFactory
import com.example.gofdesignpattern.week03.jongyeob.kia.KiaLuxuryCarPartFactory
import com.example.gofdesignpattern.week03.jongyeob.kia.KiaLuxuryRoof
import com.example.gofdesignpattern.week03.jongyeob.kia.KiaLuxuryWheel
import com.example.gofdesignpattern.week03.jongyeob.kia.KiaNormalCarPartFactory
import com.example.gofdesignpattern.week03.jongyeob.kia.KiaNormalRoof
import com.example.gofdesignpattern.week03.jongyeob.kia.KiaNormalWheel
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Client {
    @Test
    fun createHyundaiCar() {
        val hyundaiCarFactory = HyundaiCarFactory()
        val hyundaiLuxuryCar = hyundaiCarFactory.createCar(HyundaiLuxuryCarPartFactory())
        val hyundaiNormalCar = hyundaiCarFactory.createCar(HyundaiNormalCarPartFactory())

        (hyundaiLuxuryCar.wheel is HyundaiLuxuryWheel) shouldBe  true
        (hyundaiLuxuryCar.roof is HyundaiLuxuryRoof) shouldBe true

        (hyundaiNormalCar.wheel is HyundaiNormalWheel) shouldBe true
        (hyundaiNormalCar.roof is HyundaiNormalRoof) shouldBe true
    }

    @Test
    fun createKiaCar() {
        val kiaCarFactory = KiaCarFactory()
        val kiaLuxuryCar = kiaCarFactory.createCar(KiaLuxuryCarPartFactory())
        val kiaNormalCar = kiaCarFactory.createCar(KiaNormalCarPartFactory())

        (kiaLuxuryCar.wheel is KiaLuxuryWheel) shouldBe  true
        (kiaLuxuryCar.roof is KiaLuxuryRoof) shouldBe true

        (kiaNormalCar.wheel is KiaNormalWheel) shouldBe true
        (kiaNormalCar.roof is KiaNormalRoof) shouldBe true
    }
}
