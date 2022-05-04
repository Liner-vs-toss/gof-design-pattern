package com.example.gofdesignpattern.week19_observer._04_spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ObserverInSpring

fun main() {
    val app = SpringApplication(ObserverInSpring::class.java)
    app.webApplicationType = WebApplicationType.NONE
    app.run()
}
