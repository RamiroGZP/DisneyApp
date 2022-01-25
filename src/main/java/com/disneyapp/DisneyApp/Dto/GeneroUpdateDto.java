package com.disneyapp.DisneyApp.Dto;

public class GeneroUpdateDto {

    private String nombreAnterior;
    private String nombreNuevo;
    private String imagenNueva;

    public GeneroUpdateDto(String nombreAnterior, String nombreNuevo, String imagenNueva) {
        this.nombreAnterior = nombreAnterior;
        this.nombreNuevo = nombreNuevo;
        this.imagenNueva = imagenNueva;
    }

    public String getNombreAnterior() {
        return nombreAnterior;
    }

    public void setNombreAnterior(String nombreAnterior) {
        this.nombreAnterior = nombreAnterior;
    }

    public String getNombreNuevo() {
        return nombreNuevo;
    }

    public void setNombreNuevo(String nombreNuevo) {
        this.nombreNuevo = nombreNuevo;
    }

    public String getImagenNueva() {
        return imagenNueva;
    }

    public void setImagenNueva(String imagenNueva) {
        this.imagenNueva = imagenNueva;
    }
}
