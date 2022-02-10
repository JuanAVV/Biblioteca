package com.mycompany.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Libro")

public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLibro;
	private String Titulo;
	private String Autor;
	private String Editorial;
	private String Volumen;
	
	@ManyToOne
	private Estante Estante;
	
public Libro() {
	// TODO Auto-generated constructor stub
}




public Libro(int idLibro, String titulo, String autor, String editorial, String volumen,
		com.mycompany.modelo.Estante estante) {
	super();
	this.idLibro = idLibro;
	Titulo = titulo;
	Autor = autor;
	Editorial = editorial;
	Volumen = volumen;
	Estante = estante;
}





public int getIdLibro() {
	return idLibro;
}

public void setIdLibro(int idLibro) {
	this.idLibro = idLibro;
}

public String getTitulo() {
	return Titulo;
}

public void setTitulo(String titulo) {
	Titulo = titulo;
}

public String getAutor() {
	return Autor;
}

public void setAutor(String autor) {
	Autor = autor;
}

public String getEditorial() {
	return Editorial;
}

public void setEditorial(String editorial) {
	Editorial = editorial;
}

public String getVolumen() {
	return Volumen;
}

public void setVolumen(String volumen) {
	Volumen = volumen;
}

public Estante getEstante() {
	return Estante;
}

public void setEstante(Estante estante) {
	Estante = estante;
}
	
}
