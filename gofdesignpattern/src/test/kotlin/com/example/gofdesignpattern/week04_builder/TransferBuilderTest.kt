package com.example.gofdesignpattern.week04_builder

import io.kotest.assertions.throwables.shouldThrowAny
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeSameInstanceAs
import org.junit.jupiter.api.Test

class TransferBuilderTest {

    @Test
    fun `toBankCode가 92면 TossBankTransfer가 생성된다`() {
        val transfer = DefaultTransferBuilder()
            .createTransfer()

        transfer shouldBeSameInstanceAs TossBankTransfer::class
    }

    @Test
    fun `toBankCode가 92가 아니면 AnotherBankTransfer가 생성된다`() {
        val transfer = DefaultTransferBuilder()
            .createTransfer()

        transfer shouldBeSameInstanceAs AnotherBankTransfer::class
    }

    @Test
    fun `summary를 입력안한 경우 summary에 name이 적용된다`() {
        val transfer = DefaultTransferBuilder()
            .createTransfer()

        transfer.summary shouldBe transfer.name
    }

    @Test
    fun `amount가 0보다 작은 경우 RuntimeException이 발생한다`() {
        shouldThrowAny {
            DefaultTransferBuilder()
                .amount(-1)
                .createTransfer()
        }
    }

    @Test
    fun `name 10글자를 초과한 경우 RuntimeException이 발생한다`() {
        shouldThrowAny {
            DefaultTransferBuilder()
                .name("가나다라마바사아차카타파하")
                .createTransfer()
        }
    }
}
