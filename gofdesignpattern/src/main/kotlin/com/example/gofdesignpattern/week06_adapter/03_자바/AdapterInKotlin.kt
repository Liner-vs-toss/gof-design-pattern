package com.example.gofdesignpattern.week06_adapter.`03_자바`

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.util.Arrays
import java.util.Collections
import java.util.Enumeration

fun main() {
    // 1.Collections
    // 인터페이스
    // 1.Collections
    // 인터페이스. asList
    val strings: List<String> = listOf("a", "b", "c")
    // Enumeration : Target 인터페이스
    // Collections.enumeration : 어댑터
    // string : 어댑티
    val enumeration: Enumeration<String> = Collections.enumeration(strings)
    val list: ArrayList<String> = Collections.list(enumeration)

    // 2. IO
    // 문자열 => InputStream
    // InputStream => InputStreamReader
    // InputStreamReader => BufferedReader
    try {
        val `is`: InputStream = FileInputStream("input.txt")
        val isr = InputStreamReader(`is`)
        val reader = BufferedReader(isr)
        while (reader.ready()) {
            println(reader.readLine())
        }
    } catch (e: IOException) {
        throw RuntimeException(e)
    }
}
/** 자바
public static void main(String[] args) {
// 1.Collections
// 인터페이스
List<String> strings = Arrays.asList("a", "b", "c");
// Enumeration : Target 인터페이스
// Collections.enumeration : 어댑터
// string : 어댑티
Enumeration<String> enumeration = Collections.enumeration(strings);
ArrayList<String> list = Collections.list(enumeration);

// 2. IO
// 문자열 => InputStream
// InputStream => InputStreamReader
// InputStreamReader => BufferedReader
try {
InputStream is = new FileInputStream("input.txt");
InputStreamReader isr = new InputStreamReader(is);
BufferedReader reader = new BufferedReader(isr);
while(reader.ready()) {
System.out.println(reader.readLine());
}
} catch (IOException e) {
throw new RuntimeException(e);
}
}
 */
