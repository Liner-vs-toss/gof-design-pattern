package com.example.gofdesignpattern.jongyeobsample.week12_proxy

data class JyUserCacheServiceProxy(
    private val nameCacheService: JyUserCacheService
): JyUserCacheService {
    override fun invoke(id: Long): JyUser =
        // 캐시에 있으면 그대로 반환한다.
        JyCache.getCache(id)
            ?: let {
                // 캐시에 없으면 생성 후 캐시에 넣고 반환한다.
                val user = nameCacheService(id)
                JyCache.setCache(id, user)

                return@let user
            }
}
