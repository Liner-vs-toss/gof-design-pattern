package com.example.gofdesignpattern.week23_visitor._01_before

class Circle : Shape {
    override fun printTo(device: Device) {
        if (device is Phone) {
            println("print Circle to phone")
        } else if (device is Watch) {
            println("print Circle to watch")
        }
    }
}
