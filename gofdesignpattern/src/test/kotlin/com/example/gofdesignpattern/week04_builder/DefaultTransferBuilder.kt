package com.example.gofdesignpattern.week04_builder

class DefaultTransferBuilder(
    var name: String = "",
    var toBankCode: Int = 0,
    var fromBankCode: Int = 0,
    var amount: Long = 0,
    var summary: String? = null,
) : TransferBuilder {
    override fun newInstance(name: String, toBankCode: Int): TransferBuilder {
        TODO("toBankCode가 92면 TossBankTransfer를 생성 하고 그 외인 경우 AnotherBankTransfer를 생성한다")
    }

    override fun bankCode(fromBankCode: Int): TransferBuilder {
        TODO("bankCode는 항상 0보다 크고 500보다 작다")
    }

    override fun amount(amount: Long): TransferBuilder {
        TODO("amount는 0보다 커야 한다")
    }

    override fun summary(summary: String): TransferBuilder {
        TODO("적요는 10글자를 초과할 수 없다")
    }

    override fun createTransfer(): Transfer {
        TODO("summary의 값이 없는 경우 name을 summary에 셋팅 해준다")
    }
}