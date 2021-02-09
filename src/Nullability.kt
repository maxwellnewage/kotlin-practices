fun main() {
    //Can not be null
    var name: String

    //Can be null or String
    var nullableName: String? = null

    println(nullableName?.length?: "0, I don't have a name!")

    //Read name
    nullableName = readLine()

    println("${nullableName?.length}, your name is $nullableName")

}