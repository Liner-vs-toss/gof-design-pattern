package com.example.gofdesignpattern.jongyeobsample.week12._02_after

/**
 * 부가적인 일들은 프록시에서 수행한다.
 */
class GameServiceProxy(
    private val gameService: GameServiceInterface
): GameServiceInterface {
    override fun startGame() {
        val before: Long = System.currentTimeMillis()
        gameService.startGame()
        println(System.currentTimeMillis() - before)
    }
}
