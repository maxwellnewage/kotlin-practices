package examples

fun main() {
    println("Tell me your full name")
    val (firstname, lastname) = readLine()!!.split(' ')
    println("Hello $firstname $lastname")
}