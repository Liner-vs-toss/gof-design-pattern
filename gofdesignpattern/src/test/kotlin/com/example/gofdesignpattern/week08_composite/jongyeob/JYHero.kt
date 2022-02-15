package com.example.gofdesignpattern.week08_composite.jongyeob

class JYHero(
    val level: Int
) {
    private val skills: MutableList<JYSkill> = mutableListOf()

    fun add(skill: JYSkill) {
        skills.add(skill)
    }

    fun action() {
        skills.firstOrNull { it.type.level == level }
            ?.use()
            ?: throw RuntimeException("스킬 발동 실패")
    }
}
