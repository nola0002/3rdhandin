package com.example.lib

class TrafficManager {
    private val vehicles: MutableList<Vehicle> = mutableListOf()

    fun register(vehicle: Vehicle) {
        vehicles.add(vehicle)
    }

    fun updateTraffic() {
        vehicles.forEach { vehicle ->
            vehicle.accelerate()
            vehicle.update()
            if (vehicle.getSpeed() > 120) {
                println("${vehicle.brand} is going too fast!")
            }
        }
    }
}