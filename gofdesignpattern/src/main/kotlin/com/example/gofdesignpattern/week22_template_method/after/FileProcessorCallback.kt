package com.example.gofdesignpattern.week22_template_method.after

import java.io.File
import java.io.IOException

class FileProcessorCallback(
    private val path: String
) {

    fun process(operator: Operator): Int {
        try {
            val reader = File(path).bufferedReader()
            var result = 0
            var line: String? = reader.readLine()

            while (line != null) {
                result += operator(result, line.toInt())
                line = reader.readLine()
            }

            return result
        } catch (e: IOException) {
            throw java.lang.IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e)
        }
    }
}