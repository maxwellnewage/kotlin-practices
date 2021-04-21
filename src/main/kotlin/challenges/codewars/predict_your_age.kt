package challenges.codewars

import kotlin.math.sqrt

// https://www.codewars.com/kata/5aff237c578a14752d0035ae/train/kotlin
fun main() {
    // 86
    println(predictAge(65, 60, 75, 55, 60, 63, 64, 45))
    // 79
    println(predictAge(32, 54, 76, 65, 34, 63, 64, 45))
}

fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int{
    var ageArray = arrayListOf(age1, age2, age3, age4, age5, age6, age7, age8)
    var sumAge = 0

    for (age in ageArray) {
        val multAge = age * age
        sumAge += multAge
    }

    return (sqrt(sumAge.toDouble()) / 2).toInt()
}

// Solution of defaultXYZ
fun predictAgeBetter(vararg ages: Int): Int =
    ages.map { it * it }
        .sum()
        .toDouble()
        .let { sqrt(it) }
        .div(2)
        .toInt()