package com.example.gofdesignpattern.week22_template_method.before

fun main( ) {
    val fileProcessor = FileProcessor("number.txt");
    val result = fileProcessor.process();
    println(result);
}