package com.mycompany.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mycompany.modelo.Libro;

@Repository
public interface ILibro extends JpaRepository<Libro, Integer> {

	@Query(value = " SELECT * FROM libro p WHERE p.Titulo LIKE %?1% OR p.Autor LIKE %?1% OR p.Editorial LIKE %?1% OR p.Volumen LIKE %?1%", nativeQuery = true)
	public List<Libro> findAll(String clave);

}
