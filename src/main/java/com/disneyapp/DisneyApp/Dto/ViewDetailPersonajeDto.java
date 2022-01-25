package com.disneyapp.DisneyApp.Dto;

import java.util.Set;

public class ViewDetailPersonajeDto {

    private String imagen;
    private String nombre;
    private Integer edad;
    private Integer peso;
    private String historia;
    Set<ViewPeliculaDto> peliculasAsociadas;

    public ViewDetailPersonajeDto(String imagen, String nombre, Integer edad, Integer peso, String historia, Set<ViewPeliculaDto> peliculasAsociadas) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.peliculasAsociadas = peliculasAsociadas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public Set<ViewPeliculaDto> getPeliculasAsociadas() {
        return peliculasAsociadas;
    }

    public void setPeliculasAsociadas(Set<ViewPeliculaDto> peliculasAsociadas) {
        this.peliculasAsociadas = peliculasAsociadas;
    }
}
