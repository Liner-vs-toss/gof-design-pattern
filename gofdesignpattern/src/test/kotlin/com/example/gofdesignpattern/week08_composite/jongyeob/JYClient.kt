package com.example.gofdesignpattern.week08_composite.jongyeob

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeSameInstanceAs
import org.junit.jupiter.api.Test

internal class JYClient {

    private val skillHandler = SkillHandler()

    @Test
    fun level1_skill() {
        val hero = JYHero(1)
            .also { skillHandler.handleLevel(it) }

        hero.action()
    }

    @Test
    fun level2_skill() {
        val hero = JYHero(2)
            .also { skillHandler.handleLevel(it) }

        hero.action()
    }

    @Test
    fun level3_skill() {
        val hero = JYHero(3)
            .also { skillHandler.handleLevel(it) }

        hero.action()
    }

    @Test
    fun level4_skill() {
        val hero = JYHero(4)
            .also { skillHandler.handleLevel(it) }

        val exception = shouldThrow<RuntimeException> {
            hero.action()
        }
        exception.message shouldBe "스킬 발동 실패"
    }
}
