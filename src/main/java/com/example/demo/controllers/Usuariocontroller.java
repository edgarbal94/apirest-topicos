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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Usuariomodel;
import com.example.demo.services.Usuarioservices;

@RestController
@RequestMapping("/usuario")
public class Usuariocontroller {
    @Autowired
    Usuarioservices usuarioservices;

    @GetMapping()
    public ArrayList<Usuariomodel> obtenUsuarios() {
        return usuarioservices.obtenUsuarios();
    }

    @PostMapping()
    public Usuariomodel guardarUsuario(@RequestBody Usuariomodel usuario) {
        return this.usuarioservices.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<Usuariomodel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
        return this.usuarioservices.obtenerPorid(id);
    }

    @GetMapping("/query")
    public ArrayList<Usuariomodel> obtenUsuarioPorPrioridad(@RequestParam("prioridad") Long prioridad) {
        return this.usuarioservices.obtenerPorPrioridad(prioridad);

    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.usuarioservices.eliminarUsuario(id);
        if (ok) {
            return "Se elimino el usuario con id" + id;
        } else {
            return "No pudo eliminar el usuario con id" + id;
        }
    }
}
