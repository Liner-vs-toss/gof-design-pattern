package com.example.gofdesignpattern.week20_state

fun main() {
    val tossUser = User(UserStatus.토스고객)
    val serviceUser = User(UserStatus.서비스고객)
    val accountUser = User(UserStatus.거래고객)

    tossUser.leave()
    serviceUser.leave()
    accountUser.leave()
}
