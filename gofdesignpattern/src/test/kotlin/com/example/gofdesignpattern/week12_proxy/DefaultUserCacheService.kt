package com.example.gofdesignpattern.week12_proxy

class DefaultUserCacheService: UserCacheService {
    override fun invoke(id: Long): User {
        Thread.sleep(1000L)
        return User(id, "name", 17)
    }
}
