package design_patterns.delegation

class MediaFile(
    private val downloader: Downloader,
    private val player: Player,
): Downloader by downloader, Player by player