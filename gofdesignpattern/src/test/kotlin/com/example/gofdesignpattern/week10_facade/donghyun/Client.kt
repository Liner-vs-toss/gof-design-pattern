package com.example.gofdesignpattern.week10_facade.donghyun

import java.time.LocalDate
import org.junit.jupiter.api.Test

class Client {
    @Test
    fun `before 메리츠화재 보험에 가입한다`() {
        val meritz = Meritz()
        meritz.setProfile("김토스", Gender.MALE, LocalDate.now())
        meritz.addInsuranceItems(
            setOf(
                MeritzInsuranceItem.메리츠_웃음_특약,
                MeritzInsuranceItem.메리츠_건강_특약,
                MeritzInsuranceItem.메리츠_가족_특약
            )
        )
        meritz.calculateAmount()
        println("비싸다")
        meritz.deleteInsuranceItem(MeritzInsuranceItem.메리츠_가족_특약)
        meritz.calculateAmount()
        meritz.join()
    }

    @Test
    fun `before 현대해상 보험에 가입한다`() {
        val hyundai = Hyundai()
        hyundai.setProfile("김토스", Gender.MALE, LocalDate.now())
        hyundai.addInsuranceItems(
            setOf(
                HyundaiInsuranceItem.현대_웃음_특약,
                HyundaiInsuranceItem.현대_기쁨_특약,
                HyundaiInsuranceItem.현대_화목_특약
            )
        )
        hyundai.calculateAmount()
        println("좀 더 좋은 거")
        hyundai.deleteInsuranceItem(HyundaiInsuranceItem.현대_웃음_특약)
        hyundai.addInsuranceItems(setOf(HyundaiInsuranceItem.현대_가족_특약))
        hyundai.calculateAmount()
        hyundai.join()
    }

    @Test
    fun `after 메리츠화재 맞춤 추천으로 가입한다`() {
        val profile = InsuranceProfile("김동현", Gender.MALE, LocalDate.now())
        val meritz: InsuranceFacade = MeritzInsuranceFacade()
        meritz.맞춤_가입부터_보험료_계산까지_한번에(profile,InsuranceType.가성비)
    }

    @Test
    fun `after 현대해상 맞춤 추천으로 가입한다`() {
        val profile = InsuranceProfile("김종엽", Gender.MALE, LocalDate.now())
        val hyundai: InsuranceFacade = HyundaiInsuranceFacade()
        hyundai.맞춤_가입부터_보험료_계산까지_한번에(profile,InsuranceType.부자형)

    }
}
