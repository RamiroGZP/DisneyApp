package com.disneyapp.DisneyApp.controller;


import com.disneyapp.DisneyApp.Dto.*;
import com.disneyapp.DisneyApp.entity.Genero;

import com.disneyapp.DisneyApp.mapper.GeneroMapper;
import com.disneyapp.DisneyApp.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/genero")
public class GeneroController {

    @Autowired
    GeneroService generoService;

    @Autowired
    GeneroMapper generoMapper;


    @PostMapping()
    public ResponseEntity<?> saveGenero(@Valid @RequestBody GeneroDto newGenero, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return new ResponseEntity(new MensajeDto("campos mal puestos"), HttpStatus.BAD_GATEWAY);
        }
        if(generoService.existsByNombre(newGenero.getNombre())){
            return new ResponseEntity(new MensajeDto("El genero ya se encuentra ingresado."), HttpStatus.BAD_GATEWAY);
        }
        generoService.saveGenero(newGenero);
        return new ResponseEntity((new MensajeDto("Genero creado con exito!")),HttpStatus.OK);
    }

    @GetMapping()
    public ArrayList<Genero> getGeneros(){
        return generoService.getGeneros();
    }

    @PutMapping()
    public ResponseEntity<?> updateGenero(@Valid @RequestBody GeneroUpdateDto updateGenero, BindingResult bindingResult){

        if(generoService.existsByNombre(updateGenero.getNombreAnterior())){
            generoService.updateGenero(updateGenero);
            return new ResponseEntity<>(new MensajeDto("El Genero ha sido modificado"), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new MensajeDto("Genero no encontrado"),
                    HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping()
    public ResponseEntity<?> deleteGenero(@Valid @RequestBody int id, BindingResult bindingResult){

        if(generoService.existsById(id)){
            generoService.deleteGenero(id);

            return new ResponseEntity<>(new MensajeDto("El genero ha sido eliminado"), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(new MensajeDto("Genero no encontrado"), HttpStatus.BAD_REQUEST);
        }

    }
}
