import java.lang.Exception

fun main() {
    val stringList: List<String> = listOf("Max", "Tomas", "Rocky")
    val mixedTypeList: List<Any> = listOf("Max", 35, false)

    for (item in mixedTypeList) {
        when(item) {
            is Int -> println("$item is an integer")
            is String -> println("$item is a string")
            is Boolean -> println("$item is a boolean")
            else -> println("I don't know what's $item")
        }
    }

    val obj: Any = "This is a string"
    if(obj !is String)
        println("$obj is not a string")

    val strConverted: String = obj as String
    println(strConverted.length)

    // Typecast error
    try {
        val num: Any = 1334
        val strNum: String = num as String //num as? String => safe cast
        println(strNum)
    } catch (e: Exception) {
        println("Cannot cast because ${e.message}")
    }
}