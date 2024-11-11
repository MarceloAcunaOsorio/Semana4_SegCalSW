package com.example.demo.Service.imple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Recetas;
import com.example.demo.Repository.RecetasRepository;
import com.example.demo.Service.RecetaService;

@Service
public class RecetasServiceImpl implements RecetaService {
    
     @Autowired
    private RecetasRepository recetaRepository;


    //mostrar listado de productos
    @Override
    public List<Recetas>getAllRecetas(){
        return recetaRepository.findAll();
    }

    //Consultar Producto por ID
    @Override
    public Optional<Recetas>getRecetaById(Long _IdReceta){
        return recetaRepository.findById(_IdReceta);
    }

    //Crear Producto
    @Override
    public Recetas createReceta(Recetas receta){
        return recetaRepository.save(receta);
    }


    //Actualizar Producto
    @Override
    public Recetas updateRecetas(Long _IdReceta, Recetas receta){
        if (recetaRepository.existsById(_IdReceta)) {
            receta.setId(_IdReceta);
            return recetaRepository.save(receta);
        }
        else
        {
            return null;
        }
    }


    //borrar producto
    @Override
    public void deleteRecetas(Long _IdProducto){
        recetaRepository.deleteById(_IdProducto);
    }
}
