package com.example.gofdesignpattern.week08_composite.jongyeob

class SkillHandler {
    fun handleLevel(hero: JYHero) {
        when (hero.level) {
            Type.차사.level -> 차사SKill()
            Type.살수.level -> 살수Skill()
            Type.천인.level -> 천인Skill()
            else -> {
                println("레벨 ${hero.level} 스킬이 존재하지 않습니다.")
                null
            }
        }?.let { skill ->
            hero.add(skill)
        }
    }
}
