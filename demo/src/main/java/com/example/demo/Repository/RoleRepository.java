package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Rol;

@Repository
public interface RoleRepository extends JpaRepository<Rol, Long>{
    
    Optional<Rol> findByName(String name);
}