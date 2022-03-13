package com.example.gofdesignpattern.week12_proxy._03_java

import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class App {
    @Bean
    fun applicationRunner(gameService: GameService, tempService: TempService): ApplicationRunner {
        return ApplicationRunner {
            gameService.startGame()
            tempService.invoke()
        }
    }

    @Bean
    fun tempService(): TempService = TempService.Default()

}

fun main(args: Array<String>) {
    val app = SpringApplication(App::class.java)
    app.webApplicationType = WebApplicationType.NONE
    app.run(*args)
}

