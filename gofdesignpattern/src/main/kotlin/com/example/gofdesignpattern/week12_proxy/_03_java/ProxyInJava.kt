package com.example.gofdesignpattern.week12_proxy._03_java

import com.example.gofdesignpattern.week12_proxy._02_after.DefaultGameService
import com.example.gofdesignpattern.week12_proxy._02_after.GameService
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

fun main() {
    dynamicProxy()
}

internal fun dynamicProxy() {
    val gameServiceProxy = getGameServiceProxy(DefaultGameService())
    gameServiceProxy.startGame()
}
internal fun getGameServiceProxy(target: GameService): GameService {
    return Proxy.newProxyInstance(GameService::class.java.classLoader, arrayOf(GameService::class.java)
    ) { proxy, method, args ->
        return@newProxyInstance if (args == null) {
            method.invoke(target, *emptyArray())
        } else {
            method.invoke(target, args)
        }
    } as GameService
}
