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
            // old code:             mediaList.forEach {println("* ${it.title} (*TBC*)")
            // new: post-fix output with TV or Movie identifier depending on media type
            mediaList.forEach {
                when (it) {
                    is Movie -> println("* ${it.title} (Movie)")
                    is TVSeries -> println("* ${it.title} (TV Series)")
                    else -> println("* ${it.title} (unknown media type")
                }
            }
        }
    }

    /*

    val matches = mutableListOf<Media>()
        for (media in mediaList) {
        if (media.title.contains(title, ignoreCase = true)) {
        matches.add(media)
        }
    }
    return matches
     */

    fun searchByTitle(searchTitle: String): List<Media> {
        // Use built-in kotlin collection function 'filter' on list
        // step through each element on the mediaList and check if the search
        // string is included in the title of the media, ignoring case
        // Lambda returns 'true' if match.
        // Output of function is a list containing titles matching in the lambda
        return mediaList.filter { it.title.contains(searchTitle, ignoreCase = true) }
    }

    fun searchByActor(searchActor: String): List<Media> {
        // Same functionality as searchByTitle, except matching on the 'actors' element in the Media object
        return mediaList.filter { it.actors.any { it.equals(searchActor, ignoreCase = true) } }
    }

}