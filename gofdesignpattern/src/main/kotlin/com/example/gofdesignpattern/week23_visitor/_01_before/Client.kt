package com.example.gofdesignpattern.week23_visitor._01_before

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val rectangle: Shape = Rectangle()
        val device: Device = Phone()
        rectangle.printTo(device)
    }
}
