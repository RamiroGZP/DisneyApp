package com.disneyapp.DisneyApp.controller;

import com.disneyapp.DisneyApp.Dto.*;
import com.disneyapp.DisneyApp.entity.Pelicula;
import com.disneyapp.DisneyApp.entity.Personaje;
import com.disneyapp.DisneyApp.mapper.PersonajeMapper;
import com.disneyapp.DisneyApp.service.PeliculaService;
import com.disneyapp.DisneyApp.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/characters")
public class PersonajeController {

    @Autowired
    PersonajeService personajeService;

    @Autowired
    PersonajeMapper personajeMapper;

    @Autowired
    PeliculaService peliculaService;


    @PostMapping()
    public ResponseEntity<?> savePersonaje(@RequestBody PersonajeDto newPersonaje, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity(new MensajeDto("campos mal puestos"), HttpStatus.BAD_GATEWAY);
        }
        personajeService.savePersonaje(personajeMapper.toEntity(newPersonaje));
        return new ResponseEntity((new MensajeDto("Personaje ingresado con exito.")),HttpStatus.OK);
    }

    @GetMapping()
    public List<ViewPersonajeDto> getPersonajes(){
        return personajeService.getPersonajes();
    }

    @GetMapping("/detailCharacters")
    public List<ViewDetailPersonajeDto> getDetallePersonajes(){
        return personajeService.getDetallePersonajes();
    }

    @PutMapping()
    public ResponseEntity<?> updatePersonaje(@RequestBody PersonajeUpdateDto updatePersonaje, BindingResult bindingResult){

        if(personajeService.existsByNombre(updatePersonaje.getNombreAnterior())){
            personajeService.updatePersonaje(updatePersonaje);
            return new ResponseEntity<>(new MensajeDto("El Personaje ha sido modificado"), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new MensajeDto("Personaje no encontrado"),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping()
    public ResponseEntity<?> deletePersonaje(@Valid @RequestBody int id, BindingResult bindingResult){
        if(personajeService.existsById(id)){
            personajeService.deletePersonaje(id);
            return new ResponseEntity<>(new MensajeDto("El personaje ha sido eliminado"), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new MensajeDto("Personaje no encontrado"), HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/asignarPelicula")
    public ResponseEntity<?> asignarPelicula(@RequestBody String tituloPelicula, String nombrePersonaje, BindingResult bindingResult){

        if(peliculaService.existsByTitulo(tituloPelicula) && personajeService.existsByNombre(nombrePersonaje)){
            Pelicula pelicula = peliculaService.findByTitulo(tituloPelicula);
            Personaje personaje = personajeService.findByNombre(nombrePersonaje);
            personajeService.asignarPelicula(pelicula,personaje);
            return new ResponseEntity<>(new MensajeDto("La Pelicula fue asignada correctamente"), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new MensajeDto("Personaje o pelicula no encontrada"),
                    HttpStatus.BAD_REQUEST);
        }
    }
}
