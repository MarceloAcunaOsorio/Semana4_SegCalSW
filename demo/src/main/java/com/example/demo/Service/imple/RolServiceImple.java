package com.example.demo.Service.imple;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Rol;
import com.example.demo.Repository.RoleRepository;
import com.example.demo.Service.RolService;

@Service
public class RolServiceImple implements RolService {
    
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public Optional<Rol> findByname(String name) {
        return roleRepository.findByName(name);
    }
}
