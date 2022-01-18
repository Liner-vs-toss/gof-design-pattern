package com.example.gofdesignpattern.week07_bridge.`02_패턴_적용_후`

class App {
}

fun main() {
    val 기본스킨 = DefaultSkin()
    val 정복자스킨 = 정복자()

    val 아리 = 아리(기본스킨)
    val 정복자아리 = 아리(정복자스킨)

    아리.move()
    정복자아리.move()
}
