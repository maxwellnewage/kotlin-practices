package models

class Car(make: String, model: String, val color: String): Vehicle(make, model) {
    override fun move() {
        println("$make is moving!")
    }

    override fun stop() {
        println("$make car stopped.")
    }
}