package com.dh.catalogservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document (collection = "seasons")
@Getter @Setter
public class Season {

    @Id
    public String id;
    public int seasonNumber;
    public List<Chapter> chapters;
}
