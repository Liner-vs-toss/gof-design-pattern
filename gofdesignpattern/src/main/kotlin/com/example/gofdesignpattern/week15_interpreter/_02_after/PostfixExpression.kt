package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._02_after

interface PostfixExpression {
    fun interpret(context: Map<Char?, Int?>?): Int
}