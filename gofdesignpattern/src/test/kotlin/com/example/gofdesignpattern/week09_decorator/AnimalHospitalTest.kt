package com.example.gofdesignpattern.week09_decorator

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class AnimalHospitalTest {

    @Test
    fun `동물 진료하기`() {
        val catList = listOf(
            Cat(true, 22, true, true, 100),
            Cat(false, 22, true, true, 100),
        )

        val resultList = listOf(
            InspectionResult(true, true, true, true),
            InspectionResult(true, false, false, false),
        )

        val catInspection = CatInspection()
        val detailedCatInspection = DetailedCatInspection()

        for (i in 0..1) {
            val inspectionService = if (catList[i].needDetailedInspection) {
                InspectionService(detailedCatInspection)
            } else {
                InspectionService(catInspection)
            }
            inspectionService.inspection(catList[i]) shouldBe resultList[i]
        }
    }
}
