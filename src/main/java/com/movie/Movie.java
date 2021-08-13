/**
 * 
 */
package com.movie;

/**
 * @author Priyank
 * Name: Priyank Shah
 * Student #: 301097375
 * Submission Date: Nov 13, 2020
 */
public class Movie {
	private int movieId;
	private String movieName, movieLanguage, movieGenre, 
					duration;
	
	public Movie(int movieId, String movieName, String movieLanguage, String movieGenre, String duration) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieLanguage = movieLanguage;
		this.movieGenre = movieGenre;
		this.duration = duration;
	}


	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getMovieLanguage() {
		return movieLanguage;
	}


	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}


	public String getMovieGenre() {
		return movieGenre;
	}


	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

}
