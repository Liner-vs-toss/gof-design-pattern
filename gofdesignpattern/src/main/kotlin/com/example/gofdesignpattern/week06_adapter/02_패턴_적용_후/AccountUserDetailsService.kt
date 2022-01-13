package com.example.gofdesignpattern.week06_adapter.`02_패턴_적용_후`

/**
 * Adapter
 */
class AccountUserDetailsService(
    private val accountService: AccountService
) : UserDetailsService {
    override fun loadUser(userName: String): UserDetails {
        val account: Account = accountService.findAccountByUserName(userName)
        return AccountUserDetails(account)
    }
}
