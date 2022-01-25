package com.disneyapp.DisneyApp.service;

import com.disneyapp.DisneyApp.Dto.PersonajeUpdateDto;
import com.disneyapp.DisneyApp.Dto.ViewDetailPersonajeDto;
import com.disneyapp.DisneyApp.Dto.ViewPersonajeDto;
import com.disneyapp.DisneyApp.entity.Pelicula;
import com.disneyapp.DisneyApp.entity.Personaje;
import com.disneyapp.DisneyApp.mapper.PersonajeMapper;
import com.disneyapp.DisneyApp.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonajeServiceImpl implements PersonajeService{

    @Autowired
    PersonajeRepository personajeRepository;

    @Autowired
    PersonajeMapper personajeMapper;

    @Override
    public void savePersonaje(Personaje newPersonaje) {
        personajeRepository.save(newPersonaje);
    }

    @Override
    public List<ViewPersonajeDto> getPersonajes(){
        return personajeMapper.toDTOList(personajeRepository.findAll());
    }

    @Override
    public List<ViewDetailPersonajeDto> getDetallePersonajes(){
        List<Personaje> listPersonajes = personajeRepository.findAll();

        List<ViewDetailPersonajeDto> listViewDetailPersonajes = personajeMapper.toViewDetailDTOList(listPersonajes);

        return listViewDetailPersonajes;
    }

    @Override
    public Boolean existsByNombre(String nombre){
        return personajeRepository.existsPersonajeByNombre(nombre);
    }

    @Override
    public void updatePersonaje(PersonajeUpdateDto updatePersonaje){
        Personaje oldPersonaje = personajeRepository.findByNombre(updatePersonaje.getNombreAnterior());

        oldPersonaje.setNombre(updatePersonaje.getNombreNuevo());
        oldPersonaje.setEdad(updatePersonaje.getEdad());
        oldPersonaje.setPeso(updatePersonaje.getPeso());
        oldPersonaje.setHistoria(updatePersonaje.getHistoria());
        oldPersonaje.setImagen(updatePersonaje.getImagen());
    }

    @Override
    public Boolean existsById(int id){
        return personajeRepository.existsById(id);
    }

    @Override
    public void deletePersonaje(int id){
        personajeRepository.deleteById(id);
    }

    @Override
    public Personaje findByNombre(String nombrePersonaje){
        return personajeRepository.findByNombre(nombrePersonaje);
    }

    @Override
    public void asignarPelicula(Pelicula pelicula, Personaje personaje){
        personaje.getPeliculasAsociadas().add(pelicula);
    }
}
