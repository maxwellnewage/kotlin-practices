package examples.data_structures

import models.Book

private data class BookNode(val book: Book, var next: BookNode? = null)

private var header: BookNode? = null
private var bookCounter = 0

// Example inspired in this Youtube Video:
// https://www.youtube.com/watch?v=TjlPQPRfWFk&t=118s&ab_channel=makigas%3Atutorialesdeprogramaci%C3%B3n
fun main() {
    createBook(Book("Book 1", "Author 1", "1234ABC"))

    createBookInPos(Book("Book 2", "Author 2", "1234ABC"), 1)
    createBookInPos(Book("Book 3", "Author 3", "1234ABC"), 2)

    createBookOnLastPos(Book("Book 4", "Author 4", "1234ABC"))

    deleteFirstBook()
    deleteLastBook()

    println(getBookInPos(1))
    println(countBooks())
}

private fun createBook(book: Book) {
    val node = BookNode(book)
    node.next = null
    header = node

    bookCounter++
}

private fun createBookOnLastPos(book: Book) {
    val node = BookNode(book)

    if (header == null) {
        header = node
    } else {
        var mHeader = header
        while (mHeader?.next != null) {
            mHeader = mHeader.next
        }

        mHeader?.next = node
    }

    bookCounter++
}

private fun createBookInPos(book: Book, pos: Int) {
    val node = BookNode(book)

    if (header == null) {
        header = node
    } else {
        var mHeader = header
        for (i in 0..pos) {
            if (mHeader?.next != null) {
                mHeader = mHeader.next
            }
        }

        node.next = mHeader?.next
        mHeader?.next = node
    }

    bookCounter++
}

private fun getBookInPos(pos: Int): Book? {
    if (header == null) {
        return null
    } else {
        var mHeader = header
        for (i in 0..pos) {
            if (mHeader?.next != null) {
                mHeader = mHeader.next
            }
        }

        return mHeader?.book
    }
}

private fun countBooks(): Int {
    return bookCounter++
}

private fun isBookListNotEmpty(): Boolean {
    return header != null
}

private fun deleteFirstBook() {
    if (isBookListNotEmpty()) {
        val first = header
        header = header?.next
        first?.next = null
        bookCounter--
    }
}

private fun deleteLastBook() {
    if (isBookListNotEmpty()) {
        if (header?.next == null) {
            header = null
        } else {
            var last = header
            while (last?.next?.next != null) {
                last = last.next
            }
            last?.next = null
        }

        bookCounter--
    }
}

private fun deleteBookInPos(pos: Int) {
    if (isBookListNotEmpty()) {
        if (pos == 0) {
            deleteFirstBook()
        } else if (pos < bookCounter) {
            var pointer = header
            for (i in 0 until pos) {
                pointer = pointer?.next
            }
            val temp = pointer?.next
            pointer?.next = temp?.next
            temp?.next = null

            bookCounter--
        }
    }
}