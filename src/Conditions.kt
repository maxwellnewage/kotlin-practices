fun main() {
    val a = 2
    val b = 2

    if(a == b) {
        println("A is equal B")
    } else {
        print("A is not equal B")
    }

    val balance = 100
    val price = 50

    if(balance >= price) {
        println("You can buy this!")
    } else {
        println("Sorry, you broke...")
    }

    val degrees = 70

    if(degrees >= 70) {
        println("This is some nice weather")
    } else if(degrees in 50..69) {
        println("Grab a sweater")
    } else {
        println("Holy crap its cold!")
    }

    val x = 1

    when(x) {
        1 -> println("X is one")
        2 -> println("X is two")
        else -> println("X is an error")
    }
}