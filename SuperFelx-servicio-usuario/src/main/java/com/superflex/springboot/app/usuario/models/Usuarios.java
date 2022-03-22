package com.superflex.springboot.app.usuario.models;




import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "usuarios")
public class Usuarios {
	
	@Id
	private Long cedula;
	private String tipo_cedula;
	private String nombre;
	public Long getCedula() {
		return cedula;
	}
	public void setCedula(Long cedula) {
		this.cedula = cedula;
	}
	public String getTipo_cedula() {
		return tipo_cedula;
	}
	public void setTipo_cedula(String tipo_cedula) {
		this.tipo_cedula = tipo_cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
