package com.disneyapp.DisneyApp.Dto;

public class ViewPersonajeDto {

    private String imagen;
    private String nombre;

    public ViewPersonajeDto(String imagen, String nombre) {
        this.imagen = imagen;
        this.nombre = nombre;
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
}
