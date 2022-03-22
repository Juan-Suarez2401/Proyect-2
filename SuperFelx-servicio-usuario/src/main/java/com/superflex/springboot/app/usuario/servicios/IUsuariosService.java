package com.superflex.springboot.app.usuario.servicios;

import java.util.List;

import com.superflex.springboot.app.usuario.models.Usuarios;

public interface IUsuariosService {

	public List<Usuarios> findAll();
	public Usuarios finById(Long cedula);
	public Usuarios save (Usuarios usuarios);
	public Usuarios update (Usuarios usuarios);
	void delete(Long cedula);
}
