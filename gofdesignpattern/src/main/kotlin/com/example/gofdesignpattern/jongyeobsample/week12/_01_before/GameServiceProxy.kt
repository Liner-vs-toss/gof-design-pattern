package com.example.gofdesignpattern.jongyeobsample.week12._01_before

import com.example.gofdesignpattern.jongyeobsample.week12._01_before.GameService

class GameServiceProxy : GameService() {
    override fun startGame() {
        val before: Long = System.currentTimeMillis()
        super.startGame()
        println(System.currentTimeMillis() - before)
    }
}
