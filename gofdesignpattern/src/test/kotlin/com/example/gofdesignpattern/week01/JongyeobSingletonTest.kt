package com.example.gofdesignpattern.week01

import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class JongyeobSingletonTest {
    @Test
    fun failedSingleton() {
        val numberOfThreads = 10
        val service = Executors.newFixedThreadPool(10)
        val latch = CountDownLatch(numberOfThreads)

        val actualInstance: FailedJongyeobSingleton01? = null
        for (i in 0 until numberOfThreads) {
            service.submit {
                println("repeat: $i, result: ${actualInstance == FailedJongyeobSingleton01.getInstance()}")
                latch.countDown()
            }
        }
    }

    @Test
    fun objectSingleton() {
        val actualInstance = ObjectJongyeobSingleton01
        repeat(100) {
            Thread {
                Thread.sleep(100)
                println("repeat: $it, result: ${actualInstance == actualInstance.getInstance()}")
            }.start()
        }
    }

    @Test
    fun breakSingleton() {
        val actualInstance = JongyeobBreakSingleton01.getInstance()
        val reflectedInstance = JongyeobBreakSingleton01::class.java.kotlin.objectInstance
        assertThat(actualInstance).isNotEqualTo(reflectedInstance)
    }

}

class FailedJongyeobSingleton01 private constructor() {
    companion object {
        private var INSTANCE : FailedJongyeobSingleton01? = null

        fun getInstance(): FailedJongyeobSingleton01 {
            if (INSTANCE == null) {
                Thread.sleep(100)
                INSTANCE = FailedJongyeobSingleton01()
            }
            return INSTANCE!!
        }
    }
}

object ObjectJongyeobSingleton01 {
    fun getInstance(): ObjectJongyeobSingleton01 = ObjectJongyeobSingleton01
}

class JongyeobBreakSingleton01() {
    companion object {

        @Volatile
        private var INSTANCE: JongyeobBreakSingleton01? = null

        fun getInstance(): JongyeobBreakSingleton01 =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: JongyeobBreakSingleton01().also { INSTANCE = it }
            }
    }
}
