package com.example.gofdesignpattern.woojinsample

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class WoojinSingletonTest {
    @Test
    fun equalsSingleton01() {
        val actual = Singleton01.getInstance()

        println("first getInstance")

        assertThat(actual).isEqualTo(Singleton01.getInstance())
        println("second getInstance")
        actual.printSingleton()
    }

    @Test
    fun equalsSingleton02() {
        val actual = Singleton02.getInstance()
        println("first getInstance")
        assertThat(actual).isEqualTo(Singleton02.getInstance())
        println("second getInstance")
        actual.printSingleton()
    }

    @Test
    fun equalsSingleton03() {
        val actual = Singleton03.getInstance()
        println("first getInstance")
        assertThat(actual).isEqualTo(Singleton03.getInstance())
        println("second getInstance")
        actual.printSingleton()
    }

    @Test
    fun equalsSingleton04() {
        val actual = Singleton04
        println("first getInstance")
        assertThat(actual).isEqualTo(Singleton04)
        println("second getInstance")
        actual.printSingleton()
    }

    @Test
    fun equalsSingleton05() {
        val actual = Singleton05.getInstance()
        println("first getInstance")
        assertThat(actual).isEqualTo(Singleton05.getInstance())
        println("second getInstance")
        actual.printSingleton()
    }

    @Test
    fun equalsSingleton06() {
        val actual = Singleton06.getInstance()
        println("first getInstance")
        assertThat(actual).isEqualTo(Singleton06.getInstance())
        println("second getInstance")
        actual.printSingleton()
    }

    @Test
    fun equalsSingleton07() {
        val actual = Singleton07.INSTANCE
        println("first getInstance")
        assertThat(actual).isEqualTo(Singleton07.INSTANCE)
        println("second getInstance")
        actual.printSingleton()
    }
}

class Singleton01 private constructor() {

    init {
        println("create singleton")
    }

    fun printSingleton() {
        println("hello singleton")
    }

    companion object {
        init {
            println("companion object init")
        }

        private var instance: Singleton01? = null

        fun getInstance(): Singleton01 {
            println("getInstance")
//            if (instance == null) {
//                instance = Singleton01()
//                instance!!
//            } else {
//                instance!!
//            }
            return instance ?: Singleton01().also { instance = it }
        }

    }
}

class Singleton02 private constructor() {

    init {
        println("create singleton")
    }

    fun printSingleton() {
        println("hello singleton")
    }

    companion object {
        init {
            println("companion object init")
        }
        @Volatile
        private var instance: Singleton02? = null

        @Synchronized
        fun getInstance(): Singleton02 {
            println("getInstance")
            return instance ?: Singleton02().also { instance = it }
        }

    }
}

class Singleton03 private constructor() {

    init {
        println("create singleton")
    }

    fun printSingleton() {
        println("hello singleton")
    }

    companion object {
        init {
            println("companion object init")
        }
        @Volatile
        private var instance: Singleton03? = null

        fun getInstance(): Singleton03 {
            println("getInstance")
            return instance ?: synchronized(this) {
                instance ?: Singleton03().also { instance = it }
            }
        }

    }
}

object Singleton04 {
    init {
        println("create singleton")
    }

    fun printSingleton() {
        println("hello singleton")
    }
}

class Singleton05 private constructor() {

    init {
        println("create singleton")
    }

    fun printSingleton() {
        println("hello singleton")
    }

    companion object {
        init {
            println("companion object init")
        }
        private val instance: Singleton05 = Singleton05()
        fun getInstance(): Singleton05 {
            println("getInstance")
            return instance
        }
    }
}

class Singleton06 private constructor() {

    init {
        println("create singleton")
    }

    private class Singleton06Holder {
        init {
            println("create init singleton")
        }

        companion object {
            init {
                println("companion object init")
            }
            val instance: Singleton06 = Singleton06()
        }
    }

    fun printSingleton() {
        println("hello singleton")
    }

    companion object {
        fun getInstance(): Singleton06 {
            println("getInstance")
            return Singleton06Holder.instance
        }
    }
}

enum class Singleton07 {
    INSTANCE;

    init {
        println("create singleton")
    }

    fun printSingleton() {
        println("hello singleton")
    }
}
