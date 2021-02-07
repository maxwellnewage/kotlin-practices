import components.Button
import interfaces.OnClickListener
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

    // syntax for SAM interfaces is only possible when the interface is written in Java
    // https://stackoverflow.com/questions/56557625/how-can-i-call-an-interface-in-kotlin
    okButton.setOnClickListener {
        println("this is a click action!")
    }

    okButton.press()
}