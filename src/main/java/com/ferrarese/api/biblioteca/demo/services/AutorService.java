package com.ferrarese.api.biblioteca.demo.services;
import com.ferrarese.api.biblioteca.demo.models.AutorModel;
import com.ferrarese.api.biblioteca.demo.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public ArrayList<AutorModel> obtenerTodosLosAutores(){
        return (ArrayList<AutorModel>) autorRepository.findAll();
    }

    public AutorModel guardarAutor(AutorModel autor){
        return autorRepository.save(autor);
    }

    public Optional<AutorModel> obtenerAutorPorId(Integer idAutor){
        return autorRepository.findById(idAutor);
    }

    public boolean eliminarAutor(Integer idAutor){
        try{
            autorRepository.deleteById(idAutor);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
