package com.example.gofdesignpattern.week04_builder.`02_패턴_적용_후`

import java.time.LocalDate

data class DefaultTourBuilder(
    var title: String = "",
    var nights: Int = 0,
    var days: Int = 0,
    var startDate: LocalDate = LocalDate.now(),
    var whereToStay: String = "",
    var detailPlans: MutableList<DetailPlan> = mutableListOf(),
) : TourPlanBuilder {

    override fun title(title: String): TourPlanBuilder {
        this.title = title
        return this
    }

    override fun nightsAndDays(nights: Int, days: Int): TourPlanBuilder {
        this.nights = nights
        this.days = days
        return this
    }

    override fun startDate(startDate: LocalDate): TourPlanBuilder {
        this.startDate = startDate
        return this
    }

    override fun whereToStay(whereToStay: String): TourPlanBuilder {
        this.whereToStay = whereToStay
        return this
    }

    override fun addPlan(day: Int, plan: String): TourPlanBuilder {
        this.detailPlans.add(DetailPlan(day, plan))
        return this
    }

    override fun getPlan(): TourPlan {
        return TourPlan(
            title = title,
            nights = nights,
            days = days,
            startDate = startDate,
            whereToStay = whereToStay,
            detailPlans = detailPlans
        )
    }
}
