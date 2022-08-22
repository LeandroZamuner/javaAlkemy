package com.gestion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="personaje")
public class characters {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String Nombre;
	
	@Column(name="Peliculas_o_SeriesAsociados")
	private String PeliculasoSeriesAsociados;
	
	private Integer Peso;
	
	private String Imagen;
	
	
	private String Historia;

	public characters(Integer id, String nombre, String peliculasoseriesasociados, Integer peso, String imagen, String historia) {
		super();
		this.id = id;
		this.Nombre = nombre;
		this.PeliculasoSeriesAsociados = peliculasoseriesasociados;
		this.Peso = peso;
		this.Imagen = imagen;
		this.Historia = historia;
	}
	
	public characters(String nombre, String peliculasoseriesasociados, Integer peso, String imagen, String historia) {
		super();
		this.Nombre = nombre;
		this.PeliculasoSeriesAsociados = peliculasoseriesasociados;
		this.Peso = peso;
		this.Imagen = imagen;
		this.Historia = historia;
	}
	
	public characters() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String titulo) {
		this.Nombre = titulo;
	}

	public String PeliculasoSeriesAsociados() {
		return PeliculasoSeriesAsociados;
	}

	public void setPeliculasoSeriesAsociados(String peliculasoseriesasociados) {
		this.PeliculasoSeriesAsociados = peliculasoseriesasociados;
	}

	public String getPeliculasoSeriesAsociados() {
		return PeliculasoSeriesAsociados;
	}

	public Integer getPeso() {
		return Peso;
	}

	public void setPeso(Integer peso) {
		Peso = peso;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public String getHistoria() {
		return Historia;
	}

	public void setHistoria(String historia) {
		this.Historia = historia;
	}
	
}
