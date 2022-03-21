package com.example.gofdesignpattern.jongyeobsample.week12_proxy

object JyCache {
    private val cache: MutableMap<Long, JyUser> = mutableMapOf()

    fun setCache(id: Long, user: JyUser) {
        cache[id] = user
    }

    fun getCache(id: Long): JyUser? = cache[id]

    fun deleteCache(id: Long): JyUser =
        cache.remove(id) ?: throw RuntimeException("캐시에 존재하지 않는 데이터입니다.")
}
