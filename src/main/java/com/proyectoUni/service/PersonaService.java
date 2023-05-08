package com.proyectoUni.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoUni.domain.Persona;
import com.proyectoUni.repository.PersonaRepository;

@Service
public class  PersonaService {
	
	 @Autowired
	    private PersonaRepository personaRepository;

	    public Persona guardarCliente(Persona persona) {
	        return personaRepository.save(persona);
	    }

	    public List<Persona> obtenerTodosLosClientes() {
	        return personaRepository.findAll();
	    }

	    public void eliminarCliente(Long llave) {
	    	personaRepository.deleteById(llave);
	    }

	    public Persona actualizarCliente(Long llave, Persona persona) {
	    	Persona clienteExistente = personaRepository.findById(llave).orElse(null);
	        if (clienteExistente == null) {
	            return null;
	        }
	        clienteExistente.setNombre(persona.getNombre());
	        return personaRepository.save(clienteExistente);
	    }
}
