package com.example.demo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.FetchType;

@Entity
@Table(name="instrumentos")
public class Instrumento{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_categoria")
    private Categoria categoria;
    public Instrumento(){

    }
    public Instrumento(Long id,String nombre,Categoria categoria){
        this.id=id;
        this.nombre=nombre;
        this.categoria=categoria;
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
    public Categoria getCategoria(){
        return this.categoria;
    }
    public void setCategoria(Categoria categoria){
        this.categoria=categoria;
    }
    

}