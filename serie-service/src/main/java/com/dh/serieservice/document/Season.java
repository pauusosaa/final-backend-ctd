package com.dh.serieservice.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;

@Document (collection = "Season")
@Getter @Setter
public class Season {

    @Id
    public String id;
    public int seasonNumber;
    public List<Chapter> chapters;

}
