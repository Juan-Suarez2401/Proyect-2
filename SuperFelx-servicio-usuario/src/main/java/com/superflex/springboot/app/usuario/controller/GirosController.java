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
import com.superflex.springboot.app.usuario.models.Giros;

import com.superflex.springboot.app.usuario.servicios.IGirosService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class GirosController {
	
	@Autowired
	private IGirosService girosService;
	
	@GetMapping("/Buscar")
	public List<Giros> listar(){
		return girosService.findAll();
	}
	
	@GetMapping("/GiroBuscar/{cedulaBeneficiaro}")
	public Giros GiroBuscar(@PathVariable Long cedulaBeneficiaro) {
		return girosService.finById(cedulaBeneficiaro);
	}
	
	@PostMapping("/SaveGiros")
	public ResponseEntity<Giros> SaveGiro(@RequestBody Giros giros){
		return new ResponseEntity<>(girosService.save(giros),HttpStatus.CREATED);
	}
	
	@PutMapping("/UpdateGiro")
	public void GiroUpdate(@RequestBody Giros giros) {
		girosService.update(giros);
	}
	
	
	@DeleteMapping("/DeleteGiro/{cedulaBeneficiaro}")
	public void delete(@PathVariable ("cedulaBeneficiaro")Long cedulaBeneficiaro) {
		girosService.delete(cedulaBeneficiaro);
	}
	
	

}
