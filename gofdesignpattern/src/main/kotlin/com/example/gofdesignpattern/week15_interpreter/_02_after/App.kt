package me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._02_after

import java.util.Map
import me.whiteship.designpatterns._03_behavioral_patterns._15_interpreter._02_after.PostfixParser.parse

object App {
    @JvmStatic
    fun main(args: Array<String>) {
        val expression = parse("xyz+-a+")
        val result = expression.interpret(Map.of('x', 1, 'y', 2, 'z', 3, 'a', 4))
        println(result)
    }
}