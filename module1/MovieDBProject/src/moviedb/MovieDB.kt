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

}