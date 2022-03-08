package com.example.gofdesignpattern.week10_facade.donghyun

import java.time.LocalDate

class Meritz {
    private val insuranceItems: MutableList<MeritzInsuranceItem> = mutableListOf()

    fun setProfile(name: String, gender: Gender, birthday: LocalDate) {
        println("메리츠화재 가입자 프로필 정보 입력: name: $name, gender: $gender, birthday: $birthday")
    }

    fun addInsuranceItems(addedInsuranceItems: Set<MeritzInsuranceItem>) {
        insuranceItems.addAll(addedInsuranceItems)
    }

    fun deleteInsuranceItem(insuranceItem: MeritzInsuranceItem) {
        insuranceItems.removeIf { it == insuranceItem }
    }

    fun calculateAmount() {
        insuranceItems.sumOf { it.amount }
            .also { println("totalAmount: ${"%,d".format(it)}") }
    }

    fun join() {
        println("메리츠화재 보험 가입")
    }
}
