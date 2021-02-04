fun main() {
    var name: String = "bla"
    var nullableName: String? = "I might be null..."

    println(nullableName?.length ?: -1)
    println(nullableName!!.length)
}