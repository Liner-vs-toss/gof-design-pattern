package com.example.gofdesignpattern.week17_mediator._01_before

data class Restaurant(
    val id: Long,
    val name: String,
) {
    private val cleaningService: CleaningService = CleaningService()

    fun dinner(guest: Guest) {
        println("dinner $guest")
    }

    fun clean() {
        cleaningService.clean(this)
    }
}