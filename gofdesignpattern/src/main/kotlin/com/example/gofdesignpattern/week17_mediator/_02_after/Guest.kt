package com.example.gofdesignpattern.week17_mediator._02_after

import java.time.LocalDateTime

data class Guest(
    val id: Long,
    val name: String,
    private val frontDesk: FrontDesk
) {

    fun dinner(dateTime: LocalDateTime) {
        frontDesk.dinner(this, dateTime)
    }

    fun getTower(numberOfTower: Int) {
        frontDesk.getTowers(this, numberOfTower)
    }
}