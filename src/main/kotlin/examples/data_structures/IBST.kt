package examples.data_structures

import models.Employee

// Binary Search Tree Interface
interface IBST<T>: Comparable<T> {
    fun insert(employee: T)
    fun exists(id: Int): Boolean
    fun get(id: Int): T?
    fun isLeaf(): Boolean
    fun isEmpty(): Boolean
    fun preOrder()
    fun inOrder()
    fun posOrder()
    fun delete(id: Int)
}