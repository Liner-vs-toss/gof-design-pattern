package com.example.gofdesignpattern.week21_strategy


class DigBot {
    fun execute(command: String): String {
        return when (command) {
            "user" -> {
                """
                    $command 실행
                    user: 1
                    gaNo: 1
                    """.trimIndent()
            }
            "지연송금" -> {
                "오픈뱅킹 지연송금: 0건, 전자금융망 지연송금: 0건"
            }
            else -> {
                throw UnsupportedOperationException("지원하지 않는 command 입니다. command: $command")
            }
        }
    }
}