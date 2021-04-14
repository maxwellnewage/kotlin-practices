package examples.data_structures

import models.Employee
import java.lang.RuntimeException

// Binary Search Tree Class
data class BST(
    private var value: Employee? = null,
    private var left: BST? = null,
    private var right: BST? = null,
    private var father: BST? = null
) : IBST<Employee> {

    override fun compareTo(other: Employee): Int {
        TODO("Not yet implemented")
    }

    private fun insertImpl(employee: Employee, father: BST?) {
        if (isEmpty()) {
            this.value = employee
            this.father = father
        } else {
            if (employee.compareTo(value!!) < 0) {
                if (left == null) left = BST()
                left?.insertImpl(employee, this)
            } else if (employee.compareTo(value!!) > 0) {
                if (right == null) right = BST()
                right?.insertImpl(employee, this)
            } else {
                throw RuntimeException("Duplicated element")
            }
        }
    }

    override fun insert(employee: Employee) {
        insertImpl(employee, null)
    }

    override fun exists(id: Int): Boolean {
        if (isEmpty()) {
            return false
        } else {
            if (id == value?.id) {
                return true
            } else if (id < value?.id!! && left != null) {
                return left?.exists(id)!!
            } else if (id > value?.id!! && right != null) {
                return right?.exists(id)!!
            } else {
                return false
            }
        }
    }

    override fun get(id: Int): Employee? {
        if (isEmpty()) {
            return null
        } else {
            if (id == value?.id) {
                return value
            } else if (id < value?.id!! && left != null) {
                return left?.get(id)!!
            } else if (id > value?.id!! && right != null) {
                return right?.get(id)!!
            } else {
                return null
            }
        }
    }

    override fun isLeaf(): Boolean {
        return value != null && left == null && right == null
    }

    override fun isEmpty(): Boolean {
        return value == null
    }

    private fun preOrderImpl(prefix: String) {
        if (!isEmpty()) {
            println("$prefix $value")
            if (left != null) left?.preOrderImpl("$prefix ")
            if (right != null) right?.preOrderImpl("$prefix ")
        }
    }

    override fun preOrder() {
        preOrderImpl("")
    }

    private fun inOrderImpl(prefix: String) {
        if (!isEmpty()) {
            if (left != null) left?.inOrderImpl("$prefix ")
            println("$prefix $value")
            if (right != null) right?.inOrderImpl("$prefix ")
        }
    }

    override fun inOrder() {
        inOrderImpl("")
    }

    private fun posOrderImpl(prefix: String) {
        if (!isEmpty()) {
            if (left != null) left?.posOrderImpl("$prefix ")
            if (right != null) right?.posOrderImpl("$prefix ")
            println("$prefix $value")
        }
    }

    override fun posOrder() {
        posOrderImpl("")
    }

    private fun min(): BST {
        if(left != null && !left!!.isEmpty()) {
            return left!!.min()
        } else {
            return this
        }
    }

    private fun deleteImpl(id: Int) {
        if (left != null && right != null) {
            val min = right?.min()
            value = min?.value
            right?.delete(min?.value!!.id)
        } else if (left != null || right != null) {
            val replaceChild = if (left != null) { left } else { right }
            value = replaceChild?.value
            left = replaceChild?.left
            right = replaceChild?.right
        } else {
            if (father != null) {
                if (this == father?.left) father?.left = null
                if (this == father?.right) father?.right = null
                father = null
            }
            value = null
        }
    }

    override fun delete(id: Int) {
        if (!isEmpty()) {
            if (id == value?.id) {
                deleteImpl(id)
            } else if (id < value?.id!! && left != null) {
                left?.delete(id)
            } else if (id > value?.id!! && right != null) {
                right?.delete(id)
            }
        }
    }
}