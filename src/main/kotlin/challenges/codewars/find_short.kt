package challenges.codewars

// https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/kotlin
fun main() {
    // 3
    println(findShort("bitcoin take over the world maybe who knows perhaps"))
    // 3
    println(findShort("turns out random test cases are easier than writing out basic ones"))
}

fun findShort(s: String): Int {
    var shortSizeOfWord = s.length

    val words = s.split(" ")
    for(w in words) {
        if(w.length < shortSizeOfWord) {
            shortSizeOfWord = w.length
        }
    }

    return shortSizeOfWord
}