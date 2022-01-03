package com.example.gofdesignpattern.week05_prototype.`04_실무`

data class Animal(
    val name: String,
    val age: Int,
    val species: String,
    val hospital: Hospital,
) {

    fun deepCopy(name: String): Animal {
        val copiedHospital = Hospital(hospital.name, hospital.phoneNumber)
        return Animal(name, age, species, copiedHospital)
    }
}

data class Hospital(
    val name: String,
    val phoneNumber: String,
)
