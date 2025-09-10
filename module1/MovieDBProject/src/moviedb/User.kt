package moviedb

class User(val username: String) {
    val favorites: MutableList<Media> = mutableListOf()

}