package com.example.gofdesignpattern.jongyeobsample.week12_proxy

class JyDefaultUserCacheService: JyUserCacheService {
    override fun invoke(id: Long): JyUser {
        Thread.sleep(1000L)
        return JyUser(id, "name", 17)
    }
}
