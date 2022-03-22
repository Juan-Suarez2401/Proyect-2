package com.superflex.springboot.app.usuario.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.superflex.springboot.app.usuario.models.Usuarios;

public interface UsuarioRepositorio extends CrudRepository<Usuarios, Long>{

}
