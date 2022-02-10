package com.mycompany.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Estante")
public class Estante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEstante;
	private String Letra;
	
	@ManyToOne()
	private Sala Sala;
	
	@OneToMany(mappedBy = "Estante")
	private List<Libro> libro;
	
	public Estante() {
		// TODO Auto-generated constructor stub
	}	

	public Estante(int idEstante, String letra, com.mycompany.modelo.Sala sala, List<Libro> libro) {
		super();
		this.idEstante = idEstante;
		Letra = letra;
		Sala = sala;
		this.libro = libro;
	}

	public int getIdEstante() {
		return idEstante;
	}

	public void setIdEstante(int idEstante) {
		this.idEstante = idEstante;
	}

	public String getLetra() {
		return Letra;
	}

	public void setLetra(String letra) {
		Letra = letra;
	}

	public List<Libro> getLibro() {
		return libro;
	}

	public void setLibro(List<Libro> libro) {
		this.libro = libro;
	}

	public Sala getSala() {
		return Sala;
	}

	public void setSala(Sala sala) {
		Sala = sala;
	}
			
}
