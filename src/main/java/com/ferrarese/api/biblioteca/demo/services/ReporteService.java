package com.ferrarese.api.biblioteca.demo.services;
import com.ferrarese.api.biblioteca.demo.models.AutorModel;
import com.ferrarese.api.biblioteca.demo.models.LibroModel;
import com.ferrarese.api.biblioteca.demo.repositories.AutorRepository;
import com.ferrarese.api.biblioteca.demo.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.ArrayList;

@Service
@ApplicationScope
public class ReporteService {
    @Autowired
    AutorRepository autorRepository;
    @Autowired
    LibroRepository libroRepository;

    public ArrayList<LibroModel> librosOrdenadosPorTitulo(){
        return libroRepository.getAllOrdenadosPorTitulo();
    }

    public int cantidadDeLibrosPorAutor(int id_autor){
        return libroRepository.contarLibrosPorAutor(id_autor);
    }

    public ArrayList<LibroModel> librosFiltradosPorTitulo(String titulo){
        return  libroRepository.getLibrosFiltradosPorTitulo(titulo);
    }

    public ArrayList<AutorModel> filtrarAutorPorNombre(String nombre){
        return autorRepository.getAutorByNombre(nombre);
    }


}
