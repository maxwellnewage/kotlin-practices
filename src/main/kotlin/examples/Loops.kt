package examples

fun main() {
//    rebelsDemo()
//    whileDemo()
    forDemo()
}

fun forDemo() {
    // 0 to 10
    for(i in 0..10) {
        println("Number is $i")
    }

    println("<=====================>")

    // 0 to 9
    for (i in 0 until 10) {
        println("Number is $i")
    }

    println("<=====================>")

    // 10 to 0
    for (i in 10 downTo 0) {
        println("Number is $i")
    }

    println("<=====================>")

    // 0 to 10 but only pairs numbers
    for (i in 0..10 step 2) {
        println("Number is $i")
    }
}

fun whileDemo() {
    var x = 10

    while (x > 0) {
        println(x)
        x--
    }
}

fun rebelsDemo() {
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")

    for(rebel in rebels) {
        println("Name: $rebel")
    }

    for ((character, vehicle) in rebelVehicles) {
        println("$character gets around in their $vehicle")
    }
}