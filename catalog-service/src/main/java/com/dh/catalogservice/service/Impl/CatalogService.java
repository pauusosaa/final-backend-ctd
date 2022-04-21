package com.dh.catalogservice.service.Impl;

import com.dh.catalogservice.model.Catalog;
import com.dh.catalogservice.model.Movie;
import com.dh.catalogservice.model.Serie;
import com.dh.catalogservice.repository.CatalogRepository;
import com.dh.catalogservice.repository.feign.MovieFeignRepository;
import com.dh.catalogservice.repository.feign.SerieFeignRepository;
import com.dh.catalogservice.service.ICatalogService;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogService implements ICatalogService {

    @Autowired
    CatalogRepository catalogRepository;

    @Autowired
    MovieFeignRepository movieFeignRepository;

    @Autowired
    SerieFeignRepository serieFeignRepository;


    @Override
    @CircuitBreaker( name = "catalog", fallbackMethod = "findAllEmpty")
    @Retry(name = "catalog")
    public Catalog getCatalogByGenre(String genre){
        List<Movie> movies = movieFeignRepository.getMovieByGenre(genre);
        List<Serie> series = serieFeignRepository.getSerieByGenre(genre);
        Catalog catalogo =  Catalog.builder()
                .genre(genre)
                .movies(movies)
                .series(series)
                .build();
        return catalogo;

    }

    //se devuelve un catalogo vacio
    private Catalog findAllEmpty(CallNotPermittedException ex){
        return Catalog.builder()
                .movies(new ArrayList<>())
                .series(new ArrayList<>())
                .build();
    }

}
