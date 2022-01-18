package com.example.gofdesignpattern.week07_bridge.`02_패턴_적용_후`

open class DefaultChampion(val name: String, val skin: Skin) : com.example.gofdesignpattern.week07_bridge.`01_패턴_적용_전`.Champion {
    override fun move() {
        println("${skin.getName()} $name move")
    }

    override fun skillQ() {
        println("${skin.getName()} $name Q")
    }

    override fun skillW() {
        println("${skin.getName()} $name W")
    }

    override fun skillE() {
        println("${skin.getName()} $name E")
    }

    override fun skillR() {
        println("${skin.getName()} $name R")
    }


}
