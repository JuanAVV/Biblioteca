package com.mycompany.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mycompany.interfaceService.ISalaService;
import com.mycompany.interfaces.ISala;
import com.mycompany.modelo.Sala;

public class SalaService implements ISalaService{

	@Autowired
	private ISala data;
	
	@Override
	public List<Sala> lista() {
		return (List<Sala>)data.findAll();
	}

	@Override
	public Optional<Sala> listarId(int id) {
		return null;
	}

}
