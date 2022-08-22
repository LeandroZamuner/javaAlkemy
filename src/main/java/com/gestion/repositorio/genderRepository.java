package com.gestion.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.modelo.gender;

public interface genderRepository extends JpaRepository<gender, Integer> {
}
