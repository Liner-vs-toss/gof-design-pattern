package com.example.gofdesignpattern.week19_observer._04_spring

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class MyRunner(
    private val publisher: ApplicationEventPublisher
) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        publisher.publishEvent(MyEvent(this, "hello spring event"))
    }
}
