package com.example.gofdesignpattern.week10_facade

import java.time.LocalDate

/**
 * 보험 가입을 위한 프로필 정보
 */
class InsuranceProfile(
    val name: String,
    val gender: Gender,
    val birthday: LocalDate
)
