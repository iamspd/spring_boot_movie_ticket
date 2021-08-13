/**
 * 
 */
package com.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Priyank
 * Name: Priyank Shah
 * Student #: 301097375
 * Submission Date: Nov 13, 2020
 */

@RestController
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@ResponseBody
	@RequestMapping("/m")
	public String home()
	{
		return "Create a Movie Web service";
	}

 @RequestMapping(value = "/movie/{movieId}", method = RequestMethod.GET)
 Movie getMovie(@PathVariable("movieId") int movieId) throws Exception {
     return movieService.getMovies(movieId);
 }

 @RequestMapping(value = "/movies", method = RequestMethod.GET)
 Iterable<Movie> getEmployees() {
     return movieService.getMovies();
 }

 @RequestMapping(value = "/movie", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
 @ResponseStatus(value = HttpStatus.OK)
 void addMovie(@RequestBody Movie movie) throws Exception {
     movieService.addMovie(movie);
 }

 @RequestMapping(value = "/movie/{movieId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
 @ResponseStatus(value = HttpStatus.OK)
 void updateMovie(@PathVariable("movieId") int movieId, @RequestBody Movie movie) throws Exception {
     movie.setMovieId(movieId);
     movieService.updateMovie(movie);
 }

 @RequestMapping(value = "/movie/{movieId}", method = RequestMethod.DELETE)
 @ResponseStatus(value = HttpStatus.OK)
 void deleteMovie(@PathVariable("movieId") int movieId) throws Exception {
     movieService.deleteMovie(movieId);
 }


}
