package com.example.gofdesignpattern.jongyeobsample.week12_proxy

import io.kotest.matchers.longs.shouldBeGreaterThan
import io.kotest.matchers.longs.shouldBeLessThan
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import kotlin.time.ExperimentalTime
import kotlin.time.measureTime

class JyClient {

    @OptIn(ExperimentalTime::class)
    @Test
    fun `이미 저장되어 있는 이름은 캐시로부터 가져온다`() {
        val measureTime = measureTime {
            val userCacheService = JyUserCacheServiceProxy(JyDefaultUserCacheService())

            (1..10).forEach {
                val actual = userCacheService(1)

                actual.id shouldBe 1
                actual.name shouldBe "name"
                actual.age shouldBe 17
            }
        }

        println("측정 시간 : ${measureTime.inWholeSeconds}")
        measureTime.inWholeSeconds shouldBeLessThan 2
    }

    @OptIn(ExperimentalTime::class)
    @Test
    fun `저장되어 있지 않은 이름은 매번 생성된다`() {
        val measureTime = measureTime {
            val userCacheService = JyUserCacheServiceProxy(JyDefaultUserCacheService())

            (1..10).forEach {
                val actual = userCacheService(it.toLong())

                actual.id shouldBe it.toLong()
                actual.name shouldBe "name"
                actual.age shouldBe 17
            }
        }

        println("측정 시간 : ${measureTime.inWholeSeconds}")
        measureTime.inWholeSeconds shouldBeGreaterThan 9
    }
}
