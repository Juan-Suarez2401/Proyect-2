package com.superflex.springboot.app.usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.superflex.springboot.app.usuario.models.Usuarios;
import com.superflex.springboot.app.usuario.servicios.IUsuariosService;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
	@Autowired
	private IUsuariosService usuariosService;
	
	@GetMapping("/listar")
	public List<Usuarios> listar(){
		return usuariosService.findAll();
	}
	
	@GetMapping("/ver/{cedula}")
	public Usuarios consulta(@PathVariable Long cedula) {
		return usuariosService.finById(cedula);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Usuarios> save(@RequestBody Usuarios usuarios) {
		return new ResponseEntity<>(usuariosService.save(usuarios), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{cedula}")
	public void delete(@PathVariable("cedula") Long cedula) {
		usuariosService.delete(cedula);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Usuarios usuarios) {
		usuariosService.update(usuarios);
	}
}
