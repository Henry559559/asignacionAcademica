package com.proyectoUni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoUni.domain.Persona;

@Repository
public interface  PersonaRepository extends JpaRepository<Persona, Long>{

	List<Persona> findByNombreContaining(String nombre);
}
