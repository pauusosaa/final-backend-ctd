package com.dh.serieservice.services;

import com.dh.serieservice.document.Serie;

import java.util.List;
import java.util.Optional;

public interface ISerieService {

     public List<Serie> findSerieByGenre(String genre);
     public Serie save(Serie serie);
}
