package com.example.gofdesignpattern.week06_adapter.`01_패턴_적용_전`

class Account(
    val userName: String,
    val password: String,
    val email: String
) {
    constructor(userName: String): this(
        userName = userName,
        password = userName,
        email = userName
    )
}
