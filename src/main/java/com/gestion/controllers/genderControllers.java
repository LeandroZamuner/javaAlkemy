package com.gestion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.modelo.gender;
import com.gestion.servicio.genderService;

@Component
@RestController

public class genderControllers {
	
	@Autowired
	private genderService servicio;
	
	@GetMapping("/gender")
	public List<gender> listarGender(){
		return servicio.listarGender();
	}
	
	@GetMapping("/gender/{id}")
	public ResponseEntity<gender> obtenerGenderporId(@PathVariable Integer id) {
		try {
			gender gender = servicio.obtenerGenderPorId(id);
			return new ResponseEntity<gender>(gender,HttpStatus.OK);
		}catch(Exception exception) {
			return new ResponseEntity<gender>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/gender")
	public void guardarGender(@RequestBody gender gender) {
		servicio.guardarGender(gender);
	}
	
	@PutMapping("/gender/{id}")
	public ResponseEntity<?> actualizarGender(@RequestBody gender gender ,@PathVariable Integer id) {
		try {
			gender genderExistente = servicio.obtenerGenderPorId(id);
			
			genderExistente.setNombre(gender.getNombre());
			genderExistente.setImagen(gender.getImagen());
			genderExistente.setPeliculasoSeriesAsociados(gender.getPeliculasoSeriesAsociados());
			genderExistente.setId(gender.getId());
			
			servicio.guardarGender(genderExistente);
			
			return new ResponseEntity<gender>(HttpStatus.OK);
		} catch (Exception exception) {
			return new ResponseEntity<gender>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/gender/{id}")
	public void eliminarGender(@PathVariable Integer id) {
		servicio.eliminarGender(id);
	}
}
