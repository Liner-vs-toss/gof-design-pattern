package com.example.gofdesignpattern.week23_visitor._03_kotlin.shape

import com.example.gofdesignpattern.week23_visitor._03_kotlin.device.Device

interface Shape {
    fun printTo(device: Device)
}
