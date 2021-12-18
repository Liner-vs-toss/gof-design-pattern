package com.example.gofdesignpattern.week01_singleton

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class SingletonTest {
    @Test
    fun singleton() {
        val actual = Singleton01.getInstance()
        assertThat(actual).isEqualTo(Singleton01.getInstance())
    }

    @Test
    fun breakSingleton() {
        val actual = BreakSingleton01.getInstance()
        assertThat(actual).isNotEqualTo(BreakSingleton01.getInstance())
    }

}

class Singleton01 () {

    companion object{
        fun getInstance() : Singleton01 {
            // TODO :
            return Singleton01()
        }
    }
}


class BreakSingleton01 () {
    companion object{
        fun getInstance() : Singleton01 {
            // TODO :
            return Singleton01()
        }
    }
}
