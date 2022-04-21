package com.dh.movieservice.service.impl;

import com.dh.movieservice.model.Movie;
import com.dh.movieservice.repository.MovieRepository;
import com.dh.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
	private MovieRepository movieRepository;

	@Autowired
	public MovieServiceImpl(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	@Override
	public Movie getMovieDetails(Integer id) {
		return movieRepository.findById(id).orElse(null);
	}

	@Override
	public List<Movie> getMovieByGenre(String genre){ return  movieRepository.getMovieByGenre(genre);}

	@Override
	public Movie save(Movie movie) {
		return movieRepository.save(movie);
	}
}
