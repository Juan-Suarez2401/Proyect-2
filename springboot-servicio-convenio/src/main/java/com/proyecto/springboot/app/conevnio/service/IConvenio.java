package com.proyecto.springboot.app.conevnio.service;

import java.util.List;

import com.proyecto.springboot.app.conevnio.entity.Convenio;



public interface IConvenio {
	public List<Convenio> findAll();
	public Convenio findById(Long identificacion);
	public Convenio save(Convenio convenio);
	public Convenio update(Convenio convenio);
	void delete(Long identificacion);
	

}
