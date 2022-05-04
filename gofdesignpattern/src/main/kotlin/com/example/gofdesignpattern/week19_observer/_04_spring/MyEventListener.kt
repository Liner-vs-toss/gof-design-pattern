package com.example.gofdesignpattern.week19_observer._04_spring

import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
class MyEventListener : ApplicationListener<MyEvent> {
    override fun onApplicationEvent(event: MyEvent) {
        println("${event.source} | ${event.message}")
    }
}
