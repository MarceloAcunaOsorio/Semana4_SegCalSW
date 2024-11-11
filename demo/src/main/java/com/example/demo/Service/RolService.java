package com.example.demo.Service;

import java.util.Optional;

import com.example.demo.Model.Rol;

public interface RolService {

     public Optional<Rol> findByname(String name);
}
