package examples

fun main() {
//    arrayListDemo()
//    hashMapDemo()
//    hashMapConditionDemo()
    listRemoveIfDemo()
}

fun listRemoveIfDemo() {
    val cars = arrayListOf("BMW", "Fake Car", "Ferrari", "Ford")
    cars.removeIf { it == "Fake Car" }
    println(cars)
}

fun arrayListDemo() {
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials.sorted())
    println(imperials[0])
    println(imperials.last())
    println(imperials.contains("Emperor"))
    println(imperials)

    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0, "Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))
    rebels.remove("Han Solo")
    println(rebels)
}

fun hashMapDemo() {
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder")
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("Leiah", "This ship doesnt exist"))
    println(rebelVehiclesMap.values)

    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Landspeeder", "Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "XWing"
    rebelVehicles.put("Leiah", "Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    rebelVehicles.clear()
    println(rebelVehicles)
}

fun hashMapConditionDemo() {
    val courseMap = hashMapOf<String, Int>()

    for(i in 1..10) {
        if((courseMap.get("bla")?: 0) <= 5) {
            courseMap.put("bla", (courseMap.get("bla")?: 0) + 1)
        }
    }

    println(courseMap)
}