package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="categorias")
public class Categoria{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToMany(targetEntity=Instrumento.class,mappedBy="categoria")
    @OrderBy("nombre ASC")
    private Set<Instrumento> instrumentos=new HashSet<>();
    public Categoria(){

    }
    public Categoria(Long id,String nombre){
        this.id=id;
        this.nombre=nombre;
    }
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Set<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(Set<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }

}