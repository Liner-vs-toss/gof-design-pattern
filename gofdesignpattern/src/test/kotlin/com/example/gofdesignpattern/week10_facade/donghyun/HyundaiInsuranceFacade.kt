package com.example.gofdesignpattern.week10_facade.donghyun

import java.time.LocalDate

class HyundaiInsuranceFacade : InsuranceFacade {
    override fun 맞춤_가입부터_보험료_계산까지_한번에(profile: InsuranceProfile, type: InsuranceType) {
        val hyundai = Hyundai()
        hyundai.setProfile(profile.name, profile.gender, profile.birthday)
        hyundai.addInsuranceItems(
            when (type) {
                InsuranceType.가성비 -> setOf(
                    HyundaiInsuranceItem.현대_건강_특약,
                )
                InsuranceType.필수 -> setOf(
                    HyundaiInsuranceItem.현대_웃음_특약,
                    HyundaiInsuranceItem.현대_건강_특약,
                    HyundaiInsuranceItem.현대_가족_특약
                )
                InsuranceType.부자형 -> setOf(
                    HyundaiInsuranceItem.현대_웃음_특약,
                    HyundaiInsuranceItem.현대_행복_특약,
                    HyundaiInsuranceItem.현대_건강_특약,
                    HyundaiInsuranceItem.현대_기쁨_특약,
                    HyundaiInsuranceItem.현대_화목_특약,
                    HyundaiInsuranceItem.현대_가족_특약
                )
            }
        )
        hyundai.calculateAmount()
        hyundai.join()
    }

}
