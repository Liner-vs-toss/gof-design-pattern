package com.example.gofdesignpattern.week02_factory_method.`01_패턴_적용_전`

import com.example.gofdesignpattern.week02_factory_method.`00_공통`.Ship

class DefaultShipFactory {
    companion object {
        fun orderShip(name: String?, email: String?): Ship {
            // -----------부터----------- 변경이 발생하지 않는 부분
            // validate
            require(!name.isNullOrBlank()) { "배 이름을 지어주세요." }
            require(!email.isNullOrBlank()) { "연락처를 남겨주세요." }

            prepareFor(name)
            // -----------까지----------- 변경이 발생하지 않는 부분

            // -----------부터----------- 변경이 발생하는 부분
            val ship = Ship()
            ship.name = name

            // customizing for specific name
            if (name == "whiteship") {
                ship.logo = "▣"
            } else if (name == "blackship") {
                /**
                 * 변경에 열려 있는 구조
                 * blackship 을 추가하기 위해 기존 코드를 수정해야 한다.
                 */
                ship.logo = "▢"
            }

            // coloring
            if (name == "whiteship") {
                ship.color = "white"
            } else if (name == "blackship") {
                /**
                 * 변경에 열려 있는 구조
                 * blackship 을 추가하기 위해 기존 코드를 수정해야 한다.
                 */
                ship.color = "black"
            }
            // -----------까지----------- 변경이 발생하는 부분

            // -----------부터----------- 변경이 발생하지 않는 부분
            // notify
            sendEmailTo(email, ship)
            // -----------까지----------- 변경이 발생하지 않는 부분

            return ship
        }

        private fun prepareFor(name: String) {
            println("$name 만들 준비 중")
        }

        private fun sendEmailTo(email: String, ship: Ship) {
            println("${ship.name} 다 만들었습니다.")
        }
    }
}
