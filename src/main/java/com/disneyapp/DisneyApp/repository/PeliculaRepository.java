package com.disneyapp.DisneyApp.repository;

import com.disneyapp.DisneyApp.entity.Genero;
import com.disneyapp.DisneyApp.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer> {
    Boolean existsPeliculaByTitulo(String titulo);
    Pelicula findByTitulo(String titulo);
}
