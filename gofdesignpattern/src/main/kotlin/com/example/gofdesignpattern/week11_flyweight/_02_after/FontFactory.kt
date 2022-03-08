package com.example.gofdesignpattern.week11_flyweight._02_after

class FontFactory {
    private val cache: MutableMap<String, Font> = mutableMapOf()

    fun getFont(font: String): Font {
        if (cache.containsKey(font)) return cache[font]!!
        else {
            val newFont = Font(font.split(":")[0], Integer.parseInt(font.split(":")[1]))
            cache[font] = newFont
            return newFont
        }
    }
}
