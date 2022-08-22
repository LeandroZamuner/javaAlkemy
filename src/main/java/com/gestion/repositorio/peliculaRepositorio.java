package com.gestion.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.modelo.pelicula;

public interface peliculaRepositorio extends JpaRepository<pelicula, Integer> {
}
