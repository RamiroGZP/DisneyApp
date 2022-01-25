package com.disneyapp.DisneyApp.Dto;

public class GeneroDto {

    private String Nombre;
    private String imagen;

    public GeneroDto(String nombre, String imagen) {
        Nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
