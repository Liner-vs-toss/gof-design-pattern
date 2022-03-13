package com.example.gofdesignpattern.week12_proxy._03_java

import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component

@Aspect
@Component
class PerfAspect {
    @Around("bean(gameService)")
    fun timestamp(point: ProceedingJoinPoint){
        val before = System.currentTimeMillis()
        point.proceed()
        println("걸린 시간 :${System.currentTimeMillis() - before}")
    }

    @Around("bean(tempService)")
    fun timestamp2(point: ProceedingJoinPoint){
        val before = System.currentTimeMillis()
        point.proceed()
        println("걸린 시간 :${System.currentTimeMillis() - before}")
    }
}
