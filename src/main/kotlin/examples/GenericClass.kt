package examples

import models.Axis
import models.Serial

fun main() {
//    genericInstances()
    deconstructionDeclaration()
}

private fun deconstructionDeclaration() {
    val (x,y) = Axis(12.4f, 45.2f)
    println("Coords: ($x,$y)")
}

private fun genericInstances() {
    val serialLong = Serial(231123213)
    println(serialLong.getSerial())
    val serialStr = Serial("F455")
    println(serialStr.getSerial())
}