package com.disneyapp.DisneyApp.mapper;

import com.disneyapp.DisneyApp.Dto.GeneroDto;
import com.disneyapp.DisneyApp.Dto.PersonajeDto;
import com.disneyapp.DisneyApp.Dto.ViewDetailPersonajeDto;
import com.disneyapp.DisneyApp.Dto.ViewPersonajeDto;
import com.disneyapp.DisneyApp.entity.Genero;
import com.disneyapp.DisneyApp.entity.Personaje;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface PersonajeMapper {

    Personaje toEntity (PersonajeDto personajeDto);

    PersonajeDto toDto (Personaje personaje);

    ViewPersonajeDto toViewDto (Personaje personaje);

    ViewDetailPersonajeDto toViewDetailDto (Personaje personaje);

    default List<ViewPersonajeDto> toDTOList(List<Personaje> personajes){
        if(personajes == null){
            return new ArrayList<>();
        }
        return personajes.stream().map(this::toViewDto).collect(Collectors.toList());
    }

    default List<ViewDetailPersonajeDto> toViewDetailDTOList(List<Personaje> personajes){
        if(personajes == null){
            return new ArrayList<>();
        }
        return personajes.stream().map(this::toViewDetailDto).collect(Collectors.toList());
    }

}
