package com.mycompany.interfaceService;

import java.util.List;
import java.util.Optional;

import com.mycompany.modelo.Sala;

public interface ISalaService {

	public List<Sala>lista();
	public Optional<Sala>listarId(int id);
}
