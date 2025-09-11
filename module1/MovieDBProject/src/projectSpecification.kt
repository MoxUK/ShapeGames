/**
Create a Movie Database

Project should include Media as a class with Movie and TVSeries as subclasses plus a User class:
- Media class should include common variable for Movies and TV Series: Title, Synopsis, Genre, Actors, User Rating
- Movie class should include Title, Release Year, Runtime, Synopsis, Genre, Director, Actors, User Rating
- TVSeries class should include Title, Pilot Episode Premier date, Synopsis, Genre, Actors, User Rating
Additionally, sub-categorise with Season/Episode overview
- User class including Username, Favorites (list)

Functionality:
Search for Movie or TV series by name
Search for Actor
- list all movies/tv series actor has acted in.
(done) Add/Remove Movie/TV series to user's favourite list
Update user rating of movie/TV series
(done) List all titles on a specific user's favourite list
(done) Expand list all titles to include distinction between Movie and TV series episode
(done) Add a Season to a TV series - check Season doesn't already exist
(done) Add an episode to a TV series season - check episode doesn't already exist
(done) List all episodes stored for a specific season
(done) List all titles in the db

 Structure:
 MovieDB ---- Media - Movie
                    - TV Series
                        - Season
                            - Episode
              User
 */
