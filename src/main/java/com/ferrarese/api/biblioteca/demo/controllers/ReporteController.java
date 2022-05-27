package com.ferrarese.api.biblioteca.demo.controllers;

import com.ferrarese.api.biblioteca.demo.models.AutorModel;
import com.ferrarese.api.biblioteca.demo.models.LibroModel;
import com.ferrarese.api.biblioteca.demo.services.ReporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/reportes")

public class ReporteController {

    @Autowired
    ReporteService reporteService;

    @GetMapping("/ordenar")
    public ArrayList<LibroModel> ordenarLibros(){
        return reporteService.librosOrdenadosPorTitulo();
    }

    @GetMapping("cantidad/{id}")
    public int totalDeLibrosPorAutor (@PathVariable int id){
        return reporteService.cantidadDeLibrosPorAutor(id);
    }

    @GetMapping("/titulo")
    public ArrayList<LibroModel> filtrarLibrosPorTitulo (@RequestParam(required = false) String titulo){
        return reporteService.librosFiltradosPorTitulo(titulo);
    }

    @GetMapping("nombre_autor")
    public ArrayList<AutorModel> filtrarAutoresPorSuNombre (@RequestParam(required = false) String nombre){
        return reporteService.filtrarAutorPorNombre(nombre);
    }

}
