package com.example.demo.dto;



public class RecetasDto {
    
    private Long id;
    private String nombre;
    private String descripcion;
    private String ingredientes;


    //Constructor Vacio
    public RecetasDto() {
    }

    //Contructor
    public RecetasDto(String descripcion, Long id, String ingredientes, String nombre) {
        this.descripcion = descripcion;
        this.id = id;
        this.ingredientes = ingredientes;
        this.nombre = nombre;
    }

    //Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    


}
