package com.example.gofdesignpattern.week23_visitor._02_after

interface Device {
    fun print(circle: Circle)

    fun print(rectangle: Rectangle)

    fun print(triangle: Triangle)
}
