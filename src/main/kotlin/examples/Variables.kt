package examples

fun main() {
    // unmutable variable
    val name: String = "Maxwell"

    // mutable variable
    var isOld = true
    isOld = false

    println("name: $name isOld: $isOld")

    val a: Int = 3
    val b: Int = 6
    println(a + b)

    val doubleNum: Double = 125.5 // 64 bit
    val floatNum: Float = 45.5f // 32 bit
    val longNum: Long = 123234545678L

    val aDouble = a.toString()

    var hero: String
    hero = "Superman"
    print(hero)


}