package com.example.gofdesignpattern.week17_mediator._01_before

class Gym(
    val id: Long,
    val name: String,
){
    private val cleaningService: CleaningService = CleaningService()

    fun clean() {
        cleaningService.clean(this)
    }
}