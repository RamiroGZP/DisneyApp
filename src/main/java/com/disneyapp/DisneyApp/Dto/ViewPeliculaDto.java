package com.disneyapp.DisneyApp.Dto;

public class ViewPeliculaDto {

    private String imagen;
    private String titulo;

    public ViewPeliculaDto(String imagen, String titulo) {
        this.imagen = imagen;
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
