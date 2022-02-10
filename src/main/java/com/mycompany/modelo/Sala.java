package com.mycompany.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sala")
public class Sala {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSala;
	private String Nombre;
	
	
	public Sala() {
		// TODO Auto-generated constructor stub
	}

	public Sala(int idSala, String nombre, com.mycompany.modelo.Estante estante) {
		super();
		this.idSala = idSala;
		Nombre = nombre;
	}


	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

}
