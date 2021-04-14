package examples.data_structures

import models.Employee

fun main() {
    val employeeList = arrayOf(
        Employee(20, "Pepito Perez", "Ventas", "A-232"),
        Employee(44, "Pepito Martinez", "RH", "A-233"),
        Employee(15, "Laura Martinez", "Programacion", "B-233"),
        Employee(55, "Laura Perez", "Programacion", "B-243"),
        Employee(65, "Tomas Dalton", "Ventas", "B-233"),
        Employee(85, "Jhon Doe", "Programacion", "C-243"))

    val bst = BST()
    employeeList.forEach { employee ->  bst.insert(employee) }

    bst.delete(44)
    bst.preOrder()
}