package com.mycompany.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.modelo.Sala;

@Repository
public interface ISala extends CrudRepository<Sala, Integer>{

}
