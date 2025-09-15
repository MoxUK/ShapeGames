package moviedb

//Top level class
//Functionality: Add Media, Search by title, Search by actor, Update media rating
//  Check: Adding existing title should be blocked?
//  Check: Media rating must be between 0.0 and 10.0

class MovieDB {
    private val mediaList: MutableList<Media> = mutableListOf()

    fun addMedia(media: Media)  {
        //add media to the list of media (mediaList)
        mediaList.add(media)
    }

    fun listAllTitles() {
        if (mediaList.isEmpty()) {
            println("The database is currently empty.")
        } else {
            println("Titles currently in database:")
            // print each object in the mediaList
            // old code:             mediaList.forEach {println("* ${it.title}")
            // new: post-fix output with TV or Movie identifier depending on media type
            mediaList.forEach {
                when (it) {
                    is Movie -> println("* ${it.title} (Movie)")
                    is TVSeries -> println("* ${it.title} (TV Series)")
                    else -> println("* ${it.title} (unknown media type)")
                }
            }
        }
    }

    fun searchByActor(searchActor: String): List<Media> {
        // Create a list for results
        val matches = mutableListOf<Media>()
        // Loop through each Media object in Database
        // Match searchActor with Actor
        for (mediaFound in mediaList) {
            var found = false
            for (actor in mediaFound.actors) {
                if (actor.equals(searchActor, ignoreCase = true)) {
                    found = true
                    break
                }
            }
            // If match is found, add result mediaFound to matches list
            if (found) {
                matches.add(mediaFound)
            }
        }
        return matches
    }

    fun printSearchByActor(actor: String) {
        val found = searchByActor(actor)
        if (found.isEmpty()) {
            println("No media found with $actor")
        } else {
            println("Media found with $actor: ${found.map { it.title }.joinToString(", ")}")
        }
    }

    //Logic from searchByActor optimised for searchByTitle using lambda function

    fun searchByTitle(searchTitle: String): List<Media> {
        // Use built-in kotlin collection function 'filter' on list
        // step through each element on the mediaList and check if the search string is included in the title of the media, ignoring case
        // Lambda returns 'true' if matching.
        // Output of function is a list containing titles matching in the lambda
        return mediaList.filter { it.title.contains(searchTitle, ignoreCase = true) }
    }

    fun printSearchByTitle(searchTitle: String) {
        val found = searchByTitle(searchTitle)
        if (found.isEmpty()) {
            println("No media found with $searchTitle")
        } else {
            println("Media found with $searchTitle: ${found.map { it.title }.joinToString(", ")}")
        }
    }

    fun updateRating(media: Media, rating: Double) {
        media.userRating = rating
        println("${media.title} rating updated to $rating")
    }
}