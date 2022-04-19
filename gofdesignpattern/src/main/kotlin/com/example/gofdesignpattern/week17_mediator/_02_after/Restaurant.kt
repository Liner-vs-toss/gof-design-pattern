package com.example.gofdesignpattern.week17_mediator._02_after

import java.time.LocalDateTime

data class Restaurant(
    val id: Long,
    val name: String,
) {

    fun dinner(guestId: Long, dateTime: LocalDateTime) {
        println("dinner $guestId at $dateTime")
    }
}