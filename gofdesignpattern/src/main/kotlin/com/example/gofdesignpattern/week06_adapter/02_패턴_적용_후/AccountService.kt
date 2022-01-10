package com.example.gofdesignpattern.week06_adapter.`02_패턴_적용_후`

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
