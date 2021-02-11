package models

import kotlinx.serialization.Serializable

@Serializable
data class Person(val firstname: String, val lastname: String)