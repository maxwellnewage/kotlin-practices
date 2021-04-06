package models

data class PrinterJob(
    val title: String,
    val author: String,
    val printed: Boolean = false
)