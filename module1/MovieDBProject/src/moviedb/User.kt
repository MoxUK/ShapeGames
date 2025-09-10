package moviedb
//User class including Username, Favorites (list)
//Functionality: favorites list with ability to Add and Remove Media - check: Adding a title already on list should fail

class User(val username: String) {
    val favorites: MutableList<Media> = mutableListOf()

}