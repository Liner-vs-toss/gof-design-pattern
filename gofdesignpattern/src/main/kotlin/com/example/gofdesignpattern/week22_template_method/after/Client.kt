package com.example.gofdesignpattern.week22_template_method.after

fun main( ) {
    val fileProcessor = Multiply("number.txt")
    val result = fileProcessor.process()
    println(result)

    val fileProcessorCallback= FileProcessorCallback("number.txt")
    fileProcessorCallback.process { re: Int, number:Int -> re + number }
}