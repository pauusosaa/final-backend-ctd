package com.dh.catalogservice.repository.feign;

import com.dh.catalogservice.model.Serie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "serie-service")
public interface SerieFeignRepository {

    @GetMapping("/series/{genre}")
    List<Serie> getSerieByGenre(@PathVariable String genre);
}
