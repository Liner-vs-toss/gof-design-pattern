package com.example.gofdesignpattern.week01_singleton

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.jvm.internal.Reflection
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.primaryConstructor
import kotlin.reflect.jvm.isAccessible


class WoojinSingletonTest {
    @Test
    fun singleton() {
        val actual = WoojinSingleton01.getInstance()
        assertThat(actual).isEqualTo(WoojinSingleton01.getInstance())
    }

    @Test
    fun breakSingleton() {
        val kClass = WoojinBreakSingleton01::class
        kClass.primaryConstructor?.apply {
            isAccessible = true
        }
        val createInstance = kClass.createInstance()

        val actual = Reflection.createKotlinClass(WoojinBreakSingleton01::class.java)

        assertThat(actual).isNotEqualTo(WoojinBreakSingleton01.getInstance())
        assertThat(createInstance).isNotEqualTo(WoojinBreakSingleton01.getInstance())
        assertThat(createInstance).isNotEqualTo(actual)
    }

}

class WoojinSingleton01 private constructor() {

    companion object{
        private val woojinSingleton01 : WoojinSingleton01 by lazy { WoojinSingleton01() }
        fun getInstance() : WoojinSingleton01 {
            return woojinSingleton01
        }
    }
}


class WoojinBreakSingleton01 private constructor() {
    companion object{
        private val woojinBreakSingleton01 : WoojinBreakSingleton01 by lazy { WoojinBreakSingleton01() }
        fun getInstance() : WoojinBreakSingleton01 {
            return woojinBreakSingleton01
        }
    }
}
