package com.example.gofdesignpattern.week05_prototype.`01_패턴_적용_전`

fun main() {
    val seogongHospital = Hospital("서공동물병원", "123-4567")
    val momo = Animal("모모", 6, getSpecies(), seogongHospital)
    val mumu = Animal("무무", 6, getSpecies(), seogongHospital)

    // getSpecies()가 오래 걸리므로 시간이 오래 걸린다
}

private fun getSpecies(): String {
    // takes long time
    return "고양이"
}
