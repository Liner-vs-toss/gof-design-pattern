package com.example.gofdesignpattern.jongyeobsample.week03.실무_적용

import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory

fun main() {
    val factory: DocumentBuilderFactory = DocumentBuilderFactory.newInstance()
    val builder: DocumentBuilder =  factory.newDocumentBuilder() // xml 파일로부터 문서를 생성
    val document = builder.parse("src/main/resources/config.xml")
    println(document.documentElement)
}
