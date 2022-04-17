package com.example.gofdesignpattern.week17_mediator._02_after

class CleaningService {
    lateinit var frontDesk: FrontDesk

    fun getTowers(guestId: Long, numberOfTowers: Int) {
        val roomNumber = frontDesk.getRoomNumberFor(guestId)
        println("provide $numberOfTowers to $roomNumber");
    }
}