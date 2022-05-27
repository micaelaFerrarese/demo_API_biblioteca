package com.ferrarese.api.biblioteca.demo.services;

import com.ferrarese.api.biblioteca.demo.models.LibroModel;
import com.ferrarese.api.biblioteca.demo.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class LibroService {

    @Autowired
    LibroRepository libroRepository;

    public ArrayList<LibroModel> obtenerTodosLosLibros(){
       return (ArrayList<LibroModel>) libroRepository.findAll();
    }

    public LibroModel guardarLibro(LibroModel libro){
       return libroRepository.save(libro);
    }

    public Optional<LibroModel> obtenerPorId(Long id){
        return libroRepository.findById(id);
    }

    public boolean eliminarLibro(Long id){
        try{
            libroRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
