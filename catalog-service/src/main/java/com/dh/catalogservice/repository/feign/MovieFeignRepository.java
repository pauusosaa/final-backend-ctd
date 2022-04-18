package com.dh.catalogservice.repository.feign;


import com.dh.catalogservice.model.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "movie-service")
public interface MovieFeignRepository {

    @GetMapping("/movies/{genre}")
    List<Movie> getMovieByGenre(@PathVariable String genre);
}
