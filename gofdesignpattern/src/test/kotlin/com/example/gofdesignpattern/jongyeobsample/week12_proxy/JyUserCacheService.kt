package com.example.gofdesignpattern.jongyeobsample.week12_proxy

fun interface JyUserCacheService {

    operator fun invoke(id: Long): JyUser
}
