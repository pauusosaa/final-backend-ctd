package com.dh.serieservice.services;

import com.dh.serieservice.document.Serie;

import java.util.Optional;

public interface ISerieService {

     public Optional<Serie> findById(String id);
     public Serie save(Serie serie);
}
