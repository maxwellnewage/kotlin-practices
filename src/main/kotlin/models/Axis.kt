package models

class Axis<X,Y>(private val x: X, private val y: Y) {
    operator fun component1():X {
        return x
    }

    operator fun component2():Y {
        return y
    }
}