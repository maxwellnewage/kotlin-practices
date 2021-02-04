import models.Car
import models.Truck

fun main() {
    val tesla = Car("Tesla", "A-45", "Red")
    tesla.accelerate()

    val truck = Truck("Toyota", "Avalon")
    truck.accelerate()
}