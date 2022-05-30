package com.example.gofdesignpattern.week23_visitor._03_kotlin.shape

import com.example.gofdesignpattern.week23_visitor._03_kotlin.device.Device
import com.example.gofdesignpattern.week23_visitor._03_kotlin.device.Phone
import com.example.gofdesignpattern.week23_visitor._03_kotlin.device.Watch

class Triangle : Shape {
    override fun printTo(device: Device) {
        if (device is Phone) {
            println("print Triangle to Phone")
        } else if (device is Watch) {
            println("print Triangle to Watch")
        }
    }
}
