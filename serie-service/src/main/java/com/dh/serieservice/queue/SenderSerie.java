package com.dh.serieservice.queue;

import com.dh.serieservice.document.Serie;
import com.dh.serieservice.services.Impl.SerieService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;



@RequiredArgsConstructor
@Component
public class SenderSerie {

    private final SerieService serieService;

    private final RabbitTemplate rabbitTemplate;

    private final Queue queueSerie;


    public Serie send(Serie serie){
        rabbitTemplate.convertAndSend(queueSerie.getName(),serieService.save(serie));
        return serie;
    }
}
