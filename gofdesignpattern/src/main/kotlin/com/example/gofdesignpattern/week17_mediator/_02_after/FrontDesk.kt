package com.example.gofdesignpattern.week17_mediator._02_after

import java.time.LocalDateTime

class FrontDesk {
    private lateinit var restaurant: Restaurant
    private lateinit var cleaningService: CleaningService

    private var guestRoom = mutableMapOf<Long, Long>()

    fun init(restaurant: Restaurant, cleaningService: CleaningService) {
        this.restaurant = restaurant
        this.cleaningService = cleaningService
    }

    fun getTowers(guest: Guest, numberOfTowers: Int) {
        cleaningService.getTowers(guest.id, numberOfTowers)
    }

    fun addGuestRoom(guestId: Long, roomId : Long) {
        guestRoom[guestId] = roomId
    }
    fun getRoomNumberFor(guestId: Long): Long? {
        return guestRoom[guestId]
    }
    fun dinner(guest: Guest, dateTime: LocalDateTime) {
        restaurant.dinner(guest.id, dateTime)
    }
}