package com.superflex.springboot.app.usuario.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superflex.springboot.app.usuario.models.Giros;
import com.superflex.springboot.app.usuario.repositorio.GiroRepositorio;




@Service
public class GirosServiceImpl implements IGirosService{
	
	@Autowired
	private GiroRepositorio giroRepositorio;

	@Override
	public List<Giros> findAll() {
	
		return (List<Giros>)giroRepositorio.findAll();
	}

	@Override
	public Giros finById(Long id) {
	
		return giroRepositorio.findById(id).orElse(null);
	}

	@Override
	public Giros save(Giros giros) {

		return giroRepositorio.save(giros);
	}

	@Override
	public Giros update(Giros giros) {
		
		return giroRepositorio.save(giros);
	}

	@Override
	public void delete(Long id) {
		giroRepositorio.deleteById(id);
		
	}

}
