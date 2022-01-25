package com.disneyapp.DisneyApp.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "personaje")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private String imagen;
    private String nombre;
    private Integer edad;
    private Double peso;
    private String historia;

    //@OneToMany(mappedBy = "personaje")
    //private Set<Pelicula> peliculasAsociadas;
    @ManyToMany
    @JoinTable(
    name = "personajes_pelicula",
    joinColumns = @JoinColumn(name = "id_personaje"),
    inverseJoinColumns = @JoinColumn(name = "id_pelicula"))
    Set<Pelicula> peliculasAsociadas;

    public int getId() { return id; }

    public void setId(int id) {this.id = id; }

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


    public Set<Pelicula> getPeliculasAsociadas() {
        return peliculasAsociadas;
    }

    public void setPeliculasAsociadas(Set<Pelicula> peliculasAsociadas) {
        this.peliculasAsociadas = peliculasAsociadas;
    }
}
