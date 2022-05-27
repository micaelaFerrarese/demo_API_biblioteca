package com.ferrarese.api.biblioteca.demo.controllers;


import com.ferrarese.api.biblioteca.demo.models.LibroModel;
import com.ferrarese.api.biblioteca.demo.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/libro")

public class LibroController {

    @Autowired
    LibroService libroService;

    @GetMapping()
    public ArrayList<LibroModel> obtenerLibros(){
        return libroService.obtenerTodosLosLibros();
    }

    //test en Postman
    @PostMapping()
    public LibroModel guardarLibro(@RequestBody LibroModel libro){
        return this.libroService.guardarLibro(libro);
    }

    @GetMapping(path = "/{id}")
    public Optional<LibroModel> obtenerLibroPorId(@PathVariable("id")Long id){
        return this.libroService.obtenerPorId(id);
    }

    //localhost:8080/libro/query?id_autor=1
//    @GetMapping("/query")
//    public ArrayList<LibroModel> obtenerLibroPorIdAutor(@RequestParam("id_autor")Integer id_autor){
//        return this.libroService.obtenerPorIdDelAutor(id_autor);
//    }

    //test en postman
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.libroService.eliminarLibro(id);
        if(ok){
            return "Se eliminó el Libro con el id: " + id;
        }else{
            return "No se pudo eliminar el usuario con el id: " + id;
        }
    }






}


