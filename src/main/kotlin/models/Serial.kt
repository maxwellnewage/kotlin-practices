package models

class Serial<K>(val number: K) {
    fun getSerial(): String {
        return "The serial number is $number"
    }

    operator fun component1():K {
        return number
    }
}