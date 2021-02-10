package examples

import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import models.Person

fun main() {
    val person = Person("Maxwell", "Tompson")
    val encodeToString = Json.encodeToString(person)
    println(encodeToString)
    val obj = Json.decodeFromString<Person>(encodeToString)
    println(obj)
}