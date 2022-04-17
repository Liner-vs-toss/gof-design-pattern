package com.example.gofdesignpattern.week17_mediator._01_before

class CleaningService {

    fun clean(gym: Gym) {
        println("clean $gym")
    }

    fun getTower(guest: Guest, numberOfTower: Int) {
        println("$numberOfTower towers to $guest")
    }

    fun clean(restaurant: Restaurant) {
        println("clean $restaurant")
    }
}