package com.ferrarese.api.biblioteca.demo.models;
import javax.persistence.*;

@Entity
@Table(name = "autor")

public class AutorModel {
    @Id
    private int idAutor;

    private String nombre;


    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int id) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
