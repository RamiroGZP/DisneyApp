package com.disneyapp.DisneyApp.service;

import com.disneyapp.DisneyApp.entity.Pelicula;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public interface PeliculaService {
    Boolean existsByTitulo(String tituloPelicula);
    Pelicula findByTitulo(String tituloPelicula);
}
