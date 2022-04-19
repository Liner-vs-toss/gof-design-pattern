package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._02_after

import java.util.Stack

object PostfixParser {
    fun parse(expression: String): PostfixExpression {
        val stack = Stack<PostfixExpression>()
        for (c in expression.toCharArray()) {
            stack.push(getExpression(c, stack))
        }
        return stack.pop()
    }

    private fun getExpression(c: Char, stack: Stack<PostfixExpression>): PostfixExpression {
        return when (c) {
            '+' -> PlusExpression(stack.pop(), stack.pop())
            '-' -> {
                val right = stack.pop()
                val left = stack.pop()
                MinusExpression(left, right)
            }
            else -> VariableExpression(c)
        }
    }
}