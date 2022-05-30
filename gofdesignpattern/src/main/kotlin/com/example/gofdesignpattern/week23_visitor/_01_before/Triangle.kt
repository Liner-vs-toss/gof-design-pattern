package com.example.gofdesignpattern.week23_visitor._01_before

class Triangle : Shape {
    override fun printTo(device: Device) {
        if (device is Phone) {
            println("print Triangle to Phone")
        } else if (device is Watch) {
            println("print Triangle to Watch")
        }
    }
}
