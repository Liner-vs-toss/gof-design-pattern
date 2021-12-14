package com.example.gofdesignpattern.jongyeobsample.week03.실무_적용

import com.example.gofdesignpattern.jongyeobsample.week03.model.Ship
import org.springframework.beans.factory.FactoryBean

class ShipFactory : FactoryBean<Ship> {
    override fun getObject(): Ship = Ship()
    override fun getObjectType(): Class<*> = Ship::class.java
}
