package com.dh.serieservice.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;



@Document (collection = "chapters")
@Getter @Setter
public class Chapter {

    public String id;
    public String name;
    public int number;
    public String urlStream;



}
