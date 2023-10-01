package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Topicomodel;
import com.example.demo.repositores.Topicorepository;

@Service
public class Topicoservices {
    @Autowired
    Topicorepository topicorepository;

    public ArrayList<Topicomodel> obtenTopico() {
        return (ArrayList<Topicomodel>) topicorepository.findAll();

    }

    public Topicomodel guardarTopico(Topicomodel usuario) {
        return topicorepository.save(usuario);
    }

    public Optional<Topicomodel> obtenerPorid(Long id) {
        return topicorepository.findById(id);
    }

    public boolean eliminarTopico(Long id) {
        try {
            topicorepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

}
