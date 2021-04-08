package examples.data_structures

private data class URL(val path: String)

private interface Stack {
    fun push(url: URL)
    fun pop()
    fun peek(): URL?
    fun length(): Int
    fun isEmpty(): Boolean
}

private class MyStack: Stack {
    private class Node(val url: URL, var next: Node? = null)

    private var head: Node? = null
    private var stackSize = 0

    override fun push(url: URL) {
        val node = Node(url)
        node.next = head
        head = node
        stackSize++
    }

    override fun pop() {
        if(head != null) {
            val delete = head
            head = head?.next
            delete?.next = null
            stackSize--
        }
    }

    override fun peek(): URL? {
        return head?.url
    }

    override fun length(): Int {
        return stackSize
    }

    override fun isEmpty(): Boolean {
        return stackSize == 0
    }
}

private fun printState(stack: MyStack) {
    if(stack.isEmpty()) {
        println("The stack is empty")
    } else {
        println("Size of stack: ${stack.length()}, url: ${stack.peek()?.path}")
    }
}

fun main() {
    val googleUrl = URL("www.google.com")
    val youtubeUrl = URL("www.youtube.com")

    val stack = MyStack()
    printState(stack)
    stack.push(googleUrl)
    printState(stack)
    stack.push(youtubeUrl)
    printState(stack)

    while(!stack.isEmpty()) {
        stack.pop()
        printState(stack)
    }
}

