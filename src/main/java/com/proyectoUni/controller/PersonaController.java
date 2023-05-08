package com.proyectoUni.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoUni.domain.Persona;
import com.proyectoUni.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	@Autowired
    private PersonaService personaService;

    @PostMapping
    public ResponseEntity<Persona> guardarCliente(@RequestBody Persona persona) {
    	Persona clienteGuardado = personaService.guardarCliente(persona);
        return new ResponseEntity<>(clienteGuardado, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Persona>> obtenerTodosLosClientes() {
        List<Persona> clientes = personaService.obtenerTodosLosClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @DeleteMapping("/{llave}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable Long llave) {
    	personaService.eliminarCliente(llave);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/{idCliente}")
    public ResponseEntity<Persona> actualizarCliente(@PathVariable Long llave, @RequestBody Persona Persona) {
    	Persona clienteActualizado = personaService.actualizarCliente(llave, Persona);
        if (clienteActualizado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(clienteActualizado, HttpStatus.OK);
    }
}
