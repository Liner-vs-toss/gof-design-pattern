package com.example.gofdesignpattern.week01

fun main() {
    // val instance1 = SingletonPatternWithPrivateConstructor()
    val instance1 = SingletonPatternWithPrivateConstructor.getInstance()
    val clazz = Class.forName("com.example.gofdesignpattern.week01.SingletonPatternWithPrivateConstructor").kotlin.objectInstance

    println(instance1 == clazz)
}


class SingletonPatternLazy private constructor(){
    companion object {
        private val SingletonPatternLazyInstance: SingletonPatternLazy by lazy { SingletonPatternLazy() }

        fun getInstance(): SingletonPatternLazy {
            return SingletonPatternLazy.SingletonPatternLazyInstance
        }
    }
}

class SingletonPatternWithPrivateConstructor private constructor() {

    companion object {
        private val INSTANCE = SingletonPatternWithPrivateConstructor()

        fun getInstance(): SingletonPatternWithPrivateConstructor {
            return INSTANCE
        }
    }
}

class SingletonPatternWithPrivateConstructor2 private constructor() {

    companion object {
        private val INSTANCE = SingletonPatternWithPrivateConstructor2()

        fun getInstance(): SingletonPatternWithPrivateConstructor2 {
            return INSTANCE
        }
    }
}

class SingletonPatternDoubleCheckedLocking private constructor() {

    companion object {

        @Volatile
        private var INSTANCE: SingletonPatternDoubleCheckedLocking? = null

        fun getInstance(): SingletonPatternDoubleCheckedLocking =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: SingletonPatternDoubleCheckedLocking().also { INSTANCE = it }
            }
    }
}

class SingletonPatternLateInit private constructor() {


    companion object {

        private lateinit var instance: SingletonPatternLateInit

        fun getInstance(): SingletonPatternLateInit{
            if(instance == null){
                instance = SingletonPatternLateInit()
            }
            return instance
        }

    }
}

class SingletonPatternWithPrivateConstructor3 private constructor(){

    companion object {
        private lateinit var INSTANCE : SingletonPatternWithPrivateConstructor3

        fun getInstance(): SingletonPatternWithPrivateConstructor3 {
            if(INSTANCE == null){
                INSTANCE = SingletonPatternWithPrivateConstructor3()
            }
            return INSTANCE
        }
    }
}

object SingletonPatternWithObject {

}
