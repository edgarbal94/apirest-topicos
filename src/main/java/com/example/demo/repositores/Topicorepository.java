package com.example.demo.repositores;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Topicomodel;

@Repository
public interface Topicorepository extends CrudRepository<Topicomodel, Long> {

}
