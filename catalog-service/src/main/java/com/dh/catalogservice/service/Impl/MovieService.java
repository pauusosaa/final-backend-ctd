package com.dh.catalogservice.service.Impl;

import com.dh.catalogservice.model.Movie;
import com.dh.catalogservice.repository.feign.MovieFeignRepository;
import com.dh.catalogservice.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService {

    @Autowired
    MovieFeignRepository movieFeignRepository;

    @Override
    public Movie save(Movie movie) {
       return movieFeignRepository.save(movie).getBody();
    }

    @Override
    public List<Movie> findMoviesByGenre(String genre) {
        return movieFeignRepository.getMovieByGenre(genre);
    }
}
