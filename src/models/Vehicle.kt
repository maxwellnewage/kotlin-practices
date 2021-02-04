package models

open class Vehicle(val make: String, val model: String) {
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