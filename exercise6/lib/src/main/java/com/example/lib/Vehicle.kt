package com.example.lib

open class Vehicle(
    val brand: String,
    private var speed: Int
) {
    fun accelerate() {
        speed += 10
        println("$brand speeds up to $speed km/h")
    }

    open fun honk() {
        println("Beep!")
    }

    open fun update() {
        println("Update")
    }

    fun getSpeed(): Int = speed
}