package moviedb
//TVSeries class should include Title, Pilot Episode Premier date, Synopsis, Genre, Actors, User Rating
//Inherit Title, Synopsis, Genre and Actors from Media class
//Additionally, sub-categories with Season/Episode overview

class TVSeries (title: String,
                val pilotDate: String,
                synopsis: String,
                genre: String,
                actors: List<String>) : Media(title, synopsis, genre, actors){
    val seasons: MutableList<Season> = mutableListOf()
}


class Season(val seasonNumber: Int) {
    val episodes: MutableList<Episode> = mutableListOf()
}

class Episode(val title: String,
              val episodeNumber: Int,
              val runtimeMinutes: Int)