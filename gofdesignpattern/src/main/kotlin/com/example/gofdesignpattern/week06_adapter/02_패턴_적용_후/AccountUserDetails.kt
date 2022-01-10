package com.example.gofdesignpattern.week06_adapter.`02_패턴_적용_후`

class AccountUserDetails(
    private val account: Account
) : UserDetails {
    override fun getUserName(): String = account.userName

    override fun getPassword(): String = account.password
}
