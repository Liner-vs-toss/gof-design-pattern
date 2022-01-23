package com.example.gofdesignpattern.week06_adapter.woojin

class KaKaoReaderAdapter(
    val kakaoReader: KakaoReader
): Reader {
    override fun read(card: TossBankCard, amount: Long) {
        kakaoReader.kakaoPay(card, amount)
    }
}
