package com.example.gofdesignpattern.week08_composite._01_before

class Bag {
    val items: MutableList<Item> = mutableListOf()

    fun add(item: Item) {
        items.add(item)
    }
}
