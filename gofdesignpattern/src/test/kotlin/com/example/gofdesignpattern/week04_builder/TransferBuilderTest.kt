package com.example.gofdesignpattern.week04_builder

import io.kotest.assertions.throwables.shouldThrowAny
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeSameInstanceAs
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TransferBuilderTest {

    @Test
    fun `toBankCode가 92면 TossBankTransfer가 생성된다`() {
        val transfer = DefaultTransferBuilder()
            .bankCode(10, 92)
            .name("강우진")
            .amount(1)
            .summary("테스트")
            .createTransfer()

        assertThat(transfer).isInstanceOf(TossBankTransfer::class.java)
    }

    @Test
    fun `toBankCode가 92가 아니면 AnotherBankTransfer가 생성된다`() {
        val transfer = DefaultTransferBuilder()
            .bankCode(10, 88)
            .name("강우진")
            .amount(1)
            .summary("테스트")
            .createTransfer()

        assertThat(transfer).isInstanceOf(AnotherBankTransfer::class.java)
    }

    @Test
    fun `summary를 입력안한 경우 summary에 name이 적용된다`() {
        val transfer = DefaultTransferBuilder()
            .bankCode(10, 92)
            .name("강우진")
            .amount(1)
            .createTransfer()

        transfer.summary shouldBe transfer.name
    }

    @Test
    fun `amount가 0보다 작은 경우 RuntimeException이 발생한다`() {
        shouldThrowAny {
            DefaultTransferBuilder()
                .bankCode(10, 92)
                .name("강우진")
                .amount(-1)
                .createTransfer()
        }
    }

    @Test
    fun `name 10글자를 초과한 경우 RuntimeException이 발생한다`() {
        shouldThrowAny {
            DefaultTransferBuilder()
                .name("가나다라마바사아차카타파하")
                .bankCode(10, 92)
                .amount(4)
                .createTransfer()
        }
    }
}
