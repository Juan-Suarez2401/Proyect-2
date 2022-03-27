package com.superflex.springboot.app.usuario.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.superflex.springboot.app.usuario.models.Convenio;
import com.superflex.springboot.app.usuario.servicios.IConvenio;


@RestController
@RequestMapping("/con")
@CrossOrigin (origins = "http://localhost:4200/")
public class ConvenioController {
	
	@Autowired
	private  IConvenio convenioService;
	
	@GetMapping("/buscar")
	public List<Convenio> buscar(){
		return convenioService.findAll();
		
	}
	
	@GetMapping("/buscarid/{identificacion}")
	public Convenio buscarid(@PathVariable Long identificacion) {
		return convenioService.findById(identificacion);
		
	}
	
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED) 
	public Convenio crear (@RequestBody Convenio convenio) {
		return convenioService.save(convenio);		
	}
	
	@PutMapping("/editar/{identificacion}")
	@ResponseStatus(HttpStatus.CREATED)
	public Convenio editar(@RequestBody Convenio convenio, @PathVariable Long identificacion){
		Convenio conveniodb = convenioService.findById(identificacion);
		
		conveniodb.setIdentificacion(convenio.getIdentificacion());
		conveniodb.setNombre(convenio.getNombre());
		conveniodb.setApellido1(convenio.getApellido1());
		conveniodb.setApellido2(convenio.getApellido2());
		conveniodb.setPeriodo(convenio.getPeriodo());
		conveniodb.setPrograma(convenio.getPrograma());
		conveniodb.setValor_pagar(convenio.getValor_pagar());
		conveniodb.setPin(convenio.getPin());
		conveniodb.setNombre_convenio(convenio.getNombre_convenio());
		
		return convenioService.save(conveniodb);	
	}
	
	@DeleteMapping("/eliminar/{identificacion}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long identificacion) {
		convenioService.delete(identificacion);
	}
	

}
