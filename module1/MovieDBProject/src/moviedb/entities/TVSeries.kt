package moviedb.entities
//TVSeries class should include Title, Pilot Episode Premier date, Synopsis, Genre, Actors, User Rating
//Inherit Title, Synopsis, Genre and Actors from Media class
//Additionally, sub-categories with Season/Episode overview

class TVSeries (title: String,
                val pilotDate: String,
                synopsis: String,
                genre: String,
                actors: List<String>) : Media(title, synopsis, genre, actors){
    val seasons: MutableList<Season> = mutableListOf()

    //Function to add a season to a TV series - check if season is already present
    fun addSeason(seasonNumber: Int) {
        //Check that no existing season on the mutable list 'seasons' already has this season number
        //It returns true if none match, and false if at least one matches.
        if (seasons.none { it.seasonNumber == seasonNumber }) {
            seasons.add(Season(seasonNumber))
            println("Season $seasonNumber added to $title")
        } else {
            println("Season $seasonNumber already exists for $title")
        }
    }

    /*
    //Function to add an episode of a TV series to a season - check if episode is already present
    fun addEpisode(seasonNumber: Int, episode: Episode) {
        // Set the season value for the episode.
        // If the season number is not present on the list, season will be null.
        // Check that season is set to a value not null and add the episode to the season.
        // If season value is null then fail gracefully
        val season = seasons.find { it.seasonNumber == seasonNumber }
        if (season != null) {
            season.episodes.add(episode)
            println("Episode '${episode.title}' added to $title Season $seasonNumber")
        } else {
            println("Season $seasonNumber not found for $title. Please add the season first.")
        }
    }
     */

    fun addEpisode(seasonNumber: Int, episode: Episode) {
        val season = seasons.find { it.seasonNumber == seasonNumber }
        if (season != null) {
            season.episodes.add(episode)
            season.episodes.sortBy { it.episodeNumber }  // ✅ keep sorted after every insert
            println("Episode '${episode.title}' added to $title Season $seasonNumber")
        } else {
            println("Season $seasonNumber not found for $title. Please add the season first.")
        }
    }


    fun listEpisodes(seasonNumber: Int) {
        // Set the season value for the episode.
        val season = seasons.find { it.seasonNumber == seasonNumber }
        // Check if the season number is set (i.e. not null)
        // if set, continue to look at episode - else fail gracefully
        if (season != null) {
            // Check if there are episodes assigned to the season.
            // Fail gracefully if none else print all episodes
            if (season.episodes.isEmpty()) {
                println("No episodes found in Season $seasonNumber of $title")
            } else {
                println("Episodes in $title Season $seasonNumber:")
                season.episodes.forEach {
                    println("Episode ${it.episodeNumber}: ${it.title} (${it.runtimeTVEpisode} min)")
                }
            }
        } else {
            println("Season $seasonNumber not found for $title")
        }
    }

    override fun printDetails() {
        println("=== TV Series Details ===")
        println("Title: $title")
        println("Pilot Episode Premier: $pilotDate")
        println("Genre: $genre")
        println("Actors: ${actors.joinToString(", ")}")
        println("Synopsis: $synopsis")
        println("User Rating: $userRating")
        println("=========================")
    }
}


class Season(val seasonNumber: Int) {
    val episodes: MutableList<Episode> = mutableListOf()
}

class Episode(val title: String,
              val episodeNumber: Int,
              val runtimeTVEpisode: Int)