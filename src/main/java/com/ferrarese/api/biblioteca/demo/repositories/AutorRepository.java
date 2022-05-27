package com.ferrarese.api.biblioteca.demo.repositories;
import com.ferrarese.api.biblioteca.demo.models.AutorModel;
import com.ferrarese.api.biblioteca.demo.models.LibroModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface AutorRepository extends CrudRepository<AutorModel, Integer> {

    public abstract ArrayList<AutorModel> getAutorByNombre(String nombre);
}
