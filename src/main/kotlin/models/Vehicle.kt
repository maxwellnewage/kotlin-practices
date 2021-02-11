package models

import interfaces.OnVehicleState

abstract class Vehicle(val make: String, val model: String) : OnVehicleState {
    open fun accelerate() {
        println("vrooom")
    }

    fun park() {
        println("parking...")
    }

    fun brake() {
        println("STOP")
    }
}