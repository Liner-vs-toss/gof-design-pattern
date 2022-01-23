package com.example.gofdesignpattern.week08_composite._02_after

data class Item(
    val name: String,
    val price: Long
): Component {
    override fun sumPrice(): Long =
        price
}
