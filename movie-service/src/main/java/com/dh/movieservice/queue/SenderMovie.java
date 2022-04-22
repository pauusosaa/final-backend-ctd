package com.dh.movieservice.queue;

import com.dh.movieservice.model.Movie;
import com.dh.movieservice.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Queue;



@RequiredArgsConstructor
@Component
public class SenderMovie {

    private final MovieService movieServices;
    private final RabbitTemplate rabbitTemplate;
    private final Queue queueMovie;

    public Movie send(Movie movie){
        rabbitTemplate.convertAndSend(queueMovie.getName(), movieServices.save(movie));
        return movie;
    }
}
