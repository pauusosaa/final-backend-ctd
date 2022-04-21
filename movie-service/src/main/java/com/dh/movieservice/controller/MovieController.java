package com.dh.movieservice.controller;

import com.dh.movieservice.model.Movie;
import com.dh.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
	private MovieService movieService;

	@Autowired
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}

	@PostMapping("")
	public ResponseEntity<Movie> saveMovie(@RequestBody Movie movie) {
		return ResponseEntity.ok().body(movieService.save(movie));
	}

	@GetMapping("/{id}")
	public Movie getMovieDetails(@PathVariable Integer id) {
		return movieService.getMovieDetails(id);
	}

	@GetMapping("/{genre}")
	public List<Movie> getMovieByGenre(@PathVariable String genre){ return  movieService.getMovieByGenre(genre);}
}
