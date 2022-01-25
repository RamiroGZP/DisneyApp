package com.disneyapp.DisneyApp.service;

import com.disneyapp.DisneyApp.Dto.GeneroDto;
import com.disneyapp.DisneyApp.Dto.GeneroUpdateDto;
import com.disneyapp.DisneyApp.entity.Genero;
import com.disneyapp.DisneyApp.mapper.GeneroMapper;
import com.disneyapp.DisneyApp.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class GeneroServiceImpl implements GeneroService{

    @Autowired
    GeneroRepository generoRepository;

    @Autowired
    GeneroMapper generoMapper;

    @Override
    public void saveGenero(GeneroDto newGenero){
        generoRepository.save(generoMapper.toEntity(newGenero));
    }

    @Override
    public void updateGenero(GeneroUpdateDto updateGenero){
        Genero oldGenero =  generoRepository.findByNombre(updateGenero.getNombreAnterior());

        oldGenero.setNombre(updateGenero.getNombreNuevo());
        oldGenero.setImagen(updateGenero.getImagenNueva());
    }

    @Override
    public ArrayList<Genero> getGeneros(){
        return (ArrayList<Genero>) generoRepository.findAll();
    }

    @Override
    public void deleteGenero(int id){
        generoRepository.deleteById(id);
    }

    @Override
    public Boolean existsById(int id){
        return generoRepository.existsById(id);
    }
    public Boolean existsByNombre(String nombre){
        return generoRepository.existsGeneroByNombre(nombre);
    }

    @Override
    public Genero getByNombre (String nombre){
        return generoRepository.findByNombre(nombre);
    };
}
