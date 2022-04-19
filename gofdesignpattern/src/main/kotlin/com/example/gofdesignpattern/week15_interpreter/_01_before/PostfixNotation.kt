package com.example.gofdesignpattern.week15_interpreter._01_before

import java.util.Stack


class PostfixNotation(private val expression: String) {
    private fun calculate() {
        val numbers = Stack<Int>()
        for (c in expression.toCharArray()) {
            when (c) {
                '+' -> numbers.push(numbers.pop() + numbers.pop())
                '-' -> {
                    val right = numbers.pop()
                    val left = numbers.pop()
                    numbers.push(left - right)
                }
                else -> numbers.push((c.toString() + "").toInt())
            }
        }
        println(numbers.pop())
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val postfixNotation = PostfixNotation("123+-")
            postfixNotation.calculate()
        }
    }
}
