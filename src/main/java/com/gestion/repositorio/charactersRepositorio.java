package com.gestion.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.modelo.characters;

public interface charactersRepositorio extends JpaRepository<characters, Integer> {
}