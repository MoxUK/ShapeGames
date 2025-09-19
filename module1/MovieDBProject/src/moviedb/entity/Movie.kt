package moviedb.entity
//Movie class should include Title, Release Year, Runtime, Synopsis, Genre, Director, Actors, User Rating
//Inherit Title, Synopsis, Genre and Actors from Media class

class Movie (title: String,
             val releaseYear: Int,
             val runtime: Int,
             synopsis: String,
             genre: String,
             val director: String,
             actors: List<String>) : Media(title, synopsis, genre, actors){
}