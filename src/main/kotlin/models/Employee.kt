package models

data class Employee(
    val id: Int,
    val fullName: String,
    val area: String,
    val place: String
): Comparable<Employee> {
    override fun compareTo(other: Employee): Int {
        return when {
            id == other.id -> 0
            id < other.id -> -1
            else -> 1
        }
    }
}
