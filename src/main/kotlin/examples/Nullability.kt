package examples

fun main() {
    //Can not be null
    var name: String

    //Can be null or String
    var nullableName: String? = null

    println(nullableName?.length?: "0, I don't have a name!")

    //Read name
    nullableName = readLine()

    println("${nullableName?.length}, your name is $nullableName")

    // You can use the elvis operator to throw errors and return too
    fun acceptsNonNullNumbers(num: Int?) {
        val nonNullNum = num ?: error("Hey, don't pass null!")

        println("Your number is $nonNullNum")
    }

    fun addThreeOrReturnZero(value: Int?): Int {
        val nonNullValue = value ?: return 0

        return nonNullValue + 3
    }

    println("With 5: ${addThreeOrReturnZero(5)} with null: ${addThreeOrReturnZero(null)}")

    try {
        acceptsNonNullNumbers(2)
        acceptsNonNullNumbers(null)
    } catch (e: IllegalStateException) {
        println("Threw an exception on null")
        e.printStackTrace()
    }
}