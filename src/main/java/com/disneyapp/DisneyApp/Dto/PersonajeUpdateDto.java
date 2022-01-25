package com.disneyapp.DisneyApp.Dto;

public class PersonajeUpdateDto {

    private String nombreAnterior;
    private String nombreNuevo;
    private Integer edad;
    private Double peso;
    private String historia;
    private String imagen;

    public PersonajeUpdateDto(String nombreAnterior, String nombreNuevo, Integer edad, Double peso, String historia, String imagen) {
        this.nombreAnterior = nombreAnterior;
        this.nombreNuevo = nombreNuevo;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.imagen = imagen;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
