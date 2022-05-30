package com.example.gofdesignpattern.week23_visitor._02_after

class Watch : Device {
    override fun print(circle: Circle) {
        println("Print Circle to Watch")
    }

    override fun print(rectangle: Rectangle) {
        println("Print Rectangle to Watch")
    }

    override fun print(triangle: Triangle) {
        println("Print Triangle to Watch")
    }
}
