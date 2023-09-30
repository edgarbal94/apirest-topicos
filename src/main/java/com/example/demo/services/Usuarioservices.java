package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Usuariomodel;
import com.example.demo.repositores.Usuariorepository;

@Service
public class Usuarioservices {
    @Autowired
    Usuariorepository usuariorepository;

    public ArrayList<Usuariomodel> obtenUsuarios() {
        return (ArrayList<Usuariomodel>) usuariorepository.findAll();

    }

    public Usuariomodel guardarUsuario(Usuariomodel usuario) {
        return usuariorepository.save(usuario);
    }

    public Optional<Usuariomodel> obtenerPorid(Long id) {
        return usuariorepository.findById(id);
    }

    public ArrayList<Usuariomodel> obtenerPorPrioridad(Long id) {
        return usuariorepository.findByPrioridad(id);
    }

    public boolean eliminarUsuario(Long id) {
        try {
            usuariorepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
