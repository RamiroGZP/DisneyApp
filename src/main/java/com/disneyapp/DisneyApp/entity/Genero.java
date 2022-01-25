package com.disneyapp.DisneyApp.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "genero")

public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private String nombre;
    private String imagen;

    @OneToMany(mappedBy = "genero")
    private Set<Pelicula> peliculasAsociadas;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Set<Pelicula> getPeliculasAsociadas() {
        return peliculasAsociadas;
    }

    public void setPeliculasAsociadas(Set<Pelicula> peliculasAsociadas) {
        this.peliculasAsociadas = peliculasAsociadas;
    }
}
