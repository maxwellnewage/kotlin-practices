package models

class Truck(make: String, model: String): Vehicle(make, model) {
    override fun accelerate() {
        super.accelerate() // call parent method
        println("grooom")
    }

    fun tow() {
        println("headed out to the mountains")
    }
}