package com.example.gofdesignpattern.week08_composite._02_after

class Client {
    fun printPrice(component: Component) {
        println(component.sumPrice())
    }
}

fun main() {

    val doranBlade = Item(name = "도란검", price= 450)
    val healPostion = Item(name = "체력 물약", price= 50)

    val bag = Bag()
    bag.add(doranBlade)
    bag.add(healPostion)

    val client = Client()
    client.printPrice(doranBlade)
    client.printPrice(bag)
}


