package com.example.gofdesignpattern.week05_prototype.`02_패턴_적용_후`

fun main() {
    val seogongHospital = Hospital("서공동물병원", "123-4567")
    val momo = Animal("모모", 6, getSpecies(), seogongHospital)
    val mumu = momo.copy(name = "무무")
    // swallow copy
    assert(momo.hospital == mumu.hospital)
}

private fun getSpecies(): String {
    // takes long time
    return "고양이"
}
