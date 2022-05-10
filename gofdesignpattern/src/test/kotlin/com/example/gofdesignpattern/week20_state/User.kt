package com.example.gofdesignpattern.week20_state

class User(
    val state: UserStatus,
) {
    fun leave() {
        when (state) {
            UserStatus.토스고객 -> println("토스 고객 탈퇴처리 완료")
            UserStatus.서비스고객, -> {
                println("서비스고객 계정계 탈퇴요청..")
                println("서비스고객 탈퇴처리 완료" )
            }
            UserStatus.거래고객,
            -> {
                println("가입 서비스 탈퇴 가능 여부 조회..")
                println("거래고객 계정계 탈퇴요청..")
                println("거래고객 탈퇴처리 완료")

            }
        }
    }

}
