package com.example.gofdesignpattern.week12_proxy

fun interface UserCacheService {

    operator fun invoke(id: Long): User
}
