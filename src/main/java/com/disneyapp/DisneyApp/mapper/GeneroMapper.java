package com.disneyapp.DisneyApp.mapper;

import com.disneyapp.DisneyApp.Dto.GeneroDto;
import com.disneyapp.DisneyApp.Dto.GeneroUpdateDto;
import com.disneyapp.DisneyApp.entity.Genero;
import org.mapstruct.Mapper;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface GeneroMapper {

    Genero toEntity (GeneroDto generoDto);
    Genero toEntity (GeneroUpdateDto generoUpdateDto);
    GeneroDto toDTO (Optional<Genero> genero);
}
