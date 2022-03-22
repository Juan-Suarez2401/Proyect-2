package com.superflex.springboot.app.usuario.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superflex.springboot.app.usuario.models.Usuarios;
import com.superflex.springboot.app.usuario.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServiceImpl implements IUsuariosService {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@Override
	public List<Usuarios> findAll() {

		return (List<Usuarios>)usuarioRepositorio.findAll();
	}

	@Override
	public Usuarios finById(Long cedula) {

		return usuarioRepositorio.findById(cedula).orElse(null);
	}

	@Override
	public Usuarios save(Usuarios usuarios) {

		return usuarioRepositorio.save(usuarios);
	}

	@Override
	public void delete(Long cedula) {
		usuarioRepositorio.deleteById(cedula);
	}

	@Override
	public Usuarios update(Usuarios usuarios) {
		return usuarioRepositorio.save(usuarios);
	}

}
