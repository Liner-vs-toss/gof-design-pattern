package com.example.gofdesignpattern.week05_prototype.`01_패턴_적용_전`

data class Animal(
    private val name: String,
    private val age: Int,
    private val species: String,
    private val hospital: Hospital,
)


data class Hospital(
    private val name: String,
    private val phoneNumber: String,
)
