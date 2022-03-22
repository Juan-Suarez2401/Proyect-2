package com.superflex.springboot.app.usuario.servicios;

import java.util.List;

import com.superflex.springboot.app.usuario.models.Giros;



public interface IGirosService {
	
	public List<Giros> findAll();
	public Giros finById(Long id);
	public Giros save (Giros giros);
	public Giros update (Giros giros);
	void delete(Long id);

}
