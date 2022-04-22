package com.dh.catalogservice.controllers;

import com.dh.catalogservice.model.Catalog;
import com.dh.catalogservice.service.ICatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/catalog")
@CrossOrigin
public class CatalogController {

    @Autowired
    ICatalogService catalogService;

    @GetMapping("/{genre}")
    ResponseEntity<Catalog> getCatalogByGenre(@PathVariable String genre) {
        return ResponseEntity.ok().body(catalogService.getCatalogByGenre(genre));
    }
}
