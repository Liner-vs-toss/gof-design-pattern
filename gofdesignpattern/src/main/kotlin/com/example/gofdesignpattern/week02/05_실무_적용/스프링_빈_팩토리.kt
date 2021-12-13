package com.example.gofdesignpattern.week02.`05_실무_적용`

import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext

fun main() {
    val xmlFactory = ClassPathXmlApplicationContext("config.xml")
    val hello = xmlFactory.getBean("hello", String::class.java)

    val javaFactory = AnnotationConfigApplicationContext(Config::class.java)
    val hi = javaFactory.getBean("hi", String::class.java)
}
