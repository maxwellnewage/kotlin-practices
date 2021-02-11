package examples

fun main() {

    fun startRun() {
        println("Is running")
    }

    fun sayHi(name: String) {
        println("Hi $name!")
    }

    fun calculateNum(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun sayMyName(name: String = "Tomas") {
        println("My name is $name")
    }

    sayHi("Maxwell")
    startRun()
    println(calculateNum(1, 2))
    sayMyName()
    sayMyName("Max")
}