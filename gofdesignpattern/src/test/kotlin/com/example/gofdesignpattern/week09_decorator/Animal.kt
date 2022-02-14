package com.example.gofdesignpattern.week09_decorator

class InspectionService(
    val catInspection: CatInspection
) {
    fun inspection(cat: Cat): InspectionResult {
        return catInspection.inspection(cat)
    }
}

class DetailedCatInspection : CatInspection() {
    override fun inspection(cat: Cat): InspectionResult {

        return InspectionResult(
            cat.sleepHour > 20,
            cat.walk,
            cat.blackSpotOnTooth,
            cat.dailyWaterAmount < 120
        )
    }
}

open class CatInspection {
    open fun inspection(cat: Cat): InspectionResult {
        return InspectionResult(true)
    }
}

data class InspectionResult(
    val muchSleep: Boolean = false,
    val unnecessaryWalk: Boolean = false,
    val toothDecay: Boolean = false,
    val lessWater: Boolean = false,
)

data class Cat(
    val needDetailedInspection: Boolean,
    val sleepHour: Int,
    val walk: Boolean = false,
    val blackSpotOnTooth: Boolean = false,
    val dailyWaterAmount: Int
)
