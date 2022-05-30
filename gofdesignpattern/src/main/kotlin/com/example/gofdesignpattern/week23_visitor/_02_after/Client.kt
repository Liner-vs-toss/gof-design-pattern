package com.example.gofdesignpattern.week23_visitor._02_after

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val rectangle: Shape = Rectangle()
        val device: Device = Phone()
        rectangle.accept(device)
    }
}
