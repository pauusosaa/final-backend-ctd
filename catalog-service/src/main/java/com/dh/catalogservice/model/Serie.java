package com.dh.catalogservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document (collection = "series")
@Getter @Setter
public class Serie {

    @Id
    public String id;
    public String name;
    public String genre;
    public List<Season> season;
}
