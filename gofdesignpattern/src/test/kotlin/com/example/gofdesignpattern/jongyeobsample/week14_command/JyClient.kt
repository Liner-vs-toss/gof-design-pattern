package com.example.gofdesignpattern.jongyeobsample.week14_command

import org.junit.jupiter.api.Test

class JyClient {
    @Test
    fun `집에 들어가기 전에 홈 IOT를 이용해 디바이스를 켠다`() {
        val button = JyButton()

        // 에어컨을 켠다.
        button.press(JyAirConditionerOnCommand(JyAirConditioner()))

        // 커튼을 친다.
        button.press(JyCurtainCloseCommand(JyCurtain()))
    }

    @Test
    fun `집을 나가기 전에 홈 IOT를 이용해 디바이스를 끊다`() {
        val button = JyButton()

        // 에어컨을 끊다.
        button.press(JyAirConditionerOffCommand(JyAirConditioner()))

        // 커튼을 걷는다.
        button.press(JyCurtainOpenCommand(JyCurtain()))
    }
}
