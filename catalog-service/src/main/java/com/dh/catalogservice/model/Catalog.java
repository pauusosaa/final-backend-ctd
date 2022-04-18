package com.dh.catalogservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Catalog")
@Builder
@Getter @Setter
public class Catalog {

    @Id
    public String id;
    public String genre;
    public List<Movie> movies;
    public List<Serie> series;

}
