package com.ferrarese.api.biblioteca.demo.repositories;

import com.ferrarese.api.biblioteca.demo.models.LibroModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface LibroRepository extends CrudRepository<LibroModel, Long> {

    //public abstract ArrayList<LibroModel> getLibrosByIdAutor(Integer id_autor);

    public abstract ArrayList<LibroModel>  getAllOrdenadosPorTitulo();

    public abstract ArrayList<LibroModel>  getLibrosFiltradosPorTitulo(String titulo);

    public abstract int contarLibrosPorAutor (int id_autor);
}
