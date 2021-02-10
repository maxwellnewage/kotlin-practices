package examples

import components.Button
import models.Car
import models.Truck

fun main() {
    val tesla = Car("Tesla", "A-45", "Red")
    tesla.move()
    tesla.accelerate()
    tesla.stop()

    val truck = Truck("Toyota", "Avalon")
    truck.accelerate()

    val okButton = Button("OK")

    okButton.setOnClickListener(object: Button.OnClickListener {
        override fun onClick() {
            println("this is a click action!")
        }
    })

    okButton.press()
}