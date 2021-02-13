package examples

import kotlin.math.*

fun main() {
    exponentOperator()
    calculateAreaOfCircle()
    sinOfNumber()
}

private fun sinOfNumber() {
    var x: Double = 1.0/2
    var cal = sin(x * PI)
    println("sin of $x*pi = ${round(cal)}")

    x = 3.0/2
    cal = sin(x * PI)
    println("sin of $x*pi = ${round(cal)}")
}

private fun exponentOperator() {
    // Exponent operator
    //a^b
    val a: Double = 3.0
    val b = 2

    println("$a^$b: ${a.pow(b)}")
}

private fun calculateAreaOfCircle() {
    // Area of a circle with radius r
    val r = 2.3
    println("Area: ${PI * r.pow(2)}")
}
