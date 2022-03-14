package com.example.gofdesignpattern.week12_proxy

data class UserCacheServiceProxy(
    private val nameCacheService: UserCacheService
): UserCacheService {
    override fun invoke(id: Long): User {
        TODO("Not yet implemented")
    }
}
