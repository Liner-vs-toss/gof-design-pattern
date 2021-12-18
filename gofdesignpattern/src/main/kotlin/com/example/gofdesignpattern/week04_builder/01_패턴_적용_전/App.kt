package com.example.gofdesignpattern.week04_builder.`01_패턴_적용_전`

import java.time.LocalDate


fun main() {
    val tourPlan = TourPlan()
    tourPlan.title = "제주도 여행"
    tourPlan.nights = 2
    tourPlan.days = 3
    tourPlan.startDate = LocalDate.of(2021, 12, 23)
    tourPlan.whereToStay = "롯데 리조트"
    tourPlan.detailPlan = listOf(
        DetailPlan(0, "렌트카 대여"),
        DetailPlan(0, "갈치 먹기"),
        DetailPlan(0, "갈치 돈카츠 먹기"),
        DetailPlan(0, "리조트 가기")
    )


}
