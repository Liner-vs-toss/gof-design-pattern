package com.example.gofdesignpattern.week17_mediator._02_after

import java.time.LocalDateTime

fun main() {
    val frontDesk = FrontDesk()
    val cleaningService = CleaningService()
    val restaurant = Restaurant(id = 1, name = "lotte hotel")
    frontDesk.init(restaurant = restaurant, cleaningService = cleaningService)
    cleaningService.frontDesk = frontDesk
    val guest = Guest(id = 1, name = "nathan", frontDesk = frontDesk)
    val room = Room(1)
    frontDesk.addGuestRoom(guest.id, room.id)
    frontDesk.getTowers(guest = guest, 3)
    guest.dinner(dateTime = LocalDateTime.now())
}