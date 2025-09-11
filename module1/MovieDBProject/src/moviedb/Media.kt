package moviedb
//Media class should include common variable for Movies and TV Series: Title, Synopsis, Genre, Actors, User Rating

open class Media(val title: String,
                 val synopsis: String,
                 val genre: String,
                 val actors: List<String>) {
    var userRating: Double = 0.0
}