package examples

import models.Person

fun main() {
    lambdaForEachDemo()
    sumByDemo()
}

private fun sumByDemo() {
    // You can also sum up properties of collections of objects by using sumBy:
    val theDoeFamily = listOf(
        Person("John", "Doe", 30),
        Person("Jane", "Doe", 31),
        Person("Junior", "Doe", 2),
    )
    val totalAge = theDoeFamily.sumBy { it.age }
    println("The total of the Doe family's ages is $totalAge")
}

private fun lambdaForEachDemo() {
    val arr: IntArray = intArrayOf(1,1,1)
    var sumA = 0

    arr.forEach { i -> sumA += i }

    println(sumA)

    // Alternatively:
    println(arr.sum())
}