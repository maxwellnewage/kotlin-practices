package examples

fun main() {
    val a = 10
    val b = 2

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)

    if(a % b == 0) {
        println("Is even")
    } else {
        println("Is odd")
    }
}