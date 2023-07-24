package com.example.demo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "instrumentos",path = "instrumentos")
public interface InstrumentoDAO extends JpaRepository<Instrumento,Long>,PagingAndSortingRepository<Instrumento,Long>{
    List<Instrumento>findByNombre(@Param("nombre") String nombre);
}