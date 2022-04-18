package com.dh.serieservice.services.Impl;

import com.dh.serieservice.document.Serie;
import com.dh.serieservice.repositories.ISerieRepository;
import com.dh.serieservice.services.ISerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SerieService implements ISerieService {

    @Autowired
    ISerieRepository repository;

    @Override
    public Optional<Serie> findById(String id) {
       return repository.findById(id);
    }

    @Override
    public Serie save(Serie serie) {
        return repository.save(serie);
    }
}
