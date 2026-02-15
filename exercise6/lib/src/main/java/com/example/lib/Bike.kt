package com.example.lib

class Bike(
    brand: String,
    speed: Int,
    private val bellSound: String
) : Vehicle(brand, speed) {

    override fun honk() {
        println("rings the bell: $bellSound")
    }

}