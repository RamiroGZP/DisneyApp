package com.disneyapp.DisneyApp.service;

import com.disneyapp.DisneyApp.Dto.PersonajeDto;
import com.disneyapp.DisneyApp.Dto.PersonajeUpdateDto;
import com.disneyapp.DisneyApp.Dto.ViewDetailPersonajeDto;
import com.disneyapp.DisneyApp.Dto.ViewPersonajeDto;
import com.disneyapp.DisneyApp.entity.Pelicula;
import com.disneyapp.DisneyApp.entity.Personaje;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public interface PersonajeService {

    void savePersonaje(Personaje newPersonaje);
    List<ViewPersonajeDto> getPersonajes();
    List<ViewDetailPersonajeDto> getDetallePersonajes();
    Boolean existsByNombre(String nombre);
    void updatePersonaje(PersonajeUpdateDto updatePersonaje);
    Boolean existsById(int id);
    void deletePersonaje(int id);
    Personaje findByNombre(String nombrePersonaje);
    void asignarPelicula(Pelicula pelicula, Personaje personaje);
}
