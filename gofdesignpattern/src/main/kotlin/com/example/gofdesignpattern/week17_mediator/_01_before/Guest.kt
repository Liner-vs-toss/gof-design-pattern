package com.example.gofdesignpattern.week17_mediator._01_before

data class Guest(
    val id: Long,
    val name: String,
    val restaurant: Restaurant,
) {
    private val cleaningService: CleaningService = CleaningService()

    fun dinner() {
        restaurant.dinner(this)
    }

    fun getTower(numberOfTower: Int) {
        cleaningService.getTower(this, numberOfTower)
    }
}