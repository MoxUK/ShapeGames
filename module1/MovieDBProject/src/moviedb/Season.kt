package moviedb

class Season(val seasonNumber: Int) {
    val episodes: MutableList<Episode> = mutableListOf()
}

