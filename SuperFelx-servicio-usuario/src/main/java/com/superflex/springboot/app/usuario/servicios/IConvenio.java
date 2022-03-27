package com.superflex.springboot.app.usuario.servicios;

import java.util.List;

import com.superflex.springboot.app.usuario.models.Convenio;





public interface IConvenio {
	public List<Convenio> findAll();
	public Convenio findById(Long identificacion);
	public Convenio save(Convenio convenio);
	public Convenio update(Convenio convenio);
	void delete(Long identificacion);
	

}
