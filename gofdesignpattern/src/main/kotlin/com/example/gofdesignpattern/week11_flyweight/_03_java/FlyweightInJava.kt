package com.example.gofdesignpattern.week11_flyweight._03_java

class FlyweightInJava {
    fun main() {

        val i1 = Integer.valueOf(10);
        val i2 = Integer.valueOf(10);

        assert(i1 == i2)

        val i3 = Integer.valueOf(129);
        val i4 = Integer.valueOf(129);

        assert(i3 == i4)
    }
}
