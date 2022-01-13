package com.example.gofdesignpattern.week05_prototype.`04_실무`

import org.modelmapper.ModelMapper

fun main() {
    val hospital = Hospital("병원1", "phoneNumber1")
    val animalList = listOf(
        Animal("animal1", 1, "species1", hospital),
        Animal("animal2", 2, "species2", hospital),
        Animal("animal3", 3, "species3", hospital),
        Animal("animal4", 4, "species4", hospital),
        Animal("animal5", 5, "species5", hospital),
        Animal("animal6", 6, "species6", hospital),

        )

    val copiedList = listOf(animalList)

    assert(copiedList != animalList)
    assert((copiedList[0] as? Animal)?.hospital == (animalList[0]).hospital)

    // model mapper
    val animal = Animal("animal1", 1, "species1", hospital)
    val mapper = ModelMapper()

    val copiedAnimal = mapper.map(animal, Animal::class.java)

    assert(copiedAnimal.name == animal.name)
    assert(copiedAnimal.age == animal.age)
    assert(copiedAnimal.species == animal.species)
    assert(copiedAnimal.hospital == animal.hospital)
}
