package com.gestion.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.modelo.pelicula;
import com.gestion.repositorio.peliculaRepositorio;

@Service
public class peliculaServicio {

	@Autowired
	private peliculaRepositorio repositorio;

	public List<pelicula> listarPeliculas() {
		return repositorio.findAll();
	}

	public void guardarPelicula(pelicula pelicula) {
		repositorio.save(pelicula);
	}

	public pelicula obtenerPeliculaPorId(Integer id) {
		return repositorio.findById(id).get();
	}

	public void eliminarProducto(Integer id) {
		repositorio.deleteById(id);
	}
}
