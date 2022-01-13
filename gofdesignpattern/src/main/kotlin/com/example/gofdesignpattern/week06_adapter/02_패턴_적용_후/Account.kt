package com.example.gofdesignpattern.week06_adapter.`02_패턴_적용_후`

/**
 * Adaptee
 */
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
