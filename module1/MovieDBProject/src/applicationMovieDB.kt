import  moviedb.Movie
import  moviedb.MovieDB
import moviedb.Media
import moviedb.User
import moviedb.TVSeries
import moviedb.Episode
import moviedb.Season

fun main() {
    val db = MovieDB()

    // Create media objects (movie)
    val bladerunner = Movie(
        title = "Blade Runner",
        releaseYear = 1982,
        runtime = 117,
        synopsis = "A blade runner must pursue and terminate four replicants who stole a ship in space " +
                "and have returned to Earth to find their creator..",
        genre = "Sci-Fi",
        director = "Ridley Scott",
        actors = listOf("Harrison Ford", "Rutger Hauer", "M. Emmet Walsh")
    )

    val indianajones = Movie(
        title = "Raiders of the Lost Ark",
        releaseYear = 1981,
        runtime = 115,
        synopsis = "In 1936, archaeologist Indiana Jones is tasked by Army Intelligence to help locate a legendary " +
                "ancient power, the Ark of Covenant, before the Nazis get it first.",
        genre = "Action, Adventure",
        director = "Steven Spielberg",
        actors = listOf("Harrison Ford", "Karen Allen", "Paul Freeman")
    )

    val guardiansofthegalaxy = Movie(
        title = "Guardians of the Galaxy",
        releaseYear = 2014,
        runtime = 121,
        synopsis = "A group of intergalactic criminals must pull together to stop a fanatical warrior with " +
                "plans to purge the universe.",
        genre = "Sci-fi, Action, Adventure",
        director = "James Gunn",
        actors = listOf("Chris Pratt", "Vin Diesel", "Dave Bautista")
    )

    // Add media (movies) to Database (db)
    db.addMedia(bladerunner)
    db.addMedia(indianajones)
    db.addMedia(guardiansofthegalaxy)

    // Create media objects (tv serie)
    val wednesday = TVSeries(
        title = "Wednesday",
        pilotDate = "2022-11-23",
        synopsis = "Smart, sarcastic and a little dead inside, Wednesday Addams investigates a murder " +
                "spree while making new friends — and foes — at Nevermore Academy.",
        genre = "Comedy, Drama, Fantasy, Horror, Mystery",
        actors = listOf("Jenny Ortega", "Emma Myers", "Catherine Zeta-Jones")
    )

    val rickandmorty = TVSeries(
        title = "Rick and Morty",
        pilotDate = "2013-12-02",
        synopsis = "Follows the misadventures of an alcoholic scientist Rick and his overly nervous grandson Morty, " +
                "who split their time between domestic family life and intergalactic travel. Often finding themselves " +
                "in a heap of trouble that more often than not is created through their own actions.",
        genre = "Adventure, Animation, Comedy, Science Fiction",
        actors = listOf("Ian Cardoni", "Harry Belden", "Chris Parnell")
    )

    // Add media (TV series) to Database (db)
    db.addMedia(wednesday)
    db.addMedia(rickandmorty)

    //try to add episode for non-existing season to 'wednesday'
    wednesday.addEpisode(1,
        Episode("Wednesday's Child is Full of Woe",
        1,
        59))

    // Add season 1 and season 2 to 'wednesday'
    wednesday.addSeason(1)
    wednesday.addSeason(2)

    //add episodes to 'wednesday'
    wednesday.addEpisode(1,
        Episode("Wednesday's Child is Full of Woe",
            1,
            59))

    wednesday.addEpisode(1,
        Episode("Woe is the Loneliest Number",
            2,
            49))

    wednesday.addEpisode(2,
        Episode("Here We Woe Again",
            1,
            60))

    // Add season 1 to 'rickandmorty'
    rickandmorty.addSeason(1)

    // Add episodes to 'rickandmorty'
    rickandmorty.addEpisode(1,
        Episode("Pilot",
            1,
            22))

    rickandmorty.addEpisode(1,
        Episode("Lawnmower Dog",
            2,
            22))

    rickandmorty.addEpisode(1,
        Episode("Anatomy Park",
            3,
            22))

    rickandmorty.addEpisode(1,
        Episode("M. Night Shaym-Aliens!",
            4,
            22))

    // Add season to 'rickandmorty' that already exists
    rickandmorty.addSeason(1)

    //Create user(s)
    val user = User("Soeren")

    //Show user's list of favourites (empty)
    user.showFavourites()

    //Add media to user's list of favourites
    user.addFavorite(bladerunner)
    user.addFavorite(wednesday)

    //Show user's list of favourites (not empty)
    user.showFavourites()

    //Remove media from user's list of favourites
    user.removeFavorite(wednesday)

    //Show user's list of favourites with one item removed
    user.showFavourites()

    //Add existing media to user's list of favourites (should fail gracefully)
    user.addFavorite(bladerunner)

    //Show all titles currently in the database
    db.listAllTitles()

    // List episodes in Season 1 of 'rickandmorty'
    rickandmorty.listEpisodes(1)

    // List episodes in non-existing Season 2 of 'rickandmorty'
    rickandmorty.listEpisodes(2)

    //Search for Movie or TV series by name

    //Search for Actor

    //list all movies/tv series actor has acted in.

    //Update user rating of movie/TV series
}