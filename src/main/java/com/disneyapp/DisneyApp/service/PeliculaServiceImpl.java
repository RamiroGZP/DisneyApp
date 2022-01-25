package com.disneyapp.DisneyApp.service;

import com.disneyapp.DisneyApp.entity.Pelicula;
import com.disneyapp.DisneyApp.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PeliculaServiceImpl implements PeliculaService{

    @Autowired
    PeliculaRepository peliculaRepository;

    @Override
    public Boolean existsByTitulo(String tituloPelicula) {
        return peliculaRepository.existsPeliculaByTitulo(tituloPelicula);
    }

    @Override
    public Pelicula findByTitulo(String tituloPelicula) {
        return peliculaRepository.findByTitulo(tituloPelicula);
    }
}
