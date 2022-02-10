package com.mycompany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.interfaceService.IEstanteService;
import com.mycompany.interfaces.IEstante;
import com.mycompany.modelo.Estante;

@Service

public class EstanteService implements IEstanteService {

	@Autowired
	private IEstante data;
	
	@Override
	public List<Estante> listar() {
		return (List<Estante>)data.findAll();
	}

	@Override
	public Optional<Estante> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
