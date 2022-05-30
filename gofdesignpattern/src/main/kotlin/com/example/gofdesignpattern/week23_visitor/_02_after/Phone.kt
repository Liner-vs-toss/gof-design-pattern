package com.example.gofdesignpattern.week23_visitor._02_after

class Phone : Device {
    override fun print(circle: Circle) {
        println("Print Circle to Phone")
    }

    override fun print(rectangle: Rectangle) {
        println("Print Rectangle to Phone")
    }

    override fun print(triangle: Triangle) {
        println("Print Triangle to Phone")
    }
}
