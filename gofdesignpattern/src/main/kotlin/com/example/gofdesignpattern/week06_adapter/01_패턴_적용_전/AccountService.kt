package com.example.gofdesignpattern.week06_adapter.`01_패턴_적용_전`

class AccountService {
    fun findAccountByUserName(userName: String): Account =
        Account(userName)

    fun createNewAccount(account: Account) {
        // TODO("Not implemented")
    }

    fun updateAccount(account: Account) {
        // TODO("Not implemented")
    }
}
