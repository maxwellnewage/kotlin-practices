package design_patterns.delegation

class FileDownloader(private val file: String): Downloader {
    override fun download() {
        println("$file downloaded")
    }
}