package com.example.gofdesignpattern.week17_mediator._01_before

fun main() {
    val restaurant = Restaurant(1, "lotte hotel")
    val guest = Guest(1, "nathan", restaurant)
    guest.getTower(3)
    guest.dinner()
    restaurant.clean()
}