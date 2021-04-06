package examples.data_structures

import models.PrinterJob

class MyProcessQueue : ProcessQueue {
    private class ProcessNode(
        var printerJob: PrinterJob,
        var next: ProcessNode? = null
    )

    private var header: ProcessNode? = null
    private var lastest: ProcessNode? = null

    override fun enqueue(printerJob: PrinterJob) {
        val node = ProcessNode(printerJob)

        if(header == null) {
            header = node
        } else {
            lastest?.next = node
        }

        lastest = node
    }

    override fun remove() {
        if(header != null) {
            val nodeToRemove = header
            header = header?.next
            nodeToRemove?.next = null

            if(header == null) {
                lastest = null
            }
        }
    }

    override fun getJob(): PrinterJob? {
        if(header == null) {
            return null
        } else {
            return header?.printerJob
        }
    }
}