package com.gestion.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.modelo.pelicula;
import com.gestion.servicio.peliculaServicio;

@RestController
public class peliculaControllers {
	
	@Autowired
	private peliculaServicio servicio;
	
	@GetMapping("/peliculas")
	public List<pelicula> listarPeliculas(){
		return servicio.listarPeliculas(); 
	}
	
	@GetMapping("/peliculas/{id}")
	public ResponseEntity<pelicula> obtenerPeliculaporId(@PathVariable Integer id) {
		try {
			pelicula pelicula = servicio.obtenerPeliculaPorId(id);
			return new ResponseEntity<pelicula>(pelicula,HttpStatus.OK);
		}catch(Exception exception) {
			return new ResponseEntity<pelicula>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/peliculas")
	public void guardarPelicula(@RequestBody pelicula pelicula) {
		servicio.guardarPelicula(pelicula);
	}
	
	@PutMapping("/peliculas/{id}")
	public ResponseEntity<?> actualizarPelicula(@RequestBody pelicula pelicula ,@PathVariable Integer id) {
		try {
			pelicula peliculaExistente = servicio.obtenerPeliculaPorId(id);
			
			peliculaExistente.setTitulo(pelicula.getTitulo());
			peliculaExistente.setFechadeCreacion(pelicula.getFechadeCreacion());
			peliculaExistente.setImagen(pelicula.getImagen());
			peliculaExistente.setPersonajeAsociados(pelicula.getPersonajeAsociados());
			peliculaExistente.setId(pelicula.getId());
			
			servicio.guardarPelicula(peliculaExistente);
			
			return new ResponseEntity<pelicula>(HttpStatus.OK);
		} catch (Exception exception) {
			return new ResponseEntity<pelicula>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void eliminarPelicula(@PathVariable Integer id) {
		servicio.eliminarProducto(id);
	}
	
}
