package com.example.gofdesignpattern.week04_builder.`01_패턴_적용_전`

import java.time.LocalDate

data class TourPlan(
    var title: String = "",
    var nights: Int = 0,
    var days: Int = 0,
    var startDate: LocalDate = LocalDate.now(),
    var whereToStay: String = "",
    var detailPlan: List<DetailPlan> = emptyList()
)

data class DetailPlan(
    var days: Int = 0,
    var plan: String = ""
)
