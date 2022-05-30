package com.example.gofdesignpattern.week23_visitor._02_after

class Rectangle : Shape {
    override fun accept(device: Device) {
        device.print(this)
    }
}
