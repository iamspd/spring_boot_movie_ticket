/**
 * 
 */
package com.movie;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * @author Priyank
 * Name: Priyank Shah
 * Student #: 301097375
 * Submission Date: Nov 13, 2020
 */

@Service
public class MovieService {
	Map<Integer, Movie> mapMovie = new HashMap<>();

    public void addMovie(Movie movie) throws Exception {
        if(mapMovie.containsKey(movie.getMovieId())) {
            throw new Exception("Movie already exists");
        }
        else {
            mapMovie.put(movie.getMovieId(), movie);
        }
    }

    public Iterable<Movie> getMovies(){
        return mapMovie.values();
    }

    public Movie getMovies(int movieId) throws Exception {

        if(mapMovie.containsKey(movieId)) {
            return mapMovie.get(movieId);
        }
        else {
            throw new Exception("Movie Id not found");
        }
    }

    public void updateMovie(Movie movie) throws Exception {
        if(mapMovie.containsKey(movie.getMovieId())) {
            mapMovie.put(movie.getMovieId(), movie);
        }
        else {
            throw new Exception("Movie Id not found");
        }
    }


    public void deleteMovie(int movieId) throws Exception {
        if(mapMovie.containsKey(movieId)) {
            mapMovie.remove(movieId);
        }
        else {
            throw new Exception("Movie Id not found");
        }
    }
}
