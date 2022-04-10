package com.example.gofdesignpattern.week14_command.woojin

import org.junit.jupiter.api.Test

class Client {
    @Test
    fun `집에 들어가기 전에 홈 IOT를 이용해 디바이스를 켠다`() {
        // 에어컨을 켠다.
        val turnOn: Command = AirConditionerTurnOnCommand(AirConditioner())
        turnOn.execute()

        // 커튼을 친다.
        val open: Command = CurtainOpenCommand(Curtain())
        open.execute()
    }
}
