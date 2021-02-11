fun main() {
    var name: String = "bla"
    var nullableName: String? = "I might be null..."

    println(nullableName?.length ?: -1)
    println(nullableName!!.length)

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