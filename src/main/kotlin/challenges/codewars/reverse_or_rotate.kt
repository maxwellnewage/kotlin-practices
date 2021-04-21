package challenges.codewars

import kotlin.math.abs

// https://www.codewars.com/kata/56b5afb4ed1f6d5fb0000991/kotlin
fun main() {
    // "330479108928157"
    println(revRot("733049910872815764", 5))

    // "1994033775182780067155464327690480265895"
    println(revRot("73304991087281576455176044327690580265896", 8))

    // "1994033775182780067155464327690480265895"
    println(revRot("73304991087281576455176044327690580265896896028", 8))
}

fun revRot(nums: String, sz: Int): String {
    if (sz <= 0 || nums == "" || sz > nums.length) return ""

    var chunkCounter = abs(nums.length / sz)
    var positionPointer = 0
    var joinedChunk = ""

    while(chunkCounter > 0) {
        var chunk = nums.substring(positionPointer, positionPointer + sz)
        chunk = calculateChunk(chunk)
        joinedChunk += chunk
        positionPointer += sz
        chunkCounter--
    }

    return joinedChunk
}

fun calculateChunk(currentChunk: String): String {
    var sumOfChunk = 0
    for(chunk in currentChunk) {
        sumOfChunk += Character.getNumericValue(chunk)
    }

    if(sumOfChunk % 2 == 0) {
        return currentChunk.reversed()
    } else {
        return currentChunk.substring(1) + currentChunk[0]
    }
}