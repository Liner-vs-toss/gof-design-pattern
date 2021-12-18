package com.example.gofdesignpattern.week03_abstract_factory.woojin

class PremiumLoofFactory: LoofFactory {
    override fun createLoof(): Loof {
        return PremiumLoof()
    }
}
