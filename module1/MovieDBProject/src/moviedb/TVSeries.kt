package moviedb
//TVSeries class should include Title, Pilot Episode Premier date, Synopsis, Genre, Actors, User Rating

class TVSeries (title: String,
                val pilotDate: String,
                synopsis: String,
                genre: String,
                actors: List<String>) : Media(title, synopsis, genre, actors){
    val seasons: MutableList<Season> = mutableListOf()
}


