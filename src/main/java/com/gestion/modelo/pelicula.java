package com.gestion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="peliculas")
public class pelicula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String Titulo;
	
	@Column(name="Fecha_de_creacion")
	private String FechadeCreacion;
	
	private String Calificacion;
	
	private String Imagen;
	
	@Column(name="Personaje_Asociados")
	private String personajeAsociados;

	public pelicula(Integer id, String titulo, String fechadeCreacion, String calificacion, String imagen, String personajeAsociados) {
		super();
		this.id = id;
		this.Titulo = titulo;
		this.FechadeCreacion = fechadeCreacion;
		this.Calificacion = calificacion;
		this.Imagen = imagen;
		this.personajeAsociados = personajeAsociados;
	}
	
	public pelicula(String titulo, String fechadeCreacion, String calificacion, String imagen, String personajeAsociados) {
		super();
		this.Titulo = titulo;
		this.FechadeCreacion = fechadeCreacion;
		this.Calificacion = calificacion;
		this.Imagen = imagen;
		this.personajeAsociados = personajeAsociados;
	}
	
	public pelicula() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		this.Titulo = titulo;
	}

	public String getFechadeCreacion() {
		return FechadeCreacion;
	}

	public void setFechadeCreacion(String fechadeCreacion) {
		this.FechadeCreacion = fechadeCreacion;
	}

	public String getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(String calificacion) {
		Calificacion = calificacion;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public String getPersonajeAsociados() {
		return personajeAsociados;
	}

	public void setPersonajeAsociados(String personajeAsociados) {
		this.personajeAsociados = personajeAsociados;
	}
	
	
}
