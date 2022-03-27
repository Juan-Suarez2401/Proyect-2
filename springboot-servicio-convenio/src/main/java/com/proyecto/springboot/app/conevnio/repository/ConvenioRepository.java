package com.proyecto.springboot.app.conevnio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.springboot.app.conevnio.entity.Convenio;



@Repository
public interface ConvenioRepository extends CrudRepository<Convenio, Long>{

}
