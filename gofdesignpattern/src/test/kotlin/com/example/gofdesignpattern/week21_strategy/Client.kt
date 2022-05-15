package com.example.gofdesignpattern.week21_strategy

import io.kotest.assertions.throwables.shouldThrowExactly
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Client {
    private val digBot = DigBot()

    @Test
    internal fun `user command가 실행되면 유저 정보를 반환한다`() {
        val actual = digBot.execute("user")
        actual shouldBe """
            user 실행
            user: 1
            gaNo: 1
        """.trimIndent()
    }

    @Test
    internal fun `지연송금 command가 실행되면 지연송금 유무를 반환한다`() {
        val actual = digBot.execute("지연송금")
        actual shouldBe "오픈뱅킹 지연송금: 0건, 전자금융망 지연송금: 0건"
    }

    @Test
    internal fun `지원하지 않는 command면 에러를 발생한다`() {
        val command = "unknown"
        shouldThrowExactly<UnsupportedOperationException> {
            digBot.execute(command)
        }.run {
            message shouldBe "지원하지 않는 command 입니다. command: $command"
        }
    }
}