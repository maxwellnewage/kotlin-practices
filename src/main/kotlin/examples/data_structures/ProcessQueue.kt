package examples.data_structures

import models.PrinterJob

interface ProcessQueue {
    fun enqueue(printerJob: PrinterJob)
    fun remove()
    fun getJob(): PrinterJob?
}