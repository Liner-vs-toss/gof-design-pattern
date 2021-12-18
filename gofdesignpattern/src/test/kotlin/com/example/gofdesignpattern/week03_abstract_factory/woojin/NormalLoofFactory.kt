package com.example.gofdesignpattern.week03_abstract_factory.woojin

class NormalLoofFactory: LoofFactory {
    override fun createLoof(): Loof {
        return NormalLoof()
    }
}
