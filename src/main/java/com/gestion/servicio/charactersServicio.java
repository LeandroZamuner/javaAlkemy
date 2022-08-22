package com.gestion.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.modelo.characters;
import com.gestion.repositorio.charactersRepositorio;

@Service
public class charactersServicio {
	
	@Autowired
	private charactersRepositorio repositorio;

	public List<characters> listarCharacters() {
		return repositorio.findAll();
	}

	public void guardarCharacters(characters characters) {
		repositorio.save(characters);
	}

	public characters obtenerCharactersPorId(Integer id) {
		return repositorio.findById(id).get();
	}

	public void eliminarCharacters(Integer id) {
		repositorio.deleteById(id);
	}
}
