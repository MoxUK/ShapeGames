package moviedb

import moviedb.entity.Media

//User class including Username, Favorites (list)
//Functionality: favorites list with ability to Add and Remove Media - check: Adding a title already on list should fail

class User(val username: String) {
    val favourites: MutableList<Media> = mutableListOf()

    fun addFavorite(media: Media) {
        //Check if favorite is already on list; if not then add to list and confirm
        if (!favourites.contains(media)) {
            favourites.add(media)
            println("${media.title} added to $username's favorites.")
        } else {
            println("${media.title} already exists on $username's favorites.")
        }
    }

    fun removeFavorite(media: Media) {
        if (favourites.remove(media)) {
            println("${media.title} removed from $username's favorites.")
        }
    }

    fun showFavourites() {
        if (favourites.isEmpty()) {
            println("$username's favourite list is empty")
        } else {
            println("$username's favorite titles:")
            favourites.forEach { println("- ${it.title}") }
        }
    }

}