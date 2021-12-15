package design_patterns.delegation

fun main() {
    val file = "File.mkv"

    val mediaFile = MediaFile(FileDownloader(file), FilePlayer(file))
    mediaFile.download()
    mediaFile.play()
}