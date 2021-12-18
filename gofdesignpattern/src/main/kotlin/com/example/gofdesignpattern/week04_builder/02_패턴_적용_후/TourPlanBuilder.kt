package com.example.gofdesignpattern.week04_builder.`02_패턴_적용_후`

import java.time.LocalDate

interface TourPlanBuilder {
    fun title(title: String): TourPlanBuilder
    fun nightsAndDays(nights: Int,days: Int): TourPlanBuilder
    fun startDate(startDate: LocalDate): TourPlanBuilder
    fun whereToStay(whereToStay: String): TourPlanBuilder
    fun addPlan(day: Int, plan: String): TourPlanBuilder
    fun getPlan(): TourPlan
}
