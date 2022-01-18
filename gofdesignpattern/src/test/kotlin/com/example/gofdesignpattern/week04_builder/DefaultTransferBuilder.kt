package com.example.gofdesignpattern.week04_builder

class DefaultTransferBuilder(
    var name: String = "",
    var toBankCode: Int = 0,
    var fromBankCode: Int = 0,
    var amount: Long = 0,
    var summary: String? = null,
) : TransferBuilder {
    override fun name(name: String): TransferBuilder {
        if (name.length > 10) {
            throw RuntimeException("이름은 10글자를 초과할 수 없습니다.")
        }
        this.name = name
        return this
    }

    override fun bankCode(fromBankCode: Int, toBankCode: Int): TransferBuilder {
        this.fromBankCode = fromBankCode
        this.toBankCode = toBankCode
        return this
    }

    override fun amount(amount: Long): TransferBuilder {
        if (amount <0) {
            throw RuntimeException("금액은 0보다 커야 합니다.")
        }
        this.amount = amount
        return this
    }

    override fun summary(summary: String): TransferBuilder {
        if (summary.length > 10) {
            throw RuntimeException("적요는 10글자를 초과할 수 없습니다.")
        }
        this.summary = summary
        return this
    }

    override fun createTransfer(): Transfer =
        if (toBankCode == 92) {
            TossBankTransfer(
                name = name,
                fromBankCode = fromBankCode,
                toBankCode = toBankCode,
                amount = amount,
                summary = summary ?: name
            )
        } else {
            AnotherBankTransfer(
                name = name,
                fromBankCode = fromBankCode,
                toBankCode = toBankCode,
                amount = amount,
                summary = summary ?: name
            )
        }
}
