package com.example.gofdesignpattern.week23_visitor._03_kotlin

import com.example.gofdesignpattern.week23_visitor._03_kotlin.device.Device
import com.example.gofdesignpattern.week23_visitor._03_kotlin.device.Phone
import com.example.gofdesignpattern.week23_visitor._03_kotlin.shape.Rectangle
import com.example.gofdesignpattern.week23_visitor._03_kotlin.shape.Shape

object Client {
    @JvmStatic
    fun main(args: Array<String>) {
        val rectangle: Shape = Rectangle()
        val device: Device = Phone()
        rectangle.printTo(device)
    }
}
