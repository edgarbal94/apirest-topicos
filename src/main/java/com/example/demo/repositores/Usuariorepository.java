package com.example.demo.repositores;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.models.Usuariomodel;

@Repository
public interface Usuariorepository extends CrudRepository<Usuariomodel, Long> {
    public abstract ArrayList<Usuariomodel> findByPrioridad(Long id);

}