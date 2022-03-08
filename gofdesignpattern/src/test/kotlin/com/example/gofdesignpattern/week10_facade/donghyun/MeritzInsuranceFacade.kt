package com.example.gofdesignpattern.week10_facade.donghyun

import java.time.LocalDate

class MeritzInsuranceFacade : InsuranceFacade {
    override fun 맞춤_가입부터_보험료_계산까지_한번에(profile: InsuranceProfile, type: InsuranceType) {
        val meritz = Meritz()
        meritz.setProfile(profile.name, profile.gender, profile.birthday)
        meritz.addInsuranceItems(
            when (type) {
                InsuranceType.가성비 -> setOf(
                    MeritzInsuranceItem.메리츠_건강_특약,
                )
                InsuranceType.필수 -> setOf(
                    MeritzInsuranceItem.메리츠_웃음_특약,
                    MeritzInsuranceItem.메리츠_건강_특약,
                    MeritzInsuranceItem.메리츠_가족_특약
                )
                InsuranceType.부자형 -> setOf(
                    MeritzInsuranceItem.메리츠_웃음_특약,
                    MeritzInsuranceItem.메리츠_행복_특약,
                    MeritzInsuranceItem.메리츠_건강_특약,
                    MeritzInsuranceItem.메리츠_기쁨_특약,
                    MeritzInsuranceItem.메리츠_화목_특약,
                    MeritzInsuranceItem.메리츠_가족_특약,
                )
            }

        )
        meritz.calculateAmount()
        meritz.join()
    }
}
