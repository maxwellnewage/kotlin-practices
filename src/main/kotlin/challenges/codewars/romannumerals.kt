package challenges.codewars

import java.lang.Exception

fun decode(str: String): Int {
    val charRomanTable = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    if(str.isEmpty()) return 0

    if(!validateRoman(str, charRomanTable)) throw Exception("Wrong roman format")

    return calcRomanGroup(str.reversed(), charRomanTable)
}

fun validateRoman(str: String, arrayMap: Map<Char, Int>): Boolean {
    str.forEachIndexed { index, num ->
        if(!arrayMap.containsKey(num)) return false

        if(index >= 2 && arrayMap[str[index - 1]]!! < arrayMap[num]!! &&
            arrayMap[str[index - 2]]!! < arrayMap[num]!!) {
            return false
        }
    }

    return true
}

fun calcRomanGroup(strReversed: String, arrayMap: Map<Char, Int>): Int {
    val current = arrayMap[strReversed[0]]!!
    var realValue = current
    var countChars = 1

    if(strReversed.length == 1) return realValue

    val prev = arrayMap[strReversed[1]]!!

    if(prev < current) {
        realValue -= prev
        countChars++
    }

    val restOfString = strReversed.substring(countChars)

    if(restOfString.isNotEmpty()) {
        realValue += calcRomanGroup(restOfString, arrayMap)
    }

    return realValue
}

fun main() {
    println(decode("DCCC")) // 800
    println(decode("I")) // 1
    println(decode("CMLIV")) // 954
    println(decode("MMVIII")) // 2008
    println(decode("XLVII")) // 47
}

