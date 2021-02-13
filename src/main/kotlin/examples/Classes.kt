package examples

import components.Button
import models.Car
import models.Person
import models.Truck

fun main() {
//    classesDemo()
//    compontentButtonDemo()
//    SAMDemo()

    dataClassDemo()
}

private fun dataClassDemo() {
    // Classes that are just meant to hold data can be defined as "data classes". They get a copy() function
    // plus toString() and other niceties.
    val johnDoe = Person("John", "Doe", 35)
    println(johnDoe)

    val olderJohnDoe = johnDoe.copy(age = 36)
    println("It's John's birthday! He used to be $johnDoe but is now $olderJohnDoe!")
}

private fun classesDemo() {
    val tesla = Car("Tesla", "A-45", "Red")
    tesla.move()
    tesla.accelerate()
    tesla.stop()

    val truck = Truck("Toyota", "Avalon")
    truck.accelerate()
}

private fun compontentButtonDemo() {
    val okButton = Button("OK")

    okButton.setOnClickListener(object: Button.OnClickListener {
        override fun onClick() {
            println("this is a click action!")
        }
    })

    okButton.press()
}

private fun SAMDemo() {
    // syntax for SAM interfaces is only possible when the interface is written in Java
    // or if using Kotlin 1.4+ the interface must be defined as a "fun interface"
    //
    // https://stackoverflow.com/questions/56557625/how-can-i-call-an-interface-in-kotlin
    // https://kotlinlang.org/docs/reference/whatsnew14.html#sam-conversions-for-kotlin-interfaces
    //    okButton.setOnClickListener {
    //        println("this is a click action!")
    //    }
}