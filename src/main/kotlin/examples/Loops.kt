package examples

fun main() {
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")

    for(rebel in rebels) {
        println("Name: $rebel")
    }

    for ((character, vehicle) in rebelVehicles) {
        println("$character gets around in their $vehicle")
    }

    var x = 10

    while (x > 0) {
        println(x)
        x--
    }
}