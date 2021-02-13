package examples

fun main() {
    sayHi("Maxwell")
    startRun()
    println(calculateNum(1, 2))
    sayMyName()
    sayMyName("Max")
}

private fun startRun() {
    println("Is running")
}

private fun sayHi(name: String) {
    println("Hi $name!")
}

private fun calculateNum(num1: Int, num2: Int): Int {
    return num1 + num2
}

private fun sayMyName(name: String = "Tomas") {
    println("My name is $name")
}