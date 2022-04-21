package com.dh.catalogservice.service.Impl;

import com.dh.catalogservice.model.Serie;
import com.dh.catalogservice.repository.feign.SerieFeignRepository;
import com.dh.catalogservice.service.ISerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SerieService implements ISerieService {

    @Autowired
    SerieFeignRepository serieFeignRepository;

    @Override
    public Serie save(Serie serie) {
        return (Serie) serieFeignRepository.save(serie).getBody();
    }

    @Override
    public List<Serie> findSeriesByGenre(String genre) {
        return serieFeignRepository.getSerieByGenre(genre);
    }
}
