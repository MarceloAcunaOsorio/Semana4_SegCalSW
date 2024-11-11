package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Recetas;

public interface RecetaService {
    
     //listar producto
     List<Recetas> getAllRecetas();

     //buscar producto por id
     Optional<Recetas> getRecetaById(Long _IdRecetas);
  
     //metodo para actualizar, crear y eliminar
     Recetas createReceta(Recetas _IdReceta);
     Recetas updateRecetas(Long _IdReceta, Recetas recetas);
     void deleteRecetas(Long _IdReceta);
}
