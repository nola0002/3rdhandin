package com.example.lib

class Car(
    brand: String,
    speed: Int,
    private var fuelLevel: Int
) : Vehicle(brand, speed) {

    override fun honk() {
        println("$brand goes: HONK HONK!")
    }

    override fun update() {
        fuelLevel -= 5
        println("fuel left: $fuelLevel")
    }
}
