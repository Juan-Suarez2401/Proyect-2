package com.superflex.springboot.app.usuario.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.superflex.springboot.app.usuario.models.Convenio;




@Repository
public interface ConvenioRepository extends CrudRepository<Convenio, Long>{

}
