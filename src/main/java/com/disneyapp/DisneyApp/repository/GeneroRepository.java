package com.disneyapp.DisneyApp.repository;


import com.disneyapp.DisneyApp.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, Integer> {

    Boolean existsGeneroByNombre(String nombre);
    Genero findById(int id);
    Genero findByNombre(String nombre);
}
