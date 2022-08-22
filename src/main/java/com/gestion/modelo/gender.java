package com.gestion.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="genero")
public class gender {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String Nombre;
	private String Imagen;

	@Column(name = "Peliculas_o_SeriesAsociados")
	private String PeliculasoSeriesAsociados;

	public gender(Integer id, String nombre, String imagen, String peliculasoseriesasociados) {
		super();
		this.id = id;
		this.Nombre = nombre;
		this.PeliculasoSeriesAsociados = peliculasoseriesasociados;
		this.Imagen = imagen;
	}

	public gender(String nombre, String imagen, String peliculasoseriesasociados) {
		super();
		this.Nombre = nombre;
		this.Imagen = imagen;
		this.PeliculasoSeriesAsociados = peliculasoseriesasociados;
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

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public String getPeliculasoSeriesAsociados() {
		return PeliculasoSeriesAsociados;
	}

	public void setPeliculasoSeriesAsociados(String peliculasoSeriesAsociados) {
		PeliculasoSeriesAsociados = peliculasoSeriesAsociados;
	}

}
