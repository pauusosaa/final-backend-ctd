package com.dh.catalogservice.service;

import com.dh.catalogservice.model.Movie;
import com.dh.catalogservice.model.Serie;

import java.util.List;

public interface ISerieService {
    public Serie save(Serie movie);
    public List<Serie> findSeriesByGenre(String genre);
}
