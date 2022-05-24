package com.example.gofdesignpattern.week22_template_method.after

import java.io.File
import java.io.IOException

abstract class FileProcessor(
    private val path: String
) {

    fun process(): Int {
        val lines = File(path).bufferedReader().readLine()
        try {
            val reader = File(path).bufferedReader()
            var result = 0
            var line: String? = reader.readLine()

            while (line != null) {
                result += getResult(result, line.toInt())
                line = reader.readLine()
            }

            return result
        } catch (e: IOException) {
            throw java.lang.IllegalArgumentException(path + "에 해당한느 파일이 없습니다.", e)
        }
    }

    abstract fun getResult(result: Int, number: Int): Int
}