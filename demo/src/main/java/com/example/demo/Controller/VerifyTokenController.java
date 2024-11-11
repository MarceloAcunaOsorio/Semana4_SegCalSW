package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Recetas;
import com.example.demo.Service.RecetaService;


@RestController
public class VerifyTokenController {

    @Autowired
    private RecetaService recetaService;

    @RequestMapping("/token")
    public String token() {
        return "Hola si funciona el token de acceso!";
    }
    
    //Seccion de admin
    @RequestMapping("/admin")
    public String admin() {
        return "Hola bienvenido Admin!";
    }

    //Crear
    @PostMapping("/admin/crearReceta")
    public Recetas createProductoAdmin(@RequestBody Recetas receta){
      return recetaService.createReceta(receta);
    }

    //Actualizar Recetas
    @PutMapping("/admin/actualizar/{id}")
    public Recetas updateRecetaAdmin(@PathVariable Long id, @RequestBody Recetas receta){
        return recetaService.updateRecetas(id, receta);
    }

    //Eliminar Recetas
    @DeleteMapping("/admin/eliminar/{id}")
    public void deleteRecetaAdmin(@PathVariable Long id){
        recetaService.deleteRecetas(id);
    }

    //Listar Recetas
    @GetMapping("/admin/listado")
    public List<Recetas>getAllRecetasadmin(){
        return recetaService.getAllRecetas();
    }

    //buscar producto
    @GetMapping("/admin/{id}")
    public Optional<Recetas>getRecetasAdminById(@PathVariable Long id){
        return recetaService.getRecetaById(id);
    }

    @GetMapping("admin/home")
    public List<Recetas>getAllRecetassadmin(){
        return recetaService.getAllRecetas();
    }




    
    //Seccion de usuario
    @GetMapping("user/home")
    public List<Recetas>getAllRecetasUser(){
        return recetaService.getAllRecetas();
    }

    @GetMapping("/user/{id}")
    public Optional<Recetas>getRecetaById(@PathVariable Long id){
        return recetaService.getRecetaById(id);
    }

    @RequestMapping("/user")
    public String user() {
        return "Hola bienvenido User!";
    }
    
}
