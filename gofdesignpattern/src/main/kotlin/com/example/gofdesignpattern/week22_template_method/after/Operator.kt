package com.example.gofdesignpattern.week22_template_method.after

fun interface Operator {
    operator fun invoke(result: Int, number: Int): Int
}