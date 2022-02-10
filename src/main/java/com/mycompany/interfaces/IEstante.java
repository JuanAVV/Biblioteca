package com.mycompany.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.modelo.Estante;

@Repository
public interface IEstante extends CrudRepository<Estante, Integer> {

}
