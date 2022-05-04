package com.example.gofdesignpattern.week19_observer._04_spring

import org.springframework.context.ApplicationEvent

class MyEvent(
    source: Any,
    val message: String
) : ApplicationEvent(source)    // ApplicationEvent 사용하지 않아도 무방
