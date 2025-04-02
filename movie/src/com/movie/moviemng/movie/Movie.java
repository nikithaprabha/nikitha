package com.movie.moviemng.movie;

import com.movie.moviemng.actor.Actor;
import com.movie.moviemng.genre.Genre;

public class Movie {
    public int movieId;
    public String movieName;
    public Genre[] genre;




    public void displayMovie() {
        System.out.println("Movie ID: " + movieId);
        System.out.println("Movie Name: " + movieName);
        //genre.displayGenre();
        for (Genre genres : genre) {
            genres.displayActor();
        }
        System.out.println("----------------------");
    }
}