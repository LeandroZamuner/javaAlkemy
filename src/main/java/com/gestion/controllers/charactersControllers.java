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

import com.gestion.modelo.characters;
import com.gestion.servicio.charactersServicio;


@RestController
public class charactersControllers {

	@Autowired
	private charactersServicio charServicio;
	@GetMapping("/characters")
	public List<characters> listarCharacters(){
		return charServicio.listarCharacters(); 
	}
	
	@GetMapping("/characters/{id}")
	public ResponseEntity<characters> obtenerCharactersporId(@PathVariable Integer id) {
		try {
			characters characters = charServicio.obtenerCharactersPorId(id);
			return new ResponseEntity<characters>(characters,HttpStatus.OK);
		}catch(Exception exception) {
			return new ResponseEntity<characters>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/characters")
	public void guardarCharacters(@RequestBody characters characters) {
		charServicio.guardarCharacters(characters);
	}
	
	@PutMapping("/characters/{id}")
	public ResponseEntity<?> actualizarCharacters(@RequestBody characters characters ,@PathVariable Integer id) {
		try {
			characters charactersExistente = charServicio.obtenerCharactersPorId(id);
			
			charactersExistente.setNombre(characters.getNombre());
			charactersExistente.setPeliculasoSeriesAsociados(characters.getPeliculasoSeriesAsociados());
			charactersExistente.setImagen(characters.getImagen());
			charactersExistente.setHistoria(characters.getHistoria());
			charactersExistente.setId(characters.getId());
			
			charServicio.guardarCharacters(charactersExistente);
			
			return new ResponseEntity<characters>(HttpStatus.OK);
		} catch (Exception exception) {
			return new ResponseEntity<characters>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/characters/{id}")
	public void eliminarCharacters(@PathVariable Integer id) {
		charServicio.eliminarCharacters(id);
	}
}
