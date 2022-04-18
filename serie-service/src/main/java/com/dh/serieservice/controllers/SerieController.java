package com.dh.serieservice.controllers;

import com.dh.serieservice.document.Serie;
import com.dh.serieservice.services.ISerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/series")
public class SerieController {

    @Autowired
    ISerieService serieService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable String id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(serieService.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Serie pacienteDTO){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(serieService.save(pacienteDTO));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error. Por favor intente más tarde.\"}");
        }
    }

}
