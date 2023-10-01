package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Topicomodel;
import com.example.demo.services.Topicoservices;

@RestController
@RequestMapping("/topico")
public class Topicocontroller {
    @Autowired
    Topicoservices topicoservices;

    @GetMapping()
    public ArrayList<Topicomodel> obtenTopico() {
        return topicoservices.obtenTopico();
    }

    @PostMapping()
    public Topicomodel guardarTopico(@RequestBody Topicomodel topico) {
        return this.topicoservices.guardarTopico(topico);
    }

    @GetMapping(path = "/{id}")
    public Optional<Topicomodel> obtenerTopicoPorId(@PathVariable("id") Long id) {
        return this.topicoservices.obtenerPorid(id);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.topicoservices.eliminarTopico(id);
        if (ok) {
            return "Se elimino el topico con id" + id;
        } else {
            return "No pudo eliminar el topico con id" + id;
        }
    }
}
