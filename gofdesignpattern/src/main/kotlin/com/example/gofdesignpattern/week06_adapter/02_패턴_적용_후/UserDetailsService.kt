package com.example.gofdesignpattern.week06_adapter.`02_패턴_적용_후`

/**
 * Targe
 */
interface UserDetailsService {
    fun loadUser(userName: String): UserDetails
}
