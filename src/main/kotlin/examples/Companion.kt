package examples

fun main() {
    Greetings.sayHi()
    Greetings.sayBye()

    println(Greetings.sum(1,1))

    val g = Greetings("Max")
    g.sayHi()
}

private class Greetings(val name: String) {
    companion object {
        fun sayHi() = println("Hi!")
        fun sayBye() = println("Bye!")

        fun sum(num1: Int, num2: Int): Int {
            return num1 + num2
        }
    }

    // this is a different function than companion
    fun sayHi() {
        println("Hi $name!")
    }
}