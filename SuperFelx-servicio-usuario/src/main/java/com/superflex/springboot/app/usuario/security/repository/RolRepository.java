package com.superflex.springboot.app.usuario.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.superflex.springboot.app.usuario.security.entity.Rol;
import com.superflex.springboot.app.usuario.security.enums.RolNombre;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{

	 Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
