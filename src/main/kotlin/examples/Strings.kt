package examples

fun main() {
    val str = "This is a\ngreat string."
    println(str)

    println("This is a \"quote\"")
    println("This is \$1000")

    findInString(str)

    println(str.toLowerCase())
    println(str.toUpperCase())

    numToString()

    println(str.subSequence(0, 4))

    stringMultipleLines()
}

private fun stringMultipleLines() {
    val rawCrawl = """
        |A long time ago,
        |in a galaxy
        |far, far, away...""".trimMargin()

    println(rawCrawl)
}

private fun numToString() {
    val num = 6
    val stringNum = num.toString()
    println(stringNum)
}

private fun findInString(str: String) {
    val contentEquals = str.contentEquals("great")
    println(contentEquals)

    val contains = str.contains("great")
    println(contains)
}