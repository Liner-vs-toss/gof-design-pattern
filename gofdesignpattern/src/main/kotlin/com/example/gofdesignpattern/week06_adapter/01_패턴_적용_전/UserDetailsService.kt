package com.example.gofdesignpattern.week06_adapter.`01_패턴_적용_전`

interface UserDetailsService {
    fun loadUser(userName: String): UserDetails
}
