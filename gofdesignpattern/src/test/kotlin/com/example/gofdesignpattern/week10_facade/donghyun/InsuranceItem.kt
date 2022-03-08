package com.example.gofdesignpattern.week10_facade.donghyun

enum class InsuranceType {
    가성비,
    필수,
    부자형
}

enum class HyundaiInsuranceItem(val amount: Int) {
    현대_웃음_특약(10),
    현대_행복_특약(100),
    현대_건강_특약(1_000),
    현대_기쁨_특약(2_000),
    현대_화목_특약(30_000),
    현대_가족_특약(50_000)
}

enum class MeritzInsuranceItem(val amount: Int) {
    메리츠_웃음_특약(5),
    메리츠_행복_특약(10),
    메리츠_건강_특약(1_500),
    메리츠_기쁨_특약(1_600),
    메리츠_화목_특약(10_000),
    메리츠_가족_특약(25_000)
}
