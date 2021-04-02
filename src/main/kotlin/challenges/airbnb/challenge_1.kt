package challenges.airbnb

/* Given two strings A and B of lowercase letters,
 * return true if and only if we can swap two letters in A so that the result equals B.
 * Example:
 * Input: A = "ab", B = "ba"
 * Output: true
 */
fun main() {
    println("has to be true: " + buddyStrings("aaaaaaabc", "aaaaaaacb"))

    println("has to be true: " + buddyStrings("aaaaaabbc", "aaaaaaacb"))

    println("has to be true: " + buddyStrings("ab", "ba"))

    println("has to be false: " + buddyStrings("ab", ""))

    println("has to be false: " + buddyStrings("", "ba"))

    println("has to be false: " + buddyStrings("ac", "bd"))
}

fun buddyStrings(A: String, B: String): Boolean {
    // check if the length of both strings are greater than 1
    if(A.length > 1 && B.length > 1) {
        if(A[0] != A[1] && B[0] != B[1]) {
            if(A[0] == B[0] && A[1] == B[1]) {
                // A = "ab", B = "ab"
                return false
            } else if(A[0] == B[1] && A[1] == B[0]) {
                // A = "ab", B = "ba"
                return true
            }
        } else {
            return true
        }

        return false
    } else {
        // A = "", B = "aa"
        return false
    }
}