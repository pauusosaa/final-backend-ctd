package com.dh.catalogservice.service.Impl;

import com.dh.catalogservice.model.Catalog;
import com.dh.catalogservice.model.Movie;
import com.dh.catalogservice.model.Serie;
import com.dh.catalogservice.repository.CatalogRepository;
import com.dh.catalogservice.repository.feign.MovieFeignRepository;
import com.dh.catalogservice.repository.feign.SerieFeignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogService {

    @Autowired
    CatalogRepository catalogRepository;

    @Autowired
    MovieFeignRepository movieFeignRepository;

    @Autowired
    SerieFeignRepository serieFeignRepository;

    public Catalog getCatalogByGenre(String genre){
        List<Movie> movies = movieFeignRepository.getMovieByGenre(genre);
        List<Serie> series = serieFeignRepository.getSerieByGenre(genre);
        return Catalog.builder()
                .movies(movies)
                .series(series)
                .build();

    }
}
