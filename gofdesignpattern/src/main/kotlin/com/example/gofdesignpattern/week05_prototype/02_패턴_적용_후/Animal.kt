package com.example.gofdesignpattern.week05_prototype.`02_패턴_적용_후`

data class Animal(
    private val name: String,
    private val age: Int,
    private val species: String,
    val hospital: Hospital,
)

data class Hospital(
    private val name: String,
    private val phoneNumber: String,
)
