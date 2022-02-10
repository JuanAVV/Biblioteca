package com.mycompany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.interfaceService.ILibroService;
import com.mycompany.interfaces.ILibro;
import com.mycompany.modelo.Libro;

@Service
public class LibroService implements ILibroService{

	@Autowired
	private ILibro data;
	@Override
	public List<Libro> listar(String clave) {
		if(clave != null) {
	return data.findAll(clave);
		}
		return data.findAll();
	}
	
	
	@Override
	public Optional<Libro> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void save(Libro L) {
		data.save(L);
	}
	
	@Override
	public Libro get(int id) {
		return data.findById(id).get();
	}
	
	@Override
	public void delete(int id) {
		data.deleteById(id);
	}
}
