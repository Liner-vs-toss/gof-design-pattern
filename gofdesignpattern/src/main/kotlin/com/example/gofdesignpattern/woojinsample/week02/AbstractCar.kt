package com.example.gofdesignpattern.woojinsample.week02

import java.lang.RuntimeException

abstract class AbstractCar(
    name: String,
    price: Long,
) : Car {
    init {
        if (name.isEmpty()) {
            throw RuntimeException("자동차 이름을 입력해주세요.")
        }
        if (price <= 0) {
            throw RuntimeException("가격은 0원보다 커야 합니다.")
        }
    }
}
