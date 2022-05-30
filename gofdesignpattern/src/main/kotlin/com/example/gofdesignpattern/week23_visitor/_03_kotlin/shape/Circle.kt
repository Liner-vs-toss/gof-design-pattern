package com.example.gofdesignpattern.week23_visitor._03_kotlin.shape

import com.example.gofdesignpattern.week23_visitor._03_kotlin.device.Device
import com.example.gofdesignpattern.week23_visitor._03_kotlin.device.Phone
import com.example.gofdesignpattern.week23_visitor._03_kotlin.device.Watch

class Circle : Shape {
    override fun printTo(device: Device) {
        if (device is Phone) {
            println("print Circle to phone")
        } else if (device is Watch) {
            println("print Circle to watch")
        }
    }
}
