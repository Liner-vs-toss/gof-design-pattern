package com.example.gofdesignpattern.week06_adapter.`01_패턴_적용_전`.security

import com.example.gofdesignpattern.week06_adapter.`01_패턴_적용_전`.UserDetails
import com.example.gofdesignpattern.week06_adapter.`01_패턴_적용_전`.UserDetailsService

class LoginHandler(
    private val userDetailsService: UserDetailsService
) {

    fun login(userName: String, password: String): String {
        val userDetails: UserDetails = userDetailsService.loadUser(userName)
        return if (userDetails.getPassword() == password) userDetails.getUserName()
            else throw IllegalArgumentException()
    }
}
