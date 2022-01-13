package com.example.gofdesignpattern.week05_prototype.`03_deep_copy`

data class DeepCopyAnimal(
    private val name: String,
    private val age: Int,
    private val species: String,
    val hospital: Hospital,
) {

    fun deepCopy(name: String): DeepCopyAnimal {
        val copiedHospital = Hospital(hospital.name, hospital.phoneNumber)
        return DeepCopyAnimal(name, age, species, copiedHospital)
    }
}

data class Hospital(
    val name: String,
    val phoneNumber: String,
)
