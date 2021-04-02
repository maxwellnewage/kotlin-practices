package challenges.uber

// You have a landscape, in which puddles can form.
// You are given an array of non-negative integers representing the elevation at each location.
// Return the amount of water that would accumulate if it rains.
// For example: [0,1,0,2,1,0,1,3,2,1,2,1] should return 6 because 6 units of water can get trapped here.
fun main() {
    // has to be 6
    println(capacity(intArrayOf(0,1,0,2,1,0,1,3,2,1,2,1)))
}

fun capacity(elevationPoints: IntArray): Int {
    var units = 0

    elevationPoints.forEachIndexed { i, point ->
        // if the index is 0 you can't compare with the left value
        // if the index is the last, you can't compare with the right value
        if(i != 0 && i != (elevationPoints.size - 1)) {
            val leftPoint = elevationPoints[i - 1]
            val rightPoint = elevationPoints[i + 1]
            val minPoint = minOf(leftPoint, rightPoint)
            units += point - minPoint
        }
    }

    return units
}