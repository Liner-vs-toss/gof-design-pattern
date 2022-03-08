package com.example.gofdesignpattern.week10_facade.donghyun

/**
 * 보험 가입을 위한 퍼사드 인터페이스
 */
interface InsuranceFacade {
    fun 맞춤_가입부터_보험료_계산까지_한번에(profile: InsuranceProfile, type: InsuranceType)
}
