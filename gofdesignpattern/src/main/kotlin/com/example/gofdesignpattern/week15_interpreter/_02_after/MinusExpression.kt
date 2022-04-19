package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._02_after

class MinusExpression(private val left: PostfixExpression, private val right: PostfixExpression) : PostfixExpression {
    override fun interpret(context: Map<Char?, Int?>?): Int {
        return left.interpret(context) - right.interpret(context)
    }
}