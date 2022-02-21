package com.example.gofdesignpattern.week10_facade


enum class Gender(val type: String) {
    MALE("남"),
    FEMALE("녀");

    override fun toString(): String = this.type
}
