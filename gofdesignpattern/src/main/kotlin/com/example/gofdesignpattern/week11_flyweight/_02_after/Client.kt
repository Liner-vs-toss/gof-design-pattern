package com.example.gofdesignpattern.week11_flyweight._02_after

class Client {
    fun main() {
        val fontFactory = FontFactory()
        val c1 = Character('h', "white", fontFactory.getFont("Nanum:10"))
        val c2 = Character('e', "white", fontFactory.getFont("Nanum:10"))
        val c3 = Character('l', "white", fontFactory.getFont("Nanum:10"))
        val c4 = Character('l', "white", fontFactory.getFont("Nanum:10"))
        val c5 = Character('o', "white", fontFactory.getFont("Nanum:10"))
    }
}
