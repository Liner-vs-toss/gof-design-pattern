package com.example.gofdesignpattern.week08_composite.jongyeob

interface JYSkill {
    val type: Type

    fun use() {
        println("스킬 발동 : ${type.name}")
    }
}

class 차사SKill(override val type: Type = Type.차사) : JYSkill

class 살수Skill(override val type: Type = Type.살수): JYSkill

class 천인Skill(override val type: Type = Type.천인): JYSkill
