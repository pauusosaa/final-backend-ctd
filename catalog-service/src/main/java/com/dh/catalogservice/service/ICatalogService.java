package com.dh.catalogservice.service;

import com.dh.catalogservice.model.Catalog;

public interface ICatalogService {

    public Catalog getCatalogByGenre(String genre);
}
