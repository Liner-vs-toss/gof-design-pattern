package com.example.gofdesignpattern.week21_strategy

interface CommandStrategy {

    fun execute(command: String): String
}