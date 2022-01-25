package com.disneyapp.DisneyApp.repository;

import com.disneyapp.DisneyApp.entity.Genero;
import com.disneyapp.DisneyApp.entity.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Integer> {

    Boolean existsPersonajeByNombre(String nombre);
    Personaje findByNombre(String nombre);

}
