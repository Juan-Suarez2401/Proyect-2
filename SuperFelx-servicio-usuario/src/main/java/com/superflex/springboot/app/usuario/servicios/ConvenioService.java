package com.superflex.springboot.app.usuario.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superflex.springboot.app.usuario.models.Convenio;
import com.superflex.springboot.app.usuario.repositorio.ConvenioRepository;


@Service
public class ConvenioService implements IConvenio {
	
	@Autowired
	private ConvenioRepository convenioRepository;
	

	@Override
	public List<Convenio> findAll() {

		return (List <Convenio>)convenioRepository.findAll();
	}

	@Override
	public Convenio findById(Long identificacion) {
	
		return convenioRepository.findById(identificacion).orElse(null);
	}

	@Override
	public Convenio save(Convenio convenio) {

		return convenioRepository.save(convenio);
	}

	@Override
	public Convenio update(Convenio convenio) {
		
		return convenioRepository.save(convenio);
	}

	@Override
	public void delete(Long identificacion) {
		convenioRepository.deleteById(identificacion);
		
	}

}
