package com.gestion.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gestion.modelo.gender;
import com.gestion.repositorio.genderRepository;
import org.springframework.stereotype.Service;

@Service
public class genderService {
	
	@Autowired
	private genderRepository repositorio;

	public List<gender> listarGender() {
		return repositorio.findAll();
	}

	public void guardarGender(gender gender) {
		repositorio.save(gender);
	}

	public gender obtenerGenderPorId(Integer id) {
		return repositorio.findById(id).get();
	}

	public void eliminarGender(Integer id) {
		repositorio.deleteById(id);
	}
}
