package com.example.gofdesignpattern.week10_facade

import java.time.LocalDate

class Hyundai {
    private val insuranceItems: MutableList<HyundaiInsuranceItem> = mutableListOf()

    fun setProfile(name: String, gender: Gender, birthday: LocalDate) {
        println("현대해상 가입자 프로필 정보 입력: name: $name, gender: $gender, birthday: $birthday")
    }

    fun addInsuranceItems(addedInsuranceItems: Set<HyundaiInsuranceItem>) {
        insuranceItems.addAll(addedInsuranceItems)
    }


    fun calculateAmount() {
        insuranceItems.sumOf { it.amount }
            .also { println("totalAmount: ${"%,d".format(it)}") }
    }

    fun deleteInsuranceItem(insuranceItem: HyundaiInsuranceItem) {
        insuranceItems.removeIf { it == insuranceItem }
    }

    fun join() {
        println("현대해상 보험 가입")
    }
}
