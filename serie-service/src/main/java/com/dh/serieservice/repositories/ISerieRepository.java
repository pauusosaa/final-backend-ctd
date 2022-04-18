package com.dh.serieservice.repositories;

import com.dh.serieservice.document.Serie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ISerieRepository extends MongoRepository <Serie, String> {
}
