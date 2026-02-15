package com.example.lib


fun main() {
    val manager = TrafficManager()
    manager.register(Car("Toyota", 50, fuelLevel = 80))
    manager.register(Bike("Giant", 20, bellSound = "Ring ring!"))
    manager.updateTraffic()
}
