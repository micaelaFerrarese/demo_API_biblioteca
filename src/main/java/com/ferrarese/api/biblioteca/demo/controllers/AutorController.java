package com.ferrarese.api.biblioteca.demo.controllers;
import com.ferrarese.api.biblioteca.demo.models.AutorModel;
import com.ferrarese.api.biblioteca.demo.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/autor")

public class AutorController {


    @Autowired
    AutorService autorService;

    @GetMapping()
    public ArrayList<AutorModel> obtenerAutores() {
        return autorService.obtenerTodosLosAutores();
    }

    //test en Postman
    @PostMapping()
    public AutorModel guardarAutor(@RequestBody AutorModel autor) {
        return this.autorService.guardarAutor(autor);
    }

    @GetMapping(path = "/{idAutor}")
    public Optional<AutorModel> obtenerAutorPorId(@PathVariable("idAutor") Integer idAutor) {
        return this.autorService.obtenerAutorPorId(idAutor);
    }


    //test en postman
    @DeleteMapping(path = "/{idAutor}")
    public String eliminarAutorPorId(@PathVariable("idAutor") Integer idAutor) {
        boolean ok = this.autorService.eliminarAutor(idAutor);
        if (ok) {
            return "Se eliminó el autor con el id: " + idAutor;
        } else {
            return "No se pudo eliminar el autor con el id: " + idAutor;
        }

    }

}
