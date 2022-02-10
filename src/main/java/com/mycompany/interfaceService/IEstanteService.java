package com.mycompany.interfaceService;

import java.util.List;
import java.util.Optional;

import com.mycompany.modelo.Estante;

public interface IEstanteService {

	public List<Estante>listar();
	public Optional<Estante>listarId(int id);
}
