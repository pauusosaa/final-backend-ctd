package com.dh.catalogservice.service;

import com.dh.catalogservice.model.Movie;

import java.util.List;

public interface IMovieService {
    public Movie save(Movie movie);
    public List<Movie> findMoviesByGenre(String genre);
}
