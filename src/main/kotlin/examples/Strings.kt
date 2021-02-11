package examples

fun main() {
    val str = "This is a\ngreat string."
    println(str)

    val scapeChar = "This is a \"quote\""
    println(scapeChar)

    val dolarSign = "This is \$1000"
    println(dolarSign)

    val rawCrawl = """
        |A long time ago,
        |in a galaxy
        |far, far, away...""".trimMargin()

    println(rawCrawl)

//    for(char in str) {
//        println(char)
//    }

    val contentEquals = str.contentEquals("great")
    println(contentEquals)

    val contains = str.contains("great")
    println(contains)

    println(str.toLowerCase())
    println(str.toUpperCase())

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    val subsequence = str.subSequence(0, 4)
    println(subsequence)
}