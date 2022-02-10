package com.mycompany.interfaceService;

import java.util.List;
import java.util.Optional;

import com.mycompany.modelo.Libro;



public interface ILibroService {
	public List<Libro>listar(String clave);
	public Optional<Libro>listarId(int id);
	public void save(Libro L);
	public Libro get(int id);
	public void delete(int id);
	
}
