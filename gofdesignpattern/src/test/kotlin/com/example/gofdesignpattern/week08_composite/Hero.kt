package com.example.gofdesignpattern.week08_composite

data class Hero(
    val level: Int,
    val skillA: Skill,
    val skillB: Skill,
    val skillC: Skill,
    val skillD: Skill,
) {

    fun operation() {
        if (level == 1) {

        } else if (level == 2) {

        } else if (level == 3) {

        } else if (level == 4) {

        }
    }
}
