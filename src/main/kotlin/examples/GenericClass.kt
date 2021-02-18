package examples

import models.Serial

fun main() {
    val serialLong = Serial(231123213)
    println(serialLong.getSerial())
    val serialStr = Serial("F455")
    println(serialStr.getSerial())
}