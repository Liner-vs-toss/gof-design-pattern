package com.example.gofdesignpattern.week23_visitor._02_after

class Circle : Shape {
    override fun accept(device: Device) {
        device.print(this)
    }
}
