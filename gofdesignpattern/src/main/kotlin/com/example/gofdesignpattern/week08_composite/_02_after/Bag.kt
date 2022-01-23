package com.example.gofdesignpattern.week08_composite._02_after

class Bag: Component {
    private val items: MutableList<Component> = mutableListOf()

    fun add(item: Component) {
        items.add(item)
    }

    override fun sumPrice(): Long =
        items.sumOf { it.sumPrice() }
}
