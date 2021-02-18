package examples

import kotlin.properties.Delegates

fun main() {
//    lazyDemo()
//    observableDemo()
    notNullDemo()
}

fun notNullDemo() {
    val name: String by Delegates.notNull()

    try {
        println(name)
    } catch (e: IllegalStateException) {
        println("IllegalStateException")
    }
}

fun observableDemo() {
    var state: String by Delegates.observable("stop") {
        _, old, new -> println("Old State: $old | New State: $new")
    }

    state = "run"
    state = "pause"
    state = "stop"
}

fun lazyDemo() {
    // this variable only initialize if is called
    val lazyStr: String by lazy {
        "this is a string"
    }

    println(lazyStr)
}