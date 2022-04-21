package com.dh.movieservice.service;

import com.dh.movieservice.model.Movie;

import java.util.List;

public interface MovieService {
	Movie getMovieDetails(Integer id);
	List<Movie> getMovieByGenre(String genre);
	Movie save(Movie movie);
}
