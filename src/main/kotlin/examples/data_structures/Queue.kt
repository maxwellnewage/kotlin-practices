package examples.data_structures

import models.PrinterJob

fun main() {
    val processQueue = MyProcessQueue()

    processQueue.enqueue(PrinterJob("Some page", "Luke Pain", false))
    processQueue.enqueue(PrinterJob("Other page", "Luke Pain", false))

    println(processQueue.getJob().toString())
    println("First Job Completed...")
    processQueue.remove()
    println(processQueue.getJob().toString())
}