package moviedb
//Media class should include common variable for Movies and TV Series: Title, Synopsis, Genre, Actors, User Rating

open class Media(title: String,
                 synopsis: String,
                 genre: String,
                 actors: List<String>) {
    var userRating: Double = 0.0
}