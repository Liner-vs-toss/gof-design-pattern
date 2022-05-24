package com.example.gofdesignpattern.week22_template_method.after

class Plus(
    path: String,
): FileProcessor(path) {
    override fun getResult(result: Int, number: Int): Int {
        return result + number
    }
}