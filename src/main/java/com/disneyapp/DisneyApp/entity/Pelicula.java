package com.disneyapp.DisneyApp.entity;

import javax.persistence.*;
import java.time.DateTimeException;
import java.util.Set;

@Entity
@Table(name = "pelicula")
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private String imagen;
    private String titulo;
    private String fechaCreacion;
    private Integer calificacion;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero genero;

    //@OneToMany(mappedBy = "pelicula")
    //private Set<Personaje> personajesAsociados;
    @ManyToMany(mappedBy = "peliculasAsociadas")
    Set<Personaje> personajesAsociados;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Set<Personaje> getPersonajesAsociados() {
        return personajesAsociados;
    }

    public void setPersonajesAsociados(Set<Personaje> personajesAsociados) {
        this.personajesAsociados = personajesAsociados;
    }
}
