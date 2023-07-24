package com.example.demo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "categorias",path = "categorias")
public interface CategoriaDAO extends JpaRepository<Categoria,Long>,PagingAndSortingRepository<Categoria,Long>{
    List<Categoria>findByNombre(@Param("nombre") String nombre);
}