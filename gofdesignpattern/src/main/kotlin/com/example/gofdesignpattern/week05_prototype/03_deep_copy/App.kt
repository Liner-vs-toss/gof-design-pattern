package com.example.gofdesignpattern.week05_prototype.`03_deep_copy`

fun main() {
    val seogongHospital = Hospital("서공동물병원", "123-4567")
    val momo = DeepCopyAnimal("모모", 6, getSpecies(), seogongHospital)
    val mumu = momo.deepCopy("무무")
    // deep copy
    assert(momo.hospital != mumu.hospital)
}

private fun getSpecies(): String {
    // takes long time
    return "고양이"
}
