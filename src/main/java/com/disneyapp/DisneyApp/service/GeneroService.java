package com.disneyapp.DisneyApp.service;

import com.disneyapp.DisneyApp.Dto.GeneroDto;
import com.disneyapp.DisneyApp.Dto.GeneroUpdateDto;
import com.disneyapp.DisneyApp.entity.Genero;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public interface GeneroService {

    void saveGenero(GeneroDto newGenero);
    void updateGenero(GeneroUpdateDto updateGenero);
    void deleteGenero(int id);
    ArrayList<Genero> getGeneros();
    Boolean existsById(int id);
    Boolean existsByNombre(String nombre);
    Genero getByNombre (String nombre);

}
